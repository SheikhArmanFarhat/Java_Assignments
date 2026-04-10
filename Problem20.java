class Problem20 {

    String name;
    double salary;

    Problem20(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Salary: " + salary);
    }

    public static void main(String[] args) {

        Problem20 e1 = new Problem20("Prajwal", 50000);
        Problem20 e2 = new Problem20("Rahul", 60000);

        e1.display();
        e2.display();
    }
}
