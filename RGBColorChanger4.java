import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RGBColorChanger4{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Frame");
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 500, 300);
        panel.setBackground(Color.WHITE);
        panel.setLayout(null);

        JLabel redLabel = new JLabel("Red");
        redLabel.setBounds(20, 20, 40, 25);
        JLabel greenLabel = new JLabel("Green");
        greenLabel.setBounds(120, 20, 50, 25);
        JLabel blueLabel = new JLabel("Blue");
        blueLabel.setBounds(240, 20, 40, 25);

        Integer[] values = new Integer[256];
        for (int i = 0; i <= 255; i++) {
            values[i] = i;
        }

        JComboBox<Integer> redBox = new JComboBox<>(values);
        redBox.setBounds(60, 20, 50, 25);
        JComboBox<Integer> greenBox = new JComboBox<>(values);
        greenBox.setBounds(170, 20, 50, 25);
        JComboBox<Integer> blueBox = new JComboBox<>(values);
        blueBox.setBounds(280, 20, 50, 25);

        JButton button = new JButton("Show-Output");
        button.setBounds(360, 20, 120, 25);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int r = (Integer) redBox.getSelectedItem();
                int g = (Integer) greenBox.getSelectedItem();
                int b = (Integer) blueBox.getSelectedItem();
                panel.setBackground(new Color(r, g, b));
            }
        });

        panel.add(redLabel);
        panel.add(greenLabel);
        panel.add(blueLabel);
        panel.add(redBox);
        panel.add(greenBox);
        panel.add(blueBox);
        panel.add(button);

        frame.add(panel);
        frame.setVisible(true);
    }
}