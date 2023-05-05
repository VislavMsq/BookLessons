package internalDataTypesPractice.example;

import java.util.Scanner;

public class Example6 {
    public static void main(String[] args) {
        // Напишите программу, которая получает число t в аргументе командной
        // строки и выводит значение sin(2t) + sin(3t).

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the value of the variable \"t\": ");
        int t = scanner.nextInt();

        double result = Math.sin(2 * t) + Math.sin(3 * t);

        System.out.println("sin(2t) + sin(3t) = " + result);
    }
}
