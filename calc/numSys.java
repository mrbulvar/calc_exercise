package calc;

import java.util.Scanner;

public class numSys {

    int UserInput;
    boolean run;

    public void number_to_base10(int UserInput, boolean run) {

        for (int i = UserInput; run == true; i /= 2) {
            int n = 0;
            int pow = 0;
            int result = 0;
            int binary_base = 2;
            if (i == 0) {
                run = false;
            }
            if (i % 2 == 0 && i != 0) {
                System.out.println(0);
                n = 0;
            }
            if (i % 2 == 1) {
                System.out.println(1);
                n = 1;
            }
            if (n == 0) {
                result = 1;
            } else {

            }
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int UserInput = scan.nextInt();
        numSys start = new numSys();
        start.number_to_base10(UserInput, true);
    }
    // 10 2 8 16
}
