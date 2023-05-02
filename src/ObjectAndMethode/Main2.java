package ObjectAndMethode;

public class Main2 {
    public static void main(String[] args) {
        MyClass2 obj = new MyClass2("Основной обьект");
        obj.show();
        MoreArgsDemo.ChangeRef(obj);
        obj.show();

    }
}
