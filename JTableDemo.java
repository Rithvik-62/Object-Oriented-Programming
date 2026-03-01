import javax.swing.*;

public class JTableDemo extends JFrame {

    public JTableDemo() {

        String colHeads[] = {"Name", "Extension", "ID#"};

        Object data[][] = {
                {"Gail", "4567", "865"},
                {"Ken", "7566", "555"},
                {"Anne", "1237", "333"}
        };

        JTable table = new JTable(data, colHeads);

        add(new JScrollPane(table));

        setSize(400, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JTableDemo();
    }
}