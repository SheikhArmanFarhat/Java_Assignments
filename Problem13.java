abstract class Employee {
    String name;
    int id;

    Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    abstract double calculateBonus();
}

class Manager extends Employee {
    double salary;

    Manager(String name, int id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    double calculateBonus() {
        return salary * 0.20;
    }
}

class Developer extends Employee {
    double salary;
    double projectIncentive;

    Developer(String name, int id, double salary, double projectIncentive) {
        super(name, id);
        this.salary = salary;
        this.projectIncentive = projectIncentive;
    }

    double calculateBonus() {
        return salary * 0.10 + projectIncentive;
    }
}

public class Problem13 {
    public static void main(String[] args) {
        Employee e1 = new Manager("Rahul", 101, 80000);
        Employee e2 = new Developer("Ankit", 102, 60000, 5000);

        System.out.println("Manager Bonus: " + e1.calculateBonus());
        System.out.println("Developer Bonus: " + e2.calculateBonus());
    }
}
