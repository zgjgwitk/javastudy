package zhang.testpackage;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * Created by zhang on 2018/7/30.
 */
public class TestVol {
    public static void main(String[] args) throws Exception{
        Foo foo = new Foo();
        foo.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while(true) {
                    if(foo.isStatus())System.out.println("whattttttt?");
                }
            }
        }).start();
    }
}

class Foo extends Thread{
    volatile private boolean status = false;

    public void change() {
        status = true;
    }

    @Override
    public void run() {
        JFrame frame = new JFrame("Volatile Demo");
        frame.setSize(800, 600);
        frame.setLocation(300, 100);
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        panel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        JButton change = new JButton("Change");
        change.setSize(100, 50);
        change.setFont(new Font("Consolas", Font.BOLD, 20));
        change.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                Foo.this.setStatus(true);
            }
        });
        panel.add(change);
        frame.setContentPane(panel);
        frame.setVisible(true);
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}