package internalDataTypesPractice.example;

import java.util.Scanner;

public class Example7 {
    public static void main(String[] args) {
        // Напишите программу, которая получает два целых числа m и d в аргументах
        // командной строки и выводит true, если день d месяца m лежит в диапазоне от 20/03
        // до 20/06, или false в противном случае.

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your favorite day from 20/03 to 20/06");
        int day = scanner.nextInt();

        System.out.println("Enter your favorite month from 20/03 to 20/06");
        int month = scanner.nextInt();

        if(day > 31 || month > 12){
            System.out.println("enter correct data!");
            return;
        }
        if (month > 3 && month <= 6 || day == 20){
            System.out.println("true");
        } else {
            System.out.println("false");
        }

    }

}
