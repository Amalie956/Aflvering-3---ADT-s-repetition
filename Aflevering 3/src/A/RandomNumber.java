package A;

import java.util.Random;

public class RandomNumber {
    public static void exerciseA() {
        //Write a method that returns a random number between 1-10
        Random randomNumber = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomNumber.nextInt(10)+1);
        }
    }
}
