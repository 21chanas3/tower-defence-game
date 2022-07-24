package assets;

import utils.Vector2D;

import java.awt.*;

public class Cell extends Component {
    private final int width, height;
    private final int x,y;
    private Color color;

    public Cell(Color color, int width, int height, int x, int y) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void draw(Graphics g) {
        Graphics2D graphics = (Graphics2D) g;
        graphics.setColor(color);
        graphics.fillRect(x, y, width, height);
    }

}
