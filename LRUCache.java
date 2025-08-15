import java.util.HashMap;
import java.util.Map;

class LRUCache {
    class Node{
        int key,value;
        Node prev,next;
        Node(int k,int v){key =k ;value = v;}
    }
    private int capacity;
    private Map<Integer,Node> map;
    private Node head,tail;
    public LRUCache(int capacity){
        this.capacity = capacity;
        map = new HashMap<>();
        head = new Node(0,0);
        tail = new Node(0,0);
        head.next = tail;
        tail.prev = head;
    }
    public int get(int key){
        if(!map.containsKey(key)) return -1;

        Node node = map.get(key);
        movetohead(node);
        return node.value;
    }
    public void put(int key,int value){
        if(map.containsKey(key)){
            Node node = map.get(key);
            node.value = value;
            movetohead(node);
        }else{
            Node node = new Node(key,value);
           map.put(key,node);
            addtohead(node);
        }

        if(map.size()>capacity){
            Node lru = tail.prev;
            removeNode(lru);
            map.remove(lru.key);
        }
    }
    public void removeNode(Node node){
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }
    public void addtohead(Node node){
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }
    public void movetohead(Node node){
        removeNode(node);
        addtohead(node);
    }
}
