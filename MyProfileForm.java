import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyProfileForm extends JFrame implements ActionListener {

    JTextField nameField, dobField, phoneField;
    JTextArea addressArea;
    JRadioButton male, female;
    JCheckBox hobby1, hobby2, hobby3;
    JButton submit;

    public MyProfileForm() {

        setTitle("My Profile");
        setSize(500, 400);
        setLocationRelativeTo(null); // center screen
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // ===== Row 1 - Name =====
        gbc.gridx = 0; gbc.gridy = 0;
        add(new JLabel("Name:"), gbc);

        gbc.gridx = 1;
        nameField = new JTextField(20);
        add(nameField, gbc);

        // ===== Row 2 - DOB =====
        gbc.gridx = 0; gbc.gridy = 1;
        add(new JLabel("DOB:"), gbc);

        gbc.gridx = 1;
        dobField = new JTextField(20);
        add(dobField, gbc);

        // ===== Row 3 - Address =====
        gbc.gridx = 0; gbc.gridy = 2;
        add(new JLabel("Address:"), gbc);

        gbc.gridx = 1;
        addressArea = new JTextArea(3, 20);
        JScrollPane scroll = new JScrollPane(addressArea);
        add(scroll, gbc);

        // ===== Row 4 - Gender =====
        gbc.gridx = 0; gbc.gridy = 3;
        add(new JLabel("Gender:"), gbc);

        gbc.gridx = 1;
        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JPanel genderPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        genderPanel.add(male);
        genderPanel.add(female);

        add(genderPanel, gbc);

        // ===== Row 5 - Hobbies =====
        gbc.gridx = 0; gbc.gridy = 4;
        add(new JLabel("Hobbies:"), gbc);

        gbc.gridx = 1;
        hobby1 = new JCheckBox("Reading");
        hobby2 = new JCheckBox("Gaming");
        hobby3 = new JCheckBox("Traveling");

        JPanel hobbyPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        hobbyPanel.add(hobby1);
        hobbyPanel.add(hobby2);
        hobbyPanel.add(hobby3);

        add(hobbyPanel, gbc);

        // ===== Row 6 - Phone =====
        gbc.gridx = 0; gbc.gridy = 5;
        add(new JLabel("Phone Number:"), gbc);

        gbc.gridx = 1;
        phoneField = new JTextField(20);
        add(phoneField, gbc);

        // ===== Row 7 - Button =====
        gbc.gridx = 1; gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.CENTER;

        submit = new JButton("Print");
        submit.addActionListener(this);
        add(submit, gbc);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String dob = dobField.getText();
        String address = addressArea.getText();
        String phone = phoneField.getText();

        String gender = male.isSelected() ? "Male" :
                        female.isSelected() ? "Female" : "";

        String hobbies = "";
        if (hobby1.isSelected()) hobbies += "Reading ";
        if (hobby2.isSelected()) hobbies += "Gaming ";
        if (hobby3.isSelected()) hobbies += "Traveling ";

        JOptionPane.showMessageDialog(this,
                "Name: " + name +
                "\nDOB: " + dob +
                "\nAddress: " + address +
                "\nGender: " + gender +
                "\nHobbies: " + hobbies +
                "\nPhone: " + phone
        );
    }

    public static void main(String[] args) {
        new MyProfileForm();
    }
}