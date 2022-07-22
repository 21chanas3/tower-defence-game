package assets;

import utils.Vector2D;
import java.awt.Component;
import java.awt.Color;
public class Cell extends Component {
    private int width, height;
    private Color color;
    private Vector2D position;

    public Cell(Color color, int width, int height, Vector2D position) {
        this.color = color;
        this.width = width;
        this.height = height;
        this.position = position;
    }

    public void getColor(Color color) {
        this.color = color;
    }

    public Color setColor() {
        return color;
    }

    public void getWidth(int width) {
        this.width = width;
    }

    public int setWidth() {
        return width;
    }

    public void getHeight(int height) {
        this.height = height;
    }

    public int setHeight() {
        return height;
    }

    public void getPosition(Vector2D position) {
        this.position = position;
    }

    public Vector2D setPosition() {
        return position;
    }


}
