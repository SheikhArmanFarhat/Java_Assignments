class Person {
    String name;
    int age;
  
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class Problem1 {
    public static void main(String[] args) {

        Person p1 = new Person("Prajwal", 20);
        Person p2 = new Person("Katkar", 19);

        p1.display();
        p2.display();
    }
}
