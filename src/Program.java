import javax.swing.SwingUtilities;

public class Program {
    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable () {
            @Override
            public void run() {
                Frame newFrame = new Frame();
                newFrame.repaint();
            }
        });

    }
}
