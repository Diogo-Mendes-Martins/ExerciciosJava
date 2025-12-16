package clock;
import javax.swing.*;
import java.awt.*;
import java.text.DateFormat;
import java.util.Date;

public class ClockSwing extends JFrame implements Runnable {
    private JLabel timeLabel;
    private DateFormat timeFormat;
    private volatile boolean running = true;

    public ClockSwing() {
        timeLabel = new JLabel("", SwingConstants.CENTER);
        timeLabel.setFont(new Font("Helvetica", Font.BOLD, 24));
        add(timeLabel, BorderLayout.CENTER);

        timeFormat = DateFormat.getTimeInstance(DateFormat.MEDIUM);
        setSize(300, 100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        new Thread(this).start();
    }

    public void run() {
        while (running) {
            timeLabel.setText(timeFormat.format(new Date()));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                running = false;
            }
        }
    }

    public static void main(String[] args) {
        new ClockSwing();
    }
}

