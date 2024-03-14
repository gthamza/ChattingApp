import javax.swing.*;
import java.awt.*;

public class Server extends JFrame {

    Server() {
        setLayout(null);


        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,450,70);
        setLayout(null);
        add(p1);


        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));;// Capitalize "I" in ImageIcon
        JLabel back = new JLabel(i1); // Passing the image icon to JLabel constructor
        back.setBounds(5,25,20,25);
        p1.add(back);

        setSize(470, 700);
        setLocation(200, 50);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Server();
    }
}
