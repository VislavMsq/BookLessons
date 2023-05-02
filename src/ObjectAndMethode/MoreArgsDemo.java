package ObjectAndMethode;

public  class MoreArgsDemo {
    public static void ChangeRef(MyClass2 obj) {
        MyClass2 tmp = new MyClass2("Локальный обьект");
        obj = tmp;
        obj.show();
    }
}
