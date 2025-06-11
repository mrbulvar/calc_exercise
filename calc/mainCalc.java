package calc;

import java.util.Scanner;

public class mainCalc {
    public static double arithmetics(int first, int second){
        Scanner scan = new Scanner(System.in);
        System.out.print("Оператор (+ - * /): ");
        char op = scan.next().charAt(0);
        return switch (op) {
            case '+' -> first + second;
            case '-' -> first - second;
            case '*' -> first * second;
            case '/' -> {
                if (second != 0) yield first / second;
                else {
                    System.out.println("Деление на ноль!");
                    yield 0;}}
                default -> {
                    System.out.println("Неизвестный оператор!");
                    yield 0;}
            };
        }
    }

