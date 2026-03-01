import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class JTextFieldDemo1 extends JFrame {

    JTextField jtf;

    public JTextFieldDemo1() {

        setLayout(new FlowLayout());

        jtf = new JTextField(15);
        add(jtf);

        jtf.addActionListener(e ->
                JOptionPane.showMessageDialog(this, jtf.getText()));

        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTextFieldDemo();
    }
}