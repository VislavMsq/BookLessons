package SimpleArray;

import javax.swing.*;

public class RaggedArray {
    public static void main(String[] args) {
        // случайное число от 2 до 4
        int size = 2+(int)(Math.random()*3);
        // переменная для записи кл-ва элементов в строке
        int n;
        // начальная буква для заполнения массива
        char s = 'a';
        // текст для вывода на экран сообщения
        String text = "\"Рванный\" символьный массива:";
        // создание массива заданно кл-во строк
        char [][] symbs = new char[size][];
        // добавление строк в массив
        for (int k = 0; k < size; k++) {
        // рандомное число от 1 до 8
            n = 1+(int)(Math.random()*8);
        // создание строки случайнной длинны
            symbs[k] = new char[n];
        }
        // заполнение массива буквами
        for (int i = 0; i < symbs.length; i++) {
        // переход на новую строку и символ
        text += "\n|";
        // перменная j для разных значений i
            for (int j = 0; j < symbs[i].length; j++) {
        // заполнение элемента символом
                symbs[i][j] = s;
        // следующий символ
                s++;
        // добавление записи в текст
                text += symbs[i][j] + " | ";
            }
            JOptionPane.showMessageDialog(null,text);
        }
    }
}
