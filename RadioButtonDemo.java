import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtonDemo extends JFrame {

    JLabel jlab;

    public RadioButtonDemo() {

        setLayout(new FlowLayout());

        JRadioButton b1 = new JRadioButton("A");
        JRadioButton b2 = new JRadioButton("B");

        ButtonGroup bg = new ButtonGroup();
        bg.add(b1);
        bg.add(b2);

        jlab = new JLabel("Select one");

        b1.addActionListener(e -> jlab.setText("A Selected"));
        b2.addActionListener(e -> jlab.setText("B Selected"));

        add(b1);
        add(b2);
        add(jlab);

        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RadioButtonDemo();
    }
}