import java.util.*;

class Student {
    String name;
    double cgpa;

    Student(String name, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String toString() {
        return name + " (" + cgpa + ")";
    }
}

public class StudentPriorityQueue {

    // 1. Min Priority Queue based on CGPA
    public static void minPQStudents(List<Student> students) {
        PriorityQueue<Student> minPQ = new PriorityQueue<>(Comparator.comparingDouble(s -> s.cgpa));
        minPQ.addAll(students);
        System.out.println("Min Priority Queue (Ascending CGPA):");
        while (!minPQ.isEmpty()) {
            System.out.println(minPQ.poll());
        }
    }

    // 2. Max Priority Queue based on CGPA
    public static void maxPQStudents(List<Student> students) {
        PriorityQueue<Student> maxPQ = new PriorityQueue<>((s1, s2) -> Double.compare(s2.cgpa, s1.cgpa));
        maxPQ.addAll(students);
        System.out.println("Max Priority Queue (Descending CGPA):");
        while (!maxPQ.isEmpty()) {
            System.out.println(maxPQ.poll());
        }
    }

    // 3. ArrayList sorted ascending using Min PQ
    public static List<Student> sortAscendingUsingMinPQ(List<Student> students) {
        PriorityQueue<Student> minPQ = new PriorityQueue<>(Comparator.comparingDouble(s -> s.cgpa));
        minPQ.addAll(students);
        List<Student> sorted = new ArrayList<>();
        while (!minPQ.isEmpty()) {
            sorted.add(minPQ.poll());
        }
        return sorted;
    }

    // 4. ArrayList sorted descending using Max PQ
    public static List<Student> sortDescendingUsingMaxPQ(List<Student> students) {
        PriorityQueue<Student> maxPQ = new PriorityQueue<>((s1, s2) -> Double.compare(s2.cgpa, s1.cgpa));
        maxPQ.addAll(students);
        List<Student> sorted = new ArrayList<>();
        while (!maxPQ.isEmpty()) {
            sorted.add(maxPQ.poll());
        }
        return sorted;
    }

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Siva", 8.5),
            new Student("Raju", 9.1),
            new Student("Sai", 7.8),
            new Student("Kiran", 8.9)
        );

        minPQStudents(students);
        System.out.println();

        maxPQStudents(students);
        System.out.println();

        System.out.println("ArrayList sorted ascending (Min PQ): " + sortAscendingUsingMinPQ(students));
        System.out.println("ArrayList sorted descending (Max PQ): " + sortDescendingUsingMaxPQ(students));
    }
}
