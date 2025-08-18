import java.util.*;

// Student class
class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getCgpa() {
        return cgpa;
    }
}

class Priorities {
    public List<Student> getStudents(List<String> events) {
        PriorityQueue<Student> StudentList = new PriorityQueue<>(
                (s1, s2) -> {
                    if (s1.getCgpa() != s2.getCgpa())
                        return Double.compare(s2.getCgpa(), s1.getCgpa());
                    if (!s1.getName().equals(s2.getName()))
                        return s1.getName().compareTo(s2.getName());
                    return Integer.compare(s1.getId(), s2.getId());
                }
        );

        for (String event : events) {
            String[] parts = event.split(" ");
            if (parts[0].equals("ENTER")) {
                String name = parts[1];
                double cgpa = Double.parseDouble(parts[2]);
                int id = Integer.parseInt(parts[3]);
                Student student = new Student(id, name, cgpa);
                StudentList.add(student);
            } else if (parts[0].equals("SERVED")) {
                StudentList.poll();
            }
        }

        List<Student> result = new ArrayList<>();
        while (!StudentList.isEmpty()) {
            result.add(StudentList.poll());
        }
        return result;
    }
}
