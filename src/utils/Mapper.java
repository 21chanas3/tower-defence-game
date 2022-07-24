package utils;

public class Mapper {
    private static int width;
    private static int length;

    public Mapper(int width, int length) {
        this.width = Math.max(width,1);
        this.length = Math.max(length, 1);
    }

    public static int indexFromCoord(int x, int y) {
        if(x >= width || y >= length || x < 0 || y < 0) {
            return -1;
        } else {
            return width * y + x;
        }
    }

    public static int indexFromCoord(Vector2D v) {
        return indexFromCoord(v.getX(), v.getY());
    }

    public static Vector2D coordFromIndex(int i) {
        return new Vector2D(i % width,i / width);
    }
}
