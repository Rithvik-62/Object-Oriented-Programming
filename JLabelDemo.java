import javax.swing.*;

public class JLabelDemo extends JFrame {

    public JLabelDemo() {

        setTitle("JLabel Demo");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        ImageIcon ii = new ImageIcon("france.gif"); // Keep image in same folder

        JLabel jl = new JLabel("France", ii, JLabel.CENTER);

        add(jl);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JLabelDemo();
    }
}