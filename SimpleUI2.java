import javax.swing.*;

public class SimpleUI2{
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple UI");
        JButton button = new JButton("Click Me");
        
        button.setBounds(130, 100, 100, 40);
        
        frame.add(button);
        frame.setSize(400, 300);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}