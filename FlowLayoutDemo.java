import javax.swing.*;
import java.awt.*;

public class FlowLayoutDemo extends JFrame {

    public FlowLayoutDemo() {

        setLayout(new FlowLayout(FlowLayout.LEFT));

        add(new JButton("One"));
        add(new JButton("Two"));
        add(new JButton("Three"));

        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new FlowLayoutDemo();
    }
}