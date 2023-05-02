package StaticMethode;

public class UsingStatDemo {
    public static void main(String[] args) {
        MyClass A = new MyClass(10,200);
        MyClass.N1 = -50;
        A.show();
        MyClass B = new MyClass(1,2);
        A.show();
        B.N1 = -1;
        B.N2 = -2;
        A.show();



    }
}
