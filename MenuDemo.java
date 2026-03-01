import java.awt.*;
import java.awt.event.*;

public class MenuDemo extends Frame {

    public MenuDemo() {

        MenuBar mbar = new MenuBar();
        setMenuBar(mbar);

        Menu file = new Menu("File");

        MenuItem item1 = new MenuItem("New");
        MenuItem item2 = new MenuItem("Open");
        MenuItem item3 = new MenuItem("Quit");

        file.add(item1);
        file.add(item2);
        file.add(item3);

        mbar.add(file);

        setSize(400, 300);
        setVisible(true);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        new MenuDemo();
    }
}