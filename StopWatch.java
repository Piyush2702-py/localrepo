import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StopWatch extends JFrame implements ActionListener, Runnable
{
    JLabel timeLabel;
    JButton start, reset;

    int ms = 0, sec = 0, min = 0, hr = 0;
    boolean running = false;

    Thread t;

    StopWatch()
    {
        setTitle("Stop Watch");
        setSize(300,200);
        setLayout(new FlowLayout());

        JLabel title = new JLabel("Stop Watch");
        title.setFont(new Font("Arial", Font.BOLD, 22));
        title.setForeground(Color.BLUE);

        timeLabel = new JLabel("00 : 00 : 00 : 00");
        timeLabel.setFont(new Font("Arial", Font.BOLD, 20));

        start = new JButton("Start");
        reset = new JButton("Reset");

        start.addActionListener(this);
        reset.addActionListener(this);

        add(title);
        add(timeLabel);
        add(start);
        add(reset);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==start)
        {
            if(!running)
            {
                running = true;
                t = new Thread(this);
                t.start();
            }
        }

        if(e.getSource()==reset)
        {
            running = false;
            ms=sec=min=hr=0;
            timeLabel.setText("00 : 00 : 00 : 00");
        }
    }

    public void run()
    {
        try
        {
            while(running)
            {
                Thread.sleep(10);

                ms++;

                if(ms==100)
                {
                    ms=0;
                    sec++;
                }

                if(sec==60)
                {
                    sec=0;
                    min++;
                }

                if(min==60)
                {
                    min=0;
                    hr++;
                }

                timeLabel.setText(
                    String.format("%02d : %02d : %02d : %02d",hr,min,sec,ms));
            }
        }
        catch(Exception e){}
    }

    public static void main(String args[])
    {
        new StopWatch();
    }
}