package academy.section04_conditional;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {
        // read source data
        var number = new Random().nextInt(10);
        var userCase = new Scanner(System.in).nextInt();

        // processing
        String result;
        if (number == userCase) {
            result = "Congratulations, you guessed the number!";
        } else {
            result = "Sorry, but your number is invalid! Try again later...";
        }

        // display resulte
        System.out.println(result);
        System.out.println("number = " + number);

    }
}
