package ArrayAndObj;

public class ArraysAndObjs {
    public static void main(String[] args) {
        // Number of elements in the array of objects:
        int count = 5;
        // Create an array of object variables:
        Second[] ObjAr = new Second[count];
        // Binding object variables - array elements  with created objects of class Second:
        for (int i = 0; i < ObjAr.length; i++) {
            ObjAr[i] = new Second(3 * i + 4);
        }
    }

}
