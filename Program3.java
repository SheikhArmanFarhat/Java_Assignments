import java.util.Scanner;

class Problem3 {
    int CarId;
    String CarType;
    float Rent;

    void GetCar(int id, String type) {
        CarId = id;
        CarType = type.toLowerCase();
    }

    float GetRent() {
        if (CarType.equals("small car")) {
            Rent = 1000;
        }
        else if (CarType.equals("van")) {
            Rent = 800;
        }
        else if (CarType.equals("suv")) {
            Rent = 2500;
        }
        return Rent;
    }

    void ShowCar() {
        System.out.println("Car ID: " + CarId);
        System.out.println("Car Type: " + CarType);
        System.out.println("Rent: " + Rent);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Problem3 c = new Problem3();

        System.out.print("Enter Car ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Car Type: ");
        String type = sc.nextLine();

        c.GetCar(id, type);
        c.GetRent();
        c.ShowCar();
    }
}
