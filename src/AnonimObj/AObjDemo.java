package AnonimObj;

import javax.swing.*;

public class AObjDemo {
    // Static method to display a message based on an object of class MyClass:
    public static void show(MyClass obj) {
        obj.show();
        // Text (initial value) to display in the window:
        String text = "Array elements: \n";
        // Determining the number of elements in a string:
        int n = (int) Math.ceil(Math.sqrt(obj.nums.length));
        // Forming text:
        for (int i = 0; i < obj.nums.length -1; i++) {
            text += obj.nums[i] + ((i + 1) % n == 0 ? " >> next \n":" : ");
            // final
            text += obj.nums[obj.nums.length - 1] + ". end";
            // Display message:
            JOptionPane.showMessageDialog(null,text);


        }
    }
}
