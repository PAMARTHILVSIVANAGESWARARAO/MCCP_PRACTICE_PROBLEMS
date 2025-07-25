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

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> al = new ArrayList<>();

        System.out.print("Enter number of students: ");
        int n = scanner.nextInt();

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

            Student s1 = new Student(rollno, name, branch, cgpa, total);
            al.add(s1);
        }

        scanner.close(); // ✅ Close scanner to avoid green underline

        System.out.println("\nOriginal List:");
        printList(al);

        System.out.println("\nAscending by Roll No:");
        Collections.sort(al, new AseSortByROllno());
        printList(al);

        System.out.println("\nAscending by CGPA:");
        Collections.sort(al, new AseSortByCGPA());
        printList(al);

        System.out.println("\nAscending by Name:");
        Collections.sort(al, new AseSortByName());
        printList(al);

        System.out.println("\nAscending by Total:");
        Collections.sort(al, new AseSortByTotal());
        printList(al);

        System.out.println("\nAscending by Branch:");
        Collections.sort(al, new AseSortByBranch());
        printList(al);

        System.out.println("\nDescending by Roll No:");
        Collections.sort(al, new DeSortByRollno());
        printList(al);

        System.out.println("\nDescending by CGPA:");
        Collections.sort(al, new DeSortByCGPA());
        printList(al);

        System.out.println("\nDescending by Name:");
        Collections.sort(al, new DeSortByName());
        printList(al);

        System.out.println("\nDescending by Total:");
        Collections.sort(al, new DeSortByTotal());
        printList(al);

        System.out.println("\nDescending by Branch:");
        Collections.sort(al, new DeSortByBranch());
        printList(al);
    }

    public static void printList(ArrayList<Student> list) {
        for (Student s : list) {
            System.out.println(s.rollno + " " + s.Sname + " " + s.branch + " " + s.cgpa + " " + s.total);
        }
    }
}
