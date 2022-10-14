import javax.swing.*;
import java.awt.*;

public class Container {
    public Container init() {
        Container cn = this.getContentPane();
        pn2 = new JPanel();
        pn2.setLayout(new FlowLayout());
        time_lb = new JLabel("00:00:00:00");
        sls_lb = new JLabel("3 times remaining");

    }
}
