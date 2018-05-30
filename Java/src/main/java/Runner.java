import java.util.ArrayList;
import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        PlanetAge planetAge = new PlanetAge();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 1 to input age in Earth Years");
        System.out.println("Enter 2 to input age in Seconds");

        int selection = scanner.nextInt();

        if (selection == 1) {
            System.out.print("Enter age in Earth Years:  ");
            int age = scanner.nextInt();

            ArrayList ageList = planetAge.getAllAgesFromYears(age);
            planetAge.printAgesToTerminal(ageList);
        }

        if (selection == 2) {
            System.out.print("Enter age in Seconds:  ");
            int age = scanner.nextInt();

            ArrayList ageList = planetAge.getAllAgesFromSeconds(age);
            planetAge.printAgesToTerminal(ageList);
        }


    }
}
