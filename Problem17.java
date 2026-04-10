class Employee {
    String name;
    int id;

    static int employeeCount = 0;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
        employeeCount++;
    }

    static void displayEmployeeCount() {
        System.out.println("Total Employees: " + employeeCount);
    }
}

public class Problem17 {
    public static void main(String[] args) {

        Employee e1 = new Employee("Amit", 101);
        Employee e2 = new Employee("Riya", 102);
        Employee e3 = new Employee("Rahul", 103);

        Employee.displayEmployeeCount();
    }
}
