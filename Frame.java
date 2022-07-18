import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;

public class Frame extends JFrame {
    private JPanel panel;

    public Frame() {
        initializeFrame();
    }

    private void initializeFrame() {
        setTitle("Tower Defense");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }
}
