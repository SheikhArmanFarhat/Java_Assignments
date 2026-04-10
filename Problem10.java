interface Bank {
    double getInterestRate();
}

class SBI implements Bank {
    public double getInterestRate() {
        return 6.5;
    }
}

class HDFC implements Bank {
    public double getInterestRate() {
        return 7.0;
    }
}

class ICICI implements Bank {
    public double getInterestRate() {
        return 6.8;
    }
}

public class Problem10 {
    public static void main(String[] args) {

        SBI s1 = new SBI();
        HDFC h1 = new HDFC();
        ICICI i1 = new ICICI();

        System.out.println("SBI Interest Rate: " + s1.getInterestRate() + "%");
        System.out.println("HDFC Interest Rate: " + h1.getInterestRate() + "%");
        System.out.println("ICICI Interest Rate: " + i1.getInterestRate() + "%");
    }
}
