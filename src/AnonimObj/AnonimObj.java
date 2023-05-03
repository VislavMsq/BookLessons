package AnonimObj;

import static AnonimObj.AObjDemo.show;

public class AnonimObj {
    public static void main(String[] args) {
    // Calling a method from an anonymous object:
        new MyClass(12).show();
        show(new MyClass(24));
    }
}
