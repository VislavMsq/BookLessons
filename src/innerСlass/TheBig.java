package innerСlass;

import javax.swing.*;

public class TheBig {
    String name;
    // Field of the outer class - object
    // inner class variable:
    TheSmall ID;

    public TheBig(String name, int n) {
        this.name = name;
        // Create an inner class object:
        ID = new TheSmall(n);
        ID.show();
    }

    // External class method.
    // Returns a text string with the name of the object
    // outer class:
    String getName() {
        String txt = "Name object: " + name + "\n";
        return txt;
    }

    // Inner class:
    public class TheSmall {
        int[] code;

        public TheSmall(int n) {
            code = new int[n];
            for (int i = 0; i < code.length; i++) {
                code[i] = (int) (10 * Math.random());   // random numbers with 0 - 9
            }
        }

        // Inner class method.
        // Returns a string with the object code inner class:
        public String getCode() {
            String txt = "Code object: |";
            // Formation of the full text:
            for (int i = 0; i < code.length; i++) {
                txt += code[i] + " | ";
            }
            return txt;
        }
        // Method for displaying a message with a name
        // object of the outer class and the code of the object inner class:
        public void show(){
        String txt = getName() + getCode();
            JOptionPane.showMessageDialog(null,txt);
        }

    }
}
