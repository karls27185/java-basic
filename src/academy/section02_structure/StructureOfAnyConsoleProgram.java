package academy.section02_structure;

import java.util.Scanner;

public class StructureOfAnyConsoleProgram {
    public static void main(String[] args) {
        // read source data
        System.out.println("Please enter the number:");
        var number = new Scanner(System.in).nextInt();

        //processing
        var result = number + 1;

        // display results
        System.out.println(result);
    }
}
