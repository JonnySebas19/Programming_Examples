package JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class EndingListener implements ActionListener{
    @Override
    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}
