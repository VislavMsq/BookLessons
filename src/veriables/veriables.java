package veriables;

import javax.swing.*;

public class veriables {
    public static void main(String[] args) {
        double x, y;    // числа
        String title = "Деление чисел";       // заголовок окна
        String text = "Результат деления: ";     // текст сообщения

        int type;   // переменная
        x = Double.parseDouble(JOptionPane.showInputDialog("Числитель:"));     // считыватель числителя
        y = Double.parseDouble(JOptionPane.showInputDialog("Знаменатель:"));     // считеватель знаменателя
        if (x != 0) {
            type = JOptionPane.PLAIN_MESSAGE;     // знаменатель не равен нулю
            text = text + x + "/" + y + "=" + +x / y;
        } else {
            type = JOptionPane.ERROR_MESSAGE;     // знаменатель равен нулю
            text = text + "деление на ноль!";
        }
        JOptionPane.showMessageDialog(null, text, title, type);     // выводит текстовое окно

    }
}
