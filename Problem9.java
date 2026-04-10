class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }
}

public class Problem9 {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        int result1 = calc.add(5, 10);
        int result2 = calc.add(5, 10, 15);
        double result3 = calc.add(5.5, 2.3);

        System.out.println("Addition of two integers: " + result1);
        System.out.println("Addition of three integers: " + result2);
        System.out.println("Addition of two doubles: " + result3);
    }
}
