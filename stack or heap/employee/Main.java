import java.util.Scanner;

class Employee {
    int salary;                              // instance field -> heap (inside Employee object)

    void display(Scanner sc) {
        System.out.print("Enter bonus: ");
        int bonus = sc.nextInt();            // local variable -> stack frame of display()

        System.out.println("\nInside display() Method:");
        System.out.println("Salary (Instance Variable): " + salary);
        System.out.println("Bonus (Local Variable): " + bonus);

        // Local inner class declared inside the method
        class Report {
            void show() {                    // runs in its own stack frame
                System.out.println("Report: Employee salary is " + Employee.this.salary
                        + ", bonus is " + bonus);
            }
        }

        Report r = new Report();             // r on stack, Report object on heap
        System.out.println("\nReport Object Created");
        System.out.println("Report Identity Hash Code: " + System.identityHashCode(r));
        r.show();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Employee e = new Employee();         // e on stack, object on heap
        System.out.print("Enter salary: ");
        e.salary = sc.nextInt();

        System.out.println("\nEmployee Object Created");
        System.out.println("Employee Identity Hash Code: " + System.identityHashCode(e));

        e.display(sc);

        System.out.println("\nMemory Concept:");
        System.out.println("Employee object -> Heap");
        System.out.println("Report object -> Heap");
        System.out.println("salary -> Instance field");
        System.out.println("bonus -> Local variable in display()");
        System.out.println("show() -> Executes in its own method frame");
    }
}