package SimpleArray;

import javax.swing.*;

public class array {
    public static void main(String[] args) {
        // Сейчас создается одномерный целочисленный массив, который заполняется нечетными числами и затем
        // поэлементно выводится на экран.

        // индексная переменная и длинна массива
        int i, size;
        // текст для отображения
        String text = "Массив из нечетных чисел: \n";
        // вывод диалогового окна для размера массива
        size = Integer.parseInt(JOptionPane.showInputDialog("Укажите размер массива!"));
        // создаем ссылку на массив int num [], затем кладем данные из тиалогового окна в этот массив
        int [] num = new int[size];
        // заполнение массива нечетными числами и формирование текста для вывода
        for (i = 0; i < size; i++) {
            // берем наше i умножаем на 2 получаем четное число и добовляем +1 и получается нечетное
            num[i] = 2 * i + 1;
            text += num[i] + " ";
        }
        // вывод диалогового окна
        JOptionPane.showMessageDialog(null,text);
    }

}
