import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;

public class JListDemo extends JFrame {

    JLabel jlab;

    public JListDemo() {

        String cities[] = {
                "New York", "Chicago", "London",
                "Paris", "Tokyo"
        };

        JList<String> jlst = new JList<>(cities);
        jlst.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        jlab = new JLabel("Choose a City");

        jlst.addListSelectionListener(e -> {
            jlab.setText(jlst.getSelectedValue());
        });

        add(new JScrollPane(jlst), BorderLayout.CENTER);
        add(jlab, BorderLayout.SOUTH);

        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new JListDemo();
    }
}