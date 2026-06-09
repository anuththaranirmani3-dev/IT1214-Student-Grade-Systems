import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        GradeManager gm = new GradeManager();
        int choice;

        do {
            System.out.println("\n=== Student Grade Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Display All Students");
            System.out.println("3. Search Student by ID");
            System.out.println("4. Calculate Average Marks");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Student ID: ");
                    String id = sc.nextLine();
                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Marks: ");
                    double marks = sc.nextDouble();
                    sc.nextLine();
                    gm.addStudent(new Student(id, name, marks));
                    break;
                case 2:
                    gm.displayAllStudents();
                    break;
                case 3:
                    System.out.print("Enter Student ID to search: ");
                    String searchId = sc.nextLine();
                    gm.searchStudentById(searchId);
                    break;
                case 4:
                    gm.calculateAverage();
                    break;
                case 5:
                    System.out.println("Exiting... Thank you!");
                    break;
                default:
                    System.out.println("Invalid choice! Please enter 1-5");
            }
        } while (choice != 5);
        sc.close();
    }
}