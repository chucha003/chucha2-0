import java.util.Arrays;

public class TestStudentSorting {
    public static void main(String[] args) {
        Student[] students = {
                new Student("S123", "John", 3.5),
                new Student("S456", "Alice", 4.0),
                new Student("S789", "Bob", 3.7)
        };

        System.out.println("Before sorting:");
        Arrays.stream(students).forEach(System.out::println);

        // Sorting by iDNumber using insertion sort
        Arrays.sort(students, (s1, s2) -> s1.getiDNumber().compareTo(s2.getiDNumber()));

        System.out.println("\nAfter sorting by iDNumber:");
        Arrays.stream(students).forEach(System.out::println);
    }
}

class Student {
    private String iDNumber;
    private String name;
    private double GPA;

    public Student(String iDNumber, String name, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public String getiDNumber() {
        return iDNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber='" + iDNumber + '\'' +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }
}