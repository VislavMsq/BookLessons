package classMethod;

import javax.swing.*;

public class MyClass3 {
    int num;
    char symb;
    String text;

    public MyClass3() {
        set();
        showText();
    }

    public MyClass3(int s) {
        set(s);
        showText();
    }

    public MyClass3(int n, char s, String str) {
        set(n, s, str);
        showText();
    }

    public void showText() {
        String str = "Значение полей обьекта!\n";
        str += "num = " + num + "\n";
        str += "char = " + symb + "\n";
        str += "text = " + text;
        JOptionPane.showMessageDialog(null, str);
    }

    public void set() {
        num = 0;
        symb = 'a';
        text = "нет аргументов!";
    }

    public void set(int n) {
        num = n;
        symb = 'b';
        text = "целочисленный аргумент!";
    }

    public void set(char s) {
        num = 1;
        symb = s;
        text = "Символьный аргумент.";
    }

    void set(int n, char s, String str) {
        num = n;
        symb = s;
        text = str;
    }
}
