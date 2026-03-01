import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CheckBoxDemo extends JFrame implements ItemListener {

    JLabel jlab;

    public CheckBoxDemo() {

        setLayout(new FlowLayout());

        JCheckBox cb1 = new JCheckBox("C");
        JCheckBox cb2 = new JCheckBox("Java");

        cb1.addItemListener(this);
        cb2.addItemListener(this);

        add(cb1);
        add(cb2);

        jlab = new JLabel("Select option");
        add(jlab);

        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void itemStateChanged(ItemEvent e) {
        JCheckBox cb = (JCheckBox) e.getItem();
        jlab.setText(cb.getText() + " Selected: " + cb.isSelected());
    }

    public static void main(String[] args) {
        new CheckBoxDemo();
    }
}