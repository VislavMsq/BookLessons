package classMethod;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {


        MyClass2 myClass = new MyClass2();
        MyClass2 myClass2 = new MyClass2();

        myClass.set(12,'a',"Hello");
        myClass2.set(22,'b', "Hello again");

        myClass.display();
        myClass2.display();

//        myClass.num = 12;                           комментарий для работы с обьектом одного класса
//        myClass.text = "Текст";
//        myClass.symb = 'a';

//      JOptionPane.showMessageDialog(null,myClass.showText());
    }

}
