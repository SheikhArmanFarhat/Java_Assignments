import java.util.Scanner;
public class Program4{
    int rno;
    String name;
    double charges;
    int days;


    double Computer(){
        double ammount = days * charges;
        if (ammount>11000){
            ammount = 1.02*days*charges;
        }
        return ammount;
    }
    void Getinfo(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Roll no: ");
        rno = in.nextInt();
        System.out.print("Enter Name: ");
        name = in.next();
        System.out.print("Enter charges: ");
        charges = in.nextDouble();
        System.out.print("Enter days: ");
        days = in.nextInt();

    }
    void Display(){
    double ammount = Computer();
    System.out.println("Roll no "+ rno);
    System.out.println("Customer Name: " + name);
    System.out.println("Charges per Day: " + charges);
    System.out.println("Days: " + days);
    System.out.println("Amount: " + ammount);
        }
        public static void main(String[] args) {
            Program4 x = new Program4();
            x.Getinfo();
            x.Display();

        }
}
