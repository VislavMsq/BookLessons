package internalDataTypesPractice.example;

import java.util.Random;
import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        // Напишите программу, которая получает два целых числа а и b в аргументах
        // командной строки и выводит случайное целое число из диапазона от а до b включительно.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first your number!");
        int num1 = scanner.nextInt();

        System.out.println("Enter second your number!");
        int num2 = scanner.nextInt();

        Random random = new Random();

        int randomNum = random.nextInt(num2 - num1 + 1) + num1;
        System.out.println("random number ranging from " + num1 + " to " + randomNum);
    }
}
