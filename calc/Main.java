package calc;
import java.util.Scanner;
public class Main {
    public static int choice, first, second;
    public static String userChoice;
    public static void main (String args[] ){
        Scanner scan = new Scanner(System.in);
        System.out.println("===== КАЛЬКУЛЯТОР =====");
        System.out.println("1. Арифметика");
        System.out.println("2. Квадраты и корни");
        System.out.println("3. Тригонометрия");
        System.out.println("4. Системы исчисления");
        System.out.println("0. Выход");
        System.out.print("Выберите операцию: ");
        choice = scan.nextInt();
        if (choice == 4){
            System.out.println("Введите число");
            first = scan.nextInt();
            System.out.println("Введите необходимую систему исчисления(hex, octal, binary)");
            userChoice = scan.nextLine();}
        else if (choice >= 0 && choice <= 4) {
        System.out.println("Введите первое число");
        first = scan.nextInt();
        System.out.println("Введите второе число");
        second = scan.nextInt();}
        if (choice == 0) {
           System.out.println("Выход из программы.");
            return;}

        switch (choice) {
            
            case 1 -> {
                System.out.println(mainCalc.arithmetics(first, second));}
            case 4 -> System.out.println(numSys.which_base(userChoice, first));
        }
        }
    }

