package BookLessons.veriables.elseIf;

import javax.swing.*;

public class elseIf {
    public static void main(String[] args) {
        String text, str;    // переменнавя для считывания и ввода текста в диалог окне
        text = JOptionPane.showInputDialog("Введите ваше число!");   // счимтывание текста(числа)

        if (text == null) {
            System.exit(0);
        }     // проверка корректности ввода
        int num = Integer.parseInt(text);     // преобразование текста в число

        if (num < 0) {
            str = "Вы ввели отрицательное число!";
        } else if (num > 100) {
            str = "Это очень большое число!";
        } else if (num > 10) {
            str = "Ваше число больше 10!";
        } else {
            str = "Число в пределах от 0 до 10";
        }
        JOptionPane.showMessageDialog(null,str);


    }
}
