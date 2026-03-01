import javax.swing.*;
import java.awt.*;

public class ScrollPaneDemo extends JFrame {

    public ScrollPaneDemo() {

        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(20, 20));

        for (int i = 1; i <= 400; i++) {
            jp.add(new JButton("Button " + i));
        }

        JScrollPane jsp = new JScrollPane(jp);
        add(jsp);

        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ScrollPaneDemo();
    }
}