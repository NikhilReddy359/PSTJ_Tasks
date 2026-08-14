import java.util.*;
import java.util.stream.*;

abstract class Vehicle {
    abstract int fare(int d);
}

class Bike extends Vehicle {
    public int fare(int d) { return d * 5; }
}

class Auto extends Vehicle {
    public int fare(int d) { return d * 12; }
}

class Cab extends Vehicle {
    public int fare(int d) { return d * 12; }
}

public class Task6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        IntStream.range(0, n).forEach(i -> {
            try {
                String type = sc.next();
                int d = sc.nextInt();

                Vehicle v = switch (type) {
                    case "Bike" -> new Bike();
                    case "Auto" -> new Auto();
                    case "Cab" -> new Cab();
                    default -> throw new IllegalArgumentException("Invalid Booking");
                };

                System.out.println(v.fare(d));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        });
    }
}
