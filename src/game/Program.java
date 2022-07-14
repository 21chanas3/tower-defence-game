package game;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.GridLayout;

public class Program {
    public static void main(String args[]) {
        JFrame frame = new JFrame("QuickTest");
        JLabel emptyLabel = new JLabel("");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(emptyLabel, BorderLayout.CENTER);
        frame.setSize(500, 500);
        frame.setVisible(true);
        frame.setLayout(new GridLayout(10,10));
    }

}