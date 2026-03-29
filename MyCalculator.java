import javax.swing.*;
import java.awt.event.*;

public class MyCalculator implements ActionListener {
    JFrame f;
    JLabel l1, l2, l3;
    JTextField t1, t2, t3;
    JButton b1, b2, b3, b4;

    MyCalc() {
        f = new JFrame("My Calc");

        l1 = new JLabel("Enter the First Number:");
        l1.setBounds(50, 50, 180, 25);
        t1 = new JTextField();
        t1.setBounds(230, 50, 80, 25);

        l2 = new JLabel("Enter the Second Number:");
        l2.setBounds(50, 90, 180, 25);
        t2 = new JTextField();
        t2.setBounds(230, 90, 80, 25);

        l3 = new JLabel("result:");
        l3.setBounds(50, 130, 180, 25);
        t3 = new JTextField();
        t3.setBounds(230, 130, 100, 25);

        b1 = new JButton("Add");
        b1.setBounds(350, 50, 100, 25);

        b2 = new JButton("subtract");
        b2.setBounds(460, 50, 100, 25);

        b3 = new JButton("multiply");
        b3.setBounds(570, 50, 100, 25);

        b4 = new JButton("reset");
        b4.setBounds(460, 90, 100, 25);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);

        f.add(l1); f.add(t1);
        f.add(l2); f.add(t2);
        f.add(l3); f.add(t3);
        f.add(b1); f.add(b2); f.add(b3); f.add(b4);

        f.setSize(750, 250);
        f.setLayout(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        try {
            double a = Double.parseDouble(t1.getText());
            double b = Double.parseDouble(t2.getText());

            if (e.getSource() == b1) {
                t3.setText(String.valueOf(a + b));
            } else if (e.getSource() == b2) {
                t3.setText(String.valueOf(a - b));
            } else if (e.getSource() == b3) {
                t3.setText(String.valueOf(a * b));
            } else if (e.getSource() == b4) {
                t1.setText("");
                t2.setText("");
                t3.setText("");
            }
        } catch (Exception ex) {
            t3.setText("Invalid Input");
        }
    }

    public static void main(String[] args) {
        new MyCalc();
    }
}