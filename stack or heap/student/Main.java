import java.util.Scanner;

class Student {
    int age;                          // instance variable -> inside heap object

    void display(Scanner sc) {
        System.out.print("Marks: ");
        int marks = sc.nextInt();     // local variable -> stack frame of display()
        System.out.println("Instance Variable (age): " + age);
        System.out.println("Local Variable (marks): " + marks);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student s = new Student();    // s on stack, object on heap
        System.out.print("Age: ");
        s.age = sc.nextInt();

        System.out.println("Student Object Created");
        System.out.println("Object Identity Hash Code: " + System.identityHashCode(s));
        s.display(sc);
    }
}