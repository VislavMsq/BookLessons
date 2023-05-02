package BookLessons.veriables.elseIf.switchCase;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class swirchCase {
    public static void main(String[] args) {

        int num;     // пользовательское число
        String text, str;       // текст(число)
        text = JOptionPane.showInputDialog("Введите число от 0 до 10:");    // текст диалогового окна
        num = Integer.parseInt(text);   // преобразовали текст в число

        switch (num) {      // оператор выбора
            case 0:
                str = "Вы введи нулевое значение!";
                break;
            case 1:
                str = "Вы ввели единичное значение!";
                break;
            case 2:
            case 3:
            case 5:
            case 7:
                str = "Вы ввели простое число!";
                break;
            case 4:
            case 6:
            case 8:
            case 10:
                str = "Вы ввели четное число!";
                break;
            default:
                str = "Вы ввели число 9 или\nвыходящее за пределы диапазона!";
        }
        JOptionPane.showMessageDialog(null,str);







        }
    }
