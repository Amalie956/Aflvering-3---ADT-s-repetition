package B;

import java.util.Scanner;

public class ValidCPR {
    public static void StartExercise(){
        System.out.println(exerciseB());
    }
    public static boolean exerciseB() {
        //Write a method that returns if a user has input a valid CPR number
        Scanner validCPRNumber = new Scanner(System.in);
        System.out.println("Indtast dit CPR nummer:");

        //Scanner inputtet fra brugeren, som en string
        String cpr = validCPRNumber.next();

        if (cpr.length() != 10) {
            return false;
        }
        //De første 2 karakter i cpr nummeret bliver lavet om til et tal, da cpr nr er lavet som en string
        int firstTwoDigits = Integer.parseInt(cpr.substring(0, 1));
        if (firstTwoDigits > 31) {
            return false;
        }

        //De 2 miderste karakter i cpr nummeret bliver lavet om til et tal, da cpr nr er lavet som en string
        int middleTwoDigits = Integer.parseInt(cpr.substring(2, 3));
        if (middleTwoDigits > 12) {
            return false;
        }
        return true;

    }
}
