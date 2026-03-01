import javax.swing.*;

public class TabbedPaneDemo extends JFrame {

    public TabbedPaneDemo() {

        JTabbedPane jtp = new JTabbedPane();

        jtp.addTab("Cities", new JButton("New York"));
        jtp.addTab("Colors", new JButton("Red"));
        jtp.addTab("Flavors", new JButton("Chocolate"));

        add(jtp);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new TabbedPaneDemo();
    }
}