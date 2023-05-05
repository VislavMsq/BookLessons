package internalDataTypesPractice.example;

import java.util.Scanner;

public class Example2 {
    public static void main(String[] args) {
        // Напишите программу, которая получает два положительных числа в аргументах
        // командной строки и выводит true , если одно из этих чисел нацело делится на другое.
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first your number!");
        int num1 = sc.nextInt();

        System.out.println("Enter second your number!");
        int num2 = sc.nextInt();

        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Both numbers must be positive");
            return;
        }
        if (num1 % num2 == 0 || num2 % num1 == 0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }


        sc.close();

    }
}
