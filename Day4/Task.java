package Day4project;
import java.util.*;


	class Student {
	    int id;
	    String name;
	    double grade;

	    Student(int id, String name, double grade) {
	        this.id = id;
	        this.name = name;
	        this.grade = grade;
	    }
	}

	public class Task {
	    static Map<Integer, Student> students = new HashMap<>();
	    static Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        while (true) {
	            System.out.println("1. Add Student");
	            System.out.println("2. View Students");
	            System.out.println("3. Search Student");
	            System.out.println("4. Update Student");
	            System.out.println("5. Remove Student");
	            System.out.println("6. Exit");

	            System.out.print("Choose an option: ");
	            int option = scanner.nextInt();

	            switch (option) {
	                case 1:
	                    addStudent();
	                    break;
	                case 2:
	                    viewStudents();
	                    break;
	                case 3:
	                    searchStudent();
	                    break;
	                case 4:
	                    updateStudent();
	                    break;
	                case 5:
	                    removeStudent();
	                    break;
	                case 6:
	                    System.exit(0);
	                    break;
	                default:
	                    System.out.println("Invalid option. Please choose again.");
	            }
	        }
	    }

	    static void addStudent() {
	        System.out.print("Enter student ID: ");
	        int id = scanner.nextInt();
	        System.out.print("Enter student name: ");
	        String name = scanner.next();
	        System.out.print("Enter student grade: ");
	        double grade = scanner.nextDouble();

	        students.put(id, new Student(id, name, grade));
	        System.out.println("Student added successfully!");
	    }

	    static void viewStudents() {
	        for (Student student : students.values()) {
	            System.out.println("ID: " + student.id + ", Name: " + student.name + ", Grade: " + student.grade);
	        }
	    }

	    static void searchStudent() {
	        System.out.print("Enter student ID or name: ");
	        String query = scanner.next();

	        for (Student student : students.values()) {
	            if (String.valueOf(student.id).equals(query) || student.name.equals(query)) {
	                System.out.println("ID: " + student.id + ", Name: " + student.name + ", Grade: " + student.grade);
	                return;
	            }
	        }

	        System.out.println("Student not found!");
	    }

	    static void updateStudent() {
	        System.out.print("Enter student ID: ");
	        int id = scanner.nextInt();

	        if (students.containsKey(id)) {
	            System.out.print("Enter new student name: ");
	            String name = scanner.next();
	            System.out.print("Enter new student grade: ");
	            double grade = scanner.nextDouble();

	            students.put(id, new Student(id, name, grade));
	            System.out.println("Student updated successfully!");
	        } else {
	            System.out.println("Student not found!");
	        }
	    }

	    static void removeStudent() {
	        System.out.print("Enter student ID: ");
	        int id = scanner.nextInt();

	        if (students.containsKey(id)) {
	            students.remove(id);
	            System.out.println("Student removed successfully!");
	        } else {
	            System.out.println("Student not found!");
	        }
	    }
	}


	