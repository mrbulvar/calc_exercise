package calc;

import java.util.Scanner;

public class numSys {

    int UserInput;
    String UserChoice;

    public static void base10_to_base16(int UserInput) {

        String hex = String.format("%X", UserInput);
        System.out.println("hex: " + hex);
    }

    public void base10_to_base8(int UserInput) {

        String octal = String.format("%o", UserInput);
        System.out.println("octal: " + octal);
    }

    public static void base10_to_base2(int UserInput) {

        String binary = Integer.toBinaryString(UserInput);
        System.out.println("binary: " + binary);
    }

    public void which_base(String UserChoice) {

        switch (UserChoice.toLowerCase()) {
            case "hex":
                base10_to_base16(UserInput);
                break;
            case "octal":
                base10_to_base8(UserInput);
                break;
            case "binary":
                base10_to_base2(UserInput);
                break;
            default:
                System.out.println("invalid. please restart and choose from: hex, octal, binary");
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What decimal do you want to convert? (type a number)");
        int UserInput = scan.nextInt();
        numSys start = new numSys();
        start.UserInput = UserInput;
        System.out.println("To what base do you want to convert? (hex, octal, binary)");
        String UserChoice = scan.next();
        start.which_base(UserChoice);
    }
}