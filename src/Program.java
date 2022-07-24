import utils.Mapper;
import utils.Vector2D;

import javax.swing.*;

public class Program {

    long timeSinceUpdate = 0;
    private final long FRAME_TIME = (long) ((1.0/10.0) * 1000000000.0);


    public static void main(String[] args) {
        Program program = new Program();
    }

    public Program() {
        onStart();
    }

    private void onStart() {
        final int width = 50;
        final int height = 50;
        final int pixelWidth = 10;
        final int pixelHeight = 10;

        javax.swing.JFrame frame = new javax.swing.JFrame();
        Logic logic = new Logic(width, height);
        Panel panel = new Panel(width, height, pixelWidth, pixelHeight);
        frame.setTitle("Tower Defense");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setSize(width*pixelWidth, height*pixelHeight);
        frame.setVisible(true);
        frame.getContentPane().add(panel);
        frame.setVisible(true);
        frame.repaint();

        long currTime = 0;
        long nextTime = 0;
        while(true) {
            currTime = System.nanoTime();
            onUpdate(panel, currTime - nextTime, logic);
            panel.repaint();
            nextTime = currTime;
        }

    }

    private void onUpdate(Panel panel, long timeElapsed, Logic logic) {
        if (timeSinceUpdate < FRAME_TIME) {
            timeSinceUpdate += timeElapsed;
        } else {
            timeSinceUpdate = 0;
            Vector2D v;
            logic.step();
            for(int i = 0; i < panel.canvasSize(); i++){
                v = Mapper.coordFromIndex(i);
                panel.getCell(v).setColor(logic.setColor(v));
            }
        }
    }

}
