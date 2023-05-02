package classMethode2;

public class Main {
    public static void main(String[] args) {

        AssignObj objA = new AssignObj();
        AssignObj objB = new AssignObj("Second object");
        objA.display();
        objB.display();
        objA = objB;
        objA.display();
        objB.text = "Text changed";
        objA.display();
    }
}
