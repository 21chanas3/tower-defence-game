package assets;

import utils.Vector2D;

public class Cell {
    private int colour, width, height;
    private Vector2D position;

    public Cell(int colour, int width, int height, Vector2D position) {
        this.colour = colour;
        this.width = width;
        this.height = height;
        this.position = position;
    }

    public void getColour(int colour) {
        this.colour = colour;
    }

    public int setColour() {
        return colour;
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
