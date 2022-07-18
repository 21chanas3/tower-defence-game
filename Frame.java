import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import assets.Cell;

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
        panel = new JPanel(new GridLayout(100, 100, 0 , 0));
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                Cell addCells = new Cell();
                panel.add(addCells);
            }
        }
        add(panel);
    }
}
