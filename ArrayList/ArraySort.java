import java.util.*;

class Student {
    int rollno, total;
    String Sname, branch;
    Double cgpa;

    Student(int rno, String name, String br, Double c, int t) {
        rollno = rno;
        Sname = name;
        branch = br;
        cgpa = c;
        total = t;
    }
}

// Ascending Comparators
class AseSortByROllno implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.rollno > s2.rollno)
            return 1;
        else if (s1.rollno < s2.rollno)
            return -1;
        else
            return 0;
    }
}

class AseSortByCGPA implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.cgpa < s2.cgpa)
            return -1;
        else if (s1.cgpa > s2.cgpa)
            return 1;
        else
            return 0;
    }
}

class AseSortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.Sname.compareTo(s2.Sname);
    }
}

class AseSortByTotal implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.total, s2.total);
    }
}

class AseSortByBranch implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.branch.compareTo(s2.branch);
    }
}

// Descending Comparators
class DeSortByRollno implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.rollno < s2.rollno)
            return 1;
        else if (s1.rollno > s2.rollno)
            return -1;
        else
            return 0;
    }
}

class DeSortByCGPA implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        if (s1.cgpa < s2.cgpa)
            return 1;
        else if (s1.cgpa > s2.cgpa)
            return -1;
        else
            return 0;
    }
}

class DeSortByName implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.Sname.compareTo(s1.Sname);
    }
}

class DeSortByTotal implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.total, s1.total);
    }
}

class DeSortByBranch implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s2.branch.compareTo(s1.branch);
    }
}

public class ArraySort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");

            System.out.print("Enter Roll No: ");
            int rollno = scanner.nextInt();

            System.out.print("Enter Name: ");
            String name = scanner.next();

            System.out.print("Enter Branch: ");
            String branch = scanner.next();

            System.out.print("Enter CGPA: ");
            double cgpa = scanner.nextDouble();

            System.out.print("Enter Total Marks: ");
            int total = scanner.nextInt();

            students[i] = new Student(rollno, name, branch, cgpa, total);
        }

        scanner.close();

        System.out.println("\nOriginal List:");
        printList(students);

        System.out.println("\nAscending by Roll No:");
        Arrays.sort(students, new AseSortByROllno());
        printList(students);

        System.out.println("\nAscending by CGPA:");
        Arrays.sort(students, new AseSortByCGPA());
        printList(students);

        System.out.println("\nAscending by Name:");
        Arrays.sort(students, new AseSortByName());
        printList(students);

        System.out.println("\nAscending by Total:");
        Arrays.sort(students, new AseSortByTotal());
        printList(students);

        System.out.println("\nAscending by Branch:");
        Arrays.sort(students, new AseSortByBranch());
        printList(students);

        System.out.println("\nDescending by Roll No:");
        Arrays.sort(students, new DeSortByRollno());
        printList(students);

        System.out.println("\nDescending by CGPA:");
        Arrays.sort(students, new DeSortByCGPA());
        printList(students);

        System.out.println("\nDescending by Name:");
        Arrays.sort(students, new DeSortByName());
        printList(students);

        System.out.println("\nDescending by Total:");
        Arrays.sort(students, new DeSortByTotal());
        printList(students);

        System.out.println("\nDescending by Branch:");
        Arrays.sort(students, new DeSortByBranch());
        printList(students);
    }

    public static void printList(Student[] list) {
        for (Student s : list) {
            System.out.println(s.rollno + " " + s.Sname + " " + s.branch + " " + s.cgpa + " " + s.total);
        }
    }
}
