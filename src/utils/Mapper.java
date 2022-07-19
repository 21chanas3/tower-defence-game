package utils;

public class Mapper {

    public static int vectorToIndex(Vector2D vector) {
         return (int)Math.sqrt(Math.pow(vector.getX(), 2) + Math.pow(vector.getY(), 2));
    }

    /*
    public static Vector2D indexToVector(int index) {
        return (x, 0);
    }
    */
}
