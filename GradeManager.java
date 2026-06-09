import java.util.ArrayList;

public class GradeManager {
    private ArrayList<Student> students;

    public GradeManager() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student added successfully!");
    }

    public void displayAllStudents() {
        if (students.isEmpty()) {
            System.out.println("No students in the system.");
            return;
        }
        System.out.println("\n--- All Students ---");
        for (Student s : students) {
            System.out.println(s);
        }
    }

    public void searchStudentById(String id) {
        for (Student s : students) {
            if (s.getStudentId().equals(id)) {
                System.out.println("Student Found: " + s);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void calculateAverage() {
        if (students.isEmpty()) {
            System.out.println("No students to calculate average.");
            return;
        }
        double total = 0;
        for (Student s : students) {
            total += s.getMarks();
        }
        double average = total / students.size();
        System.out.println("Average Marks: " + String.format("%.2f", average));
    }
}