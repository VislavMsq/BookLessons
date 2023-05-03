package AnonimObj;

import javax.swing.*;

public class MyClass {
    // class to create based on it anonymous object:
    int[] nums;
    // Field - array variable: Class constructor:


    public MyClass(int n) {
        // create array
        nums = new int[n];
        // Filling the array with natural numbers:
        for (int i = 0; i < nums.length; i++) {
            nums[i] = i + 1;
        }
    }
    // Method for displaying array elements in the dialog box:
    public void show(){
        // Text to display in the dialog box (initial value)
        String text = "integers: \n";
        // Forming text:
        for (int i = 0; i < nums.length; i++) {
            text += nums[i] + " ";
            // Display dialog box:
            JOptionPane.showMessageDialog(null,text);
        }
    }
}
