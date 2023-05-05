package internalDataTypesPractice.example;

import java.util.Scanner;

public class Example3 {
    public static void main(String[] args) {
        // Напишите программу, которая получает три положительных числа в аргументах
        // командной строки и выводит false , если одно из них больше или равно
        // сумме других, или true в противном случае.
        // (Примечание: программа проверяет, могут ли числа представлять длины сторон некоторого треугольника.)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first number!");
        int num1 = scanner.nextInt();

        System.out.println("Enter your second number!");
        int num2 = scanner.nextInt();

        System.out.println("Enter your third number!");
        int num3 = scanner.nextInt();

        if(num1 <= 0 || num2 <= 0 || num3 <= 0){
            System.out.println("Both numbers must be positive");
            return;
        }

        if (num1 >= num2 + num3 || num2 >= num1 + num3 || num3 >= num1 + num2){
            System.out.println("false");
        } else {
            System.out.println("true");
        }

    }
}
