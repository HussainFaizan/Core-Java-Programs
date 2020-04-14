import java.util.*;

class Employee {
    int empid;
    String ename;
    double esal;

    Employee() {
        System.out.println("Welcome To Employee Profile");
    }

    Scanner sc = new Scanner(System.in);

    void input() {
        System.out.println("Enter  Employee ID::");
        empid = sc.nextInt();

        System.out.println("Enter a Employee Name:");
        ename = sc.next();

        System.out.println("Enter a Employee Salary:");
        esal = sc.nextDouble();
    }

    void display() {
        this.input();
        System.out.println("The Employee ID is::" + empid);
        System.out.println("The Employee Ename is::" + ename);
        System.out.println("The Employee ESalary is::" + esal);

    }

}

class Manager {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.display();
    }
}