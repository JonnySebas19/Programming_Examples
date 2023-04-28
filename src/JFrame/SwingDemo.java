package JFrame;
import javax.swing.JFrame;
import javax.swing.JButton;
public class SwingDemo {
    public static final int width = 300;
    public static final int height = 200;
    public static void main(String[] args){
        JFrame firstWindow = new JFrame();
        firstWindow.setSize(width, height);

        firstWindow.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JButton endButton = new JButton("Click to end program");
        EndingListener buttonEar = new EndingListener();
        endButton.addActionListener(buttonEar);
        firstWindow.add(endButton);

        firstWindow.setVisible(true);
    }
}
