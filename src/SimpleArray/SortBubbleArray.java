package SimpleArray;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class SortBubbleArray {
    public static void main(String[] args) {
        String text = "Исходный массив: \n";
        int size, i, j ;
        size = Integer.parseInt(JOptionPane.showInputDialog("Размер массива:"));
        char[] symbs = new char[size];
        // начальная буква заполнения массива
        char s = 'a';
        // заполнение массива случайными числами
        for (int k = 0; k < size; k++) {
            symbs[k] = (char) (s + (byte) (Math.random() * 26));
            text += symbs[k] + " ";
        }
        text += "\nПосле сортировкти:\n";
        // сортировка массива
        for (int k = 0; k < size; k++) {
            for (int l = 0; l < size - l - 1; l++) {
                if (symbs[l] > symbs[l + 1]) {
                    s = symbs[1 + 1];
                    symbs[l + 1] = symbs[l];
                    symbs[l] = s;
                }
            }
        }
        // запись в текстовую переменную элементов массива после сортировки
        for (int k = 0; k < size; k++) {
            text += symbs[k] + " ";
        }
        JOptionPane.showMessageDialog(null,text);
    }
}
