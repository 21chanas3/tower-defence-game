import utils.Mapper;
import utils.Vector2D;

import java.awt.*;

public class Logic {
    private int width;
    private int height;
    private Mapper mapper;

    public Logic(int width, int height){
        this.width = width;
        this.height = height;
        this.mapper = new Mapper(width, height);
    }

    public void step(){

    }

    public Color setColor(Vector2D v){
        return Color.BLACK;
    }
}
