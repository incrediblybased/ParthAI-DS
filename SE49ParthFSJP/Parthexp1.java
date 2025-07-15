import java.util.Scanner;

class Student {
    String name;
    int rollNumber;
    float marks;

    void inputDetails(Scanner sc) {
        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter roll no. : ");
        rollNumber = sc.nextInt();

        System.out.print("Enter marks: ");
        marks = sc.nextFloat();

        sc.nextLine(); 
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println();
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        Student student1 = new Student();
        Student student2 = new Student();

        System.out.println("Enter details for Student 1:");
        student1.inputDetails(sc);

        System.out.println("\nEnter details for Student 2:");
        student2.inputDetails(sc);

        System.out.println("\nStudent Details:");
        student1.displayDetails();
        student2.displayDetails();

        sc.close(); 
    }
}
