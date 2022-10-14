import javax.swing.*;
import java.awt.*;

public class Container {
    public Container init() {
        Container cn = this.getContentPane();
        pn2 = new JPanel();
        pn2.setLayout(new FlowLayout());
        time_lb = new JLabel("00:00:00:00");
        sls_lb = new JLabel("3 times remaining");

        newGame_bt = new JButton("New Game");
        newGame_bt.addActionListener(this);
        highScore_bt = new JButton("High Score");
        highScore_bt.addActionListener(this);
    }
}
