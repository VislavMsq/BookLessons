package classMethod;

import javax.swing.*;

public class MyClass {
    int num;
    char symb;
    String text;

    public String showText() {
        String str = "Значение полей обьекта: " + "\n";
        str += "num = " + num + "\n";
        str += "test = " + text + "\n";
        str += "symb = " + symb;
        JOptionPane.showMessageDialog(null, str);
        return str;
    }
}
