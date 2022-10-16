import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.FileNotFoundException;

public class Sudoku extends JFrame implements ActionListener, KeyListener {
    private Container cn;
    private JButton bt[][];
    private JPanel pn1, pn2;
    private JLabel time_lb, sls_lb;
    private JComboBox lvl;
    private JButton newGame_bt, highScore_bt;
    private int LV = 0;
    private Timer timer;

    public Sudoku(int k) {
        LV = k;
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

        lvl.addItem("Easy");
        lvl.addItem("Medium");
        lvl.addItem("Hard");
        lvl.setSelectedIndex(LV);

        pn2.add(newGame_bt);
        pn2.add(lvl);
        pn2.add(time_lb);
        pn2.add(sls_lb);
        pn2.add(highScore_bt);

        cn.add(pn2, "North");

        pn1 = new JPanel();
        pn1.setLayout(new GridLayout(9, 9));
        for (int i = 0; i < 9; ++i)
            for (int j = 0; j < 9; ++j) {
                bt[i][j] = new JButton();
                bt[i][j].addActionListener(this);
                bt[i][j].addKeyListener(this);
                bt[i][j].setActionCommand(i + " " + j);
                bt[i][j].setBackground(Color.white);
                bt[i][j].setFont(new Font("UTM Micra", 1, 30));
                bt[i][j].setForeground(Color.black);
                pn1.add(bt[i][j]);
            }

        // Set border for table
        for (int i = 0; i < 9; i += 3)
            for (int j = 0; j < 9; j += 3) {
                bt[i][j].setBorder(BorderFactory.createMatteBorder(3,3,1,1, Color.black));
                bt[i][j + 2].setBorder(BorderFactory.createMatteBorder(3,1,1,3, Color.black));
                bt[i + 2][j + 2].setBorder(BorderFactory.createMatteBorder(1,1,3,3, Color.black));
                bt[i + 2][j].setBorder(BorderFactory.createMatteBorder(1,3,3,1, Color.black));
                bt[i][j + 1].setBorder(BorderFactory.createMatteBorder(3,1,1,1, Color.black));
                bt[i + 1][j + 2].setBorder(BorderFactory.createMatteBorder(1,1,1,3, Color.black));
                bt[i + 2][j + 1].setBorder(BorderFactory.createMatteBorder(1,1,3,1, Color.black));
                bt[i + 1][j].setBorder(BorderFactory.createMatteBorder(1,3,1,1, Color.black));
                bt[i + 1][j + 1].setBorder(BorderFactory.createMatteBorder(1,1,1,1, Color.black));
            }

        cn.add(pn1);
        this.setVisible(true);
        this.setSize(700, 700);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        try {
            creatMatrix();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        timer = new Timer(10, new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                time_lb.setText(next(time_lb));
            }
        });
        return cn;
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

    public static void main(String[] args) {
        new Sudoku(0).timer.start();
    }
}
