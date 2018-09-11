import javax.swing.*;

public class Welcome {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Please Enter Your Name");
        JOptionPane.showMessageDialog(null,"Welcome " + name + " to year two");

    }
}
