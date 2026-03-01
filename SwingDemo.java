import javax.swing.*;

public class SwingDemo {

    SwingDemo() {

        JFrame jfrm = new JFrame("A Simple Swing Application");

        jfrm.setSize(300, 100);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Swing means powerful GUIs.");

        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

    public static void main(String args[]) {

        SwingUtilities.invokeLater(() -> {
            new SwingDemo();
        });
    }
}