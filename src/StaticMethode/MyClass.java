package StaticMethode;

import javax.swing.*;

public class MyClass {
    static int N1;
    int N2;

    public MyClass(int n1, int n2) {
        N1 = n1;
        N2 = n2;
        String text = "Создан новый обьект! \n";
        text += "Cтатическое поле: " + N1 + " \n";
        text += "Нестатическое поле: " + N2;
        JOptionPane.showMessageDialog(null,text);
    }
    public void show(){
        String text="Поля объекта!\n";
        text+="Статическое поле: "+N1+"\n";
        text+="Нестатическое поле: "+N2;
        JOptionPane.showMessageDialog(null,text);
    }
}
