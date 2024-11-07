import entities.Rent;

import javax.xml.transform.Source;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        Rent[] vect = new Rent[10];

        System.out.println("How many rooms will be rented?");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("");
            System.out.println("Rent #" + (i + 1) + ":");
            System.out.println("Name: ");
            scanner.nextLine();
            String name = scanner.next();

            System.out.println("Email: ");
            String email = scanner.next();

            System.out.println("Room number: ");
            int roomNumber = scanner.nextInt();

            vect[roomNumber] = new Rent(name, email);
        }
        System.out.println("");
        System.out.println("Busy rooms: ");
        for (int i = 0; i < 10; i++) {
            if (vect[i] != null) {
                System.out.println( i + ": " + vect[i]);
            }

        }

    }
}

