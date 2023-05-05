package internalDataTypesPractice.example;

import java.util.Random;

public class Example5 {
    public static void main(String[] args) {
        // Напишите программу, которая выводит сумму двух случайных чисел от 1 до 6
        // (такие результаты могут быть получены при броске кубиков).

        Random random = new Random();
        int throw1 = random.nextInt(6) + 1; // generation number from 0 to 5, +1 create witch 0 to 6
        int throw2 = random.nextInt(6) + 1; // generation number from 0 to 5, +1 create witch 0 to 6

        int sumThrow = throw1 + throw2;
        System.out.println("throw amount = " + sumThrow);



    }
}
