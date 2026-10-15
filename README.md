When to Stack and When to Heap: Java Lab

**Name:** RIDHIKANTA SARKAR SUMIT<br>
**Student ID:** IT24045<br>
**Course:** SEPM-001

---

## Overview

This lab demonstrates how Java uses **stack** and **heap** memory:

| Thing | Where it lives |
|---|---|
| Objects created with `new` | Heap |
| Instance variables | Heap (inside their object) |
| Local variables and parameters | Stack (one frame per method call) |
| Reference variables (`s`, `e`, `r`) | Stack (they point to heap objects) |

`System.identityHashCode()` is used to show object identity. It is **not** the real memory address, and its value changes between runs.

---

## Problem 1: Student (Basic)

**Files:** `problem1/Main.java`

- `Student` class with instance variable `age` (heap, inside the object).
- `display()` method with local variable `marks` (stack frame of `display()`).
- `main()` creates the `Student` object and prints its identity hash code.

**Sample input**
```
Age: 20
Marks: 85
```

**Sample output**
```
Student Object Created
Object Identity Hash Code: 1163157884
Instance Variable (age): 20
Local Variable (marks): 85
```

---

## Problem 2: Employee with Local Inner Class (Intermediate)

**Files:** `problem2/Main.java`

- `Employee` class with instance variable `salary` and method `display()`.
- `display()` declares local variable `bonus` and a local inner class `Report` with method `show()`.
- Identity hash codes are printed for both the `Employee` and `Report` objects.

**Sample input**
```
Enter salary: 30000
Enter bonus: 5000
```

**Sample output**
```
Employee Object Created
Employee Identity Hash Code: 12345678

Inside display() Method:
Salary (Instance Variable): 30000
Bonus (Local Variable): 5000

Report Object Created
Report Identity Hash Code: 87654321
Report: Employee salary is 30000, bonus is 5000

Memory Concept:
Employee object -> Heap
Report object -> Heap
salary -> Instance field
bonus -> Local variable in display()
show() -> Executes in its own method frame
```

---

## How to Run

**Requirements:** JDK 17 or newer (check with `java -version` and `javac -version`).

```bash
cd problem1        # or problem2
javac Main.java
java Main
```

Or run online (e.g., OnlineGDB or Replit) with the file named `Main.java`.

---

## Memory Concepts Summary

- `new Student()` / `new Employee()` / `new Report()` create objects on the **heap**.
- `age` and `salary` are instance fields, stored **inside** their heap objects.
- `marks` and `bonus` are local variables, stored in the **stack frame** of `display()`.
- `show()` runs in its **own stack frame** when called.
- Reference variables live on the stack and point to the objects on the heap.

---

## Note

Identity hash codes are illustrative and differ between executions.
