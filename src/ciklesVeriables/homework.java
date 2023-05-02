package ciklesVeriables;

import java.util.Scanner;

public class homework {
    public static void main(String[] args) {
        //Напишите программу, которая получает три целых числа как аргументы
        //командной строки и выводит сообщение " equal" , если все три числа равны, или
        //"not equal" в противном случае.
        Scanner sc = new Scanner(System.in);
//        System.out.println("Entered your number!");
//        int num1 = sc.nextInt();
//        int num2 = sc.nextInt();
//        int num3 = sc.nextInt();
//
//        if (num1 == num2 && num2 == num3) {
//            System.out.println("Your number equals!");
//        } else {
//            System.out.println("Your number not equals!");
//        }

        //Напишите фрагмент кода, который выводит сообщение " true " , если перeменные
        // х и у типа double лежат строго в диапазоне от 0 до 1, или " false " в противном случае.
//        System.out.println("Enter your number from 0 to 1");
//        double x = sc.nextDouble();
//        double y = sc.nextDouble();
//        if (x <= 1 && y <= 1){
//            System.out.println("your numbers in the range");
//        }else {
//            System.out.println("your numbers in not range");
//        }

        //Напишите программу, которая получает два положительных числа в аргументах
        // командной строки и выводит true , если одно из этих чисел нацело делится
        //на другое.
//        System.out.println("enter your positive number!");
//        int posNum = sc.nextInt();
//        int posNum2 = sc.nextInt();
//        if(posNum % posNum2 == 0){
//            System.out.println("true");
//        }else{
//            System.out.println("false");
//        }
        //Напишите программу, которая получает три положительных числа в аргументах
        //командной строки и выводит false , если одно из них больше или равно
        //сумме других, или true в противном случае. (Примечание: программа проверяет,
        //могут ли числа представлять длины сторон некоторого треугольника.)
//        System.out.println("Enter your three numbers!");
//        System.out.print("Your 1th number: ");
//        int num1th = sc.nextInt();
//        System.out.print("Your 2th number: ");
//        int num2th = sc.nextInt();
//        System.out.print("Your 3th number: ");
//        int num3th = sc.nextInt();
//
//        int sum1 = num2th + num3th;
//        int sum2 = num1th + num3th;
//        int sum3 = num1th + num2th;
//        if(num1th >= sum1){
//            System.out.println("false");
//        }else if(num2th >= sum2){
//            System.out.println("false");
//        }else if(num3th >= sum3){
//            System.out.println("false");
//        }else{
//            System.out.println("true");
//        }
        //Напишите программу, которая получает два целых числа а и b в аргументах
        //командной строки и выводит случайное целое число из диапазона от а до b включительно.
//
//        System.out.println("Enter your number!");
//        System.out.println("Your 1th number: ");
//        int numQ = sc.nextInt();
//        System.out.println("Your 2th number: ");
//        int numW = sc.nextInt();
//        double rand = Math.random();




        //Напишите программу, которая получает два целых числа m и d в аргументах
        //командной строки и выводит true, если день d месяца m лежит в диапазоне от 20/03
        //до 20/06, или false в противном случае.

        System.out.println("Enter day and month!");
        System.out.println("Day: ");
        int day = sc.nextInt();
        System.out.println("Month: ");
        int month = sc.nextInt();

        if (day <= 19 && day >= 21){
            System.out.println("your day: " + "true");
        }else {
            System.out.println("false");
        }
    }

}


