class Problem18 {

    final double interestRate = 5.0;

    void calculateInterest(double amount) {
        double interest = (amount * interestRate) / 100;
        System.out.println("Amount: " + amount + " Interest: " + interest);
    }

    public static void main(String[] args) {
        Problem18 b = new Problem18();

        b.calculateInterest(10000);
        b.calculateInterest(25000);
        b.calculateInterest(50000);
    }
}
