package game;

import javax.swing.JFrame;

public class Frame extends JFrame {
    public Frame() {
        initializeFrame();
    }

    public void initializeFrame() {
        setTitle("Tower Defense");
        setTitle("Tower Defence");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setSize(500, 500);
        setVisible(true);
    }
}
