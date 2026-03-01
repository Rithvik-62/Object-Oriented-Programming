import javax.swing.*;
import java.awt.*;

public class ComboBoxDemo extends JFrame {

    JLabel jlab;

    public ComboBoxDemo() {

        String flags[] = {"France", "India", "USA"};

        JComboBox<String> jcb = new JComboBox<>(flags);
        jlab = new JLabel("Select Country");

        jcb.addActionListener(e ->
                jlab.setText((String) jcb.getSelectedItem()));

        setLayout(new FlowLayout());

        add(jcb);
        add(jlab);

        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ComboBoxDemo();
    }
}