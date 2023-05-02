package classMethode2;

import javax.swing.*;
import java.util.jar.JarOutputStream;

public class AssignObj {
    String text;

    public AssignObj() {
        text = "New object";
    }

    public AssignObj(String str) {
        text = str;
    }
    public void display(){
        JOptionPane.showMessageDialog(null,text);
    }
}
