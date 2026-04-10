abstract class Ride {
    int distance;

    Ride(int distance) {
        this.distance = distance;
    }

    abstract int calculateFare();
}

class BikeRide extends Ride {
    BikeRide(int distance) {
        super(distance);
    }

    int calculateFare() {
        return distance * 5;
    }
}

class AutoRide extends Ride {
    AutoRide(int distance) {
        super(distance);
    }

    int calculateFare() {
        return distance * 8;
    }
}

class CarRide extends Ride {
    CarRide(int distance) {
        super(distance);
    }

    int calculateFare() {
        return distance * 12;
    }
}

public class Problem15 {
    public static void main(String[] args) {

        Ride[] rides = new Ride[3];

        rides[0] = new BikeRide(10);
        rides[1] = new AutoRide(10);
        rides[2] = new CarRide(10);

        for (Ride r : rides) {
            System.out.println("Fare: ₹" + r.calculateFare());
        }
    }
}
