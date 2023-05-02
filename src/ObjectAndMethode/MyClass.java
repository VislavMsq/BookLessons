package ObjectAndMethode;

public class MyClass {
    int number;
    char symb;

    public MyClass(int number, char symb) {
        this.number = number;
        this.symb = symb;
    }

    public void show() {
        System.out.println("Поля обьекта: " + number + " и " + symb);
    }

    // Перегруженный статический метод.
    // Аргументы - переменные базовых типов:
    public  class ArgsDemo {
        public static void MakeChange(MyClass obj) {
            obj.number++;
            obj.symb++;
            String text = "Аргумент-обьект: поля " + obj.number + " и " + obj.symb;
            System.out.println(text);
        }
        public static void MakeChange(int number, char symb) {
            number++;
            symb++;
            String text = "Аргументы базовых типов: значения " + number + " и " + symb;
            System.out.println(text);
        }
    }


}
