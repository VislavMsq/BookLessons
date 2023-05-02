package classMethod;

import javax.swing.*;

public class MyClass2 {
    int num;
    char symb;
    String text;

    public void display() {
        String str = "Значение полей обьекта: " + "\n";
        str += "num = " + num + "\n";
        str += "test = " + text + "\n";
        str += "symb = " + symb;
        JOptionPane.showMessageDialog(null, str);
    }

    public void set(int n, char r, String str){
        num = n;
        symb = r;
        text = str;

    }
}
