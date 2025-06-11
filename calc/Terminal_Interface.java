package calc;

import java.util.Scanner;

public class Terminal_Interface {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== КАЛЬКУЛЯТОР =====");
            System.out.println("1. Арифметика");
            System.out.println("2. Квадраты и корни");
            System.out.println("3. Тригонометрия");
            System.out.println("4. Системы исчисления");
            System.out.println("0. Выход");
            System.out.print("Выберите операцию: ");
            choice = scanner.nextInt();
        }
    }
}
