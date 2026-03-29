import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ColorChangerGUI3{
    public static void main(String[] args) {
        JFrame frame = new JFrame("My frame");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JPanel panel = new JPanel();
        panel.setBounds(0, 0, 400, 300);
        panel.setBackground(Color.BLUE);
        panel.setLayout(null);

        String[] colors = {"white", "orange", "red", "blue"};
        JList<String> colorList = new JList<>(colors);
        colorList.setBounds(50, 50, 100, 80);
        colorList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);

        JButton button = new JButton("Click");
        button.setBounds(180, 50, 80, 30);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String selectedColor = colorList.getSelectedValue();
                if (selectedColor != null) {
                    switch (selectedColor.toLowerCase()) {
                        case "white":
                            panel.setBackground(Color.WHITE);
                            break;
                        case "orange":
                            panel.setBackground(Color.ORANGE);
                            break;
                        case "red":
                            panel.setBackground(Color.RED);
                            break;
                        case "blue":
                            panel.setBackground(Color.BLUE);
                            break;
                    }
                } else {
                    JOptionPane.showMessageDialog(frame, "Please select a color!");
                }
            }
        });

        panel.add(colorList);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}