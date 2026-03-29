import javax.swing.*;
import java.awt.*;

public class RegistrationForm {
    public static void main(String[] args) {
        JFrame f = new JFrame("Registration Form");

        JLabel title = new JLabel("Registration Form");
        title.setBounds(150, 10, 200, 30);

        JLabel nameLabel = new JLabel("Name:");
        nameLabel.setBounds(50, 50, 100, 25);
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 50, 150, 25);

        JLabel addressLabel = new JLabel("Address:");
        addressLabel.setBounds(50, 90, 100, 25);
        JTextArea addressArea = new JTextArea();
        addressArea.setBounds(150, 90, 150, 50);

        JLabel genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(50, 160, 100, 25);
        JRadioButton male = new JRadioButton("Male");
        male.setBounds(150, 160, 70, 25);
        JRadioButton female = new JRadioButton("Female");
        female.setBounds(220, 160, 80, 25);
        ButtonGroup bg = new ButtonGroup();
        bg.add(male);
        bg.add(female);

        JLabel hobbyLabel = new JLabel("Hobbies:");
        hobbyLabel.setBounds(50, 200, 100, 25);
        JCheckBox reading = new JCheckBox("Reading");
        reading.setBounds(150, 200, 80, 25);
        JCheckBox sports = new JCheckBox("Sports");
        sports.setBounds(230, 200, 80, 25);

        JButton submit = new JButton("Submit");
        submit.setBounds(150, 250, 100, 30);

        ImageIcon icon = new ImageIcon("image.jpg");
        JLabel imageLabel = new JLabel(icon);
        imageLabel.setBounds(320, 50, 150, 150);

        f.add(title);
        f.add(nameLabel);
        f.add(nameField);
        f.add(addressLabel);
        f.add(addressArea);
        f.add(genderLabel);
        f.add(male);
        f.add(female);
        f.add(hobbyLabel);
        f.add(reading);
        f.add(sports);
        f.add(submit);
        f.add(imageLabel);

        f.setSize(500, 350);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}