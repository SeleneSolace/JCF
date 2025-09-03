import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nums = new int[10];
        int target = sc.nextInt();
        int start = 0;
        int end = nums.length-1;
        int ans;
        while(start<=end){
            int mid = start+ (end-start)/2;
            if(nums[mid] == target) ans= mid;
            if(nums[mid]<target) start = mid+1;
            else end = mid-1;
        }
    }
}
