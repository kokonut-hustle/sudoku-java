import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Sudoku extends JFrame implements ActionListener, KeyListener {
    private Container cn;
    private JPanel pn1, pn2;
    private JLabel time_lb, sls_lb;
    private JButton newGame_bt, highScore_bt;

    public Sudoku() {
        cn = init();
    }

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

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
