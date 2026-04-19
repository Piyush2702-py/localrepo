import javax.swing.*;
import java.awt.event.*;

public class SimpleUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple Swing UI");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JTextField textField = new JTextField();
        textField.setBounds(50, 50, 200, 30);

        JButton button = new JButton("Submit");
        button.setBounds(270, 50, 80, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String text = textField.getText();
                JOptionPane.showMessageDialog(frame, "You entered: " + text);
            }
        });

        frame.add(textField);
        frame.add(button);
        frame.setVisible(true);
    }
}