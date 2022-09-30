package academy.section07_String;

import java.util.Scanner;

public class MathHelper {
    public static void main(String[] args) {
        while (true){
            System.out.println("Enter cmd: {pi, e, exit or quit}");
            String cmd = new Scanner(System.in).nextLine();
            if ("exit".equals(cmd) || "quit".equals(cmd)){
                break;
            } else if ("pi".equals(cmd)){
                System.out.println(Math.PI);
            } else if("e".equals(cmd)){
                System.out.println(Math.E);
            } else {
                System.out.println("Invalid cmd. Tray again!");
            }
        }
    }
}
