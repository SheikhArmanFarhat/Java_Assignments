class Staff {
    void work() {
        System.out.println("Staff members perform hospital duties.");
    }
}

class Doctor extends Staff {
    void work() {
        System.out.println("Doctor treats patients and prescribes medicines.");
    }
}

class Nurse extends Staff {
    void work() {
        System.out.println("Nurse assists doctors and takes care of patients.");
    }
}

class Receptionist extends Staff {
    void work() {
        System.out.println("Receptionist manages appointments and patient records.");
    }
}

public class Problem16 {
    public static void main(String[] args) {

        Staff s1 = new Doctor();
        Staff s2 = new Nurse();
        Staff s3 = new Receptionist();

        s1.work();
        s2.work();
        s3.work();
    }
}
