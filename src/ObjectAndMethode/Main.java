package ObjectAndMethode;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass(1,'a');
        obj.show();
        MyClass.ArgsDemo.MakeChange(obj);
        obj.show();
        MyClass.ArgsDemo.MakeChange(obj.number, obj.symb);
        obj.show();
    }
}
