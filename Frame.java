import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.GridLayout;
import assets.Cell;
import utils.Vector2D;
import java.util.ArrayList;

public class Frame extends JFrame {
    private JPanel panel;
    private ArrayList<Cell> cells = new ArrayList<Cell>();

    public Frame() {
        initializeFrame();
    }

    private void initializeFrame() {
        setTitle("Tower Defense");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
        panel = new JPanel(new GridLayout(100, 100, 0 , 0));
        for (int i = 0; i < 50; i++) {
            for (int j = 0; j < 50; j++) {
                cellArrayList.add(new Cell(new Vector2D(i, j)));
            }
        }
        add(panel);
    }

    public Cell getCell(int i, int j) {
        return cells.get(i * 50 + j);
    }

    public Cell getCell(Vector2D position) {
        return getCell(position.getX(), position.getY());
    }
}
