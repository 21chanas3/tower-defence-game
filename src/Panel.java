import javax.swing.JPanel;
import assets.Cell;
import utils.Mapper;
import utils.Vector2D;

import java.util.ArrayList;
import java.awt.Color;
import java.awt.Graphics;

public class Panel extends JPanel {
    private int width, height;
    private ArrayList<Cell> cells;
    private Mapper mapper;

    public Panel(int width, int height, int pixelWidth, int pixelHeight) {
        this.width = width;
        this.height = height;
        mapper = new Mapper(width, height);
        cells = new ArrayList();
        Vector2D currentCoordinates;
        for (int i = 0; i < width*height; i++) {
            currentCoordinates = mapper.coordFromIndex(i);
            cells.add(new Cell(Color.WHITE,pixelWidth, pixelHeight,currentCoordinates.getX()*pixelWidth,currentCoordinates.getY()*pixelHeight));
        }
    }

    public Cell getCell(int x, int y) {
        return cells.get(y * width + x);
    }

    public Cell getCell(Vector2D position) {
        return getCell(position.getX(), position.getY());
    }

    public void paintComponent(Graphics g) {
        for (Cell cell : cells) {
            cell.draw(g);
        }
    }

    public int canvasSize(){
        return(width*height);
    }
}
