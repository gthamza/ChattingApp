import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Server extends JFrame implements ActionListener{
    Server() {
        setLayout(null);
        // making panal
        JPanel p1 = new JPanel();
        p1.setBackground(new Color(7,94,84));
        p1.setBounds(0,0,450,70);
        p1.setLayout(null); // Setting layout to null for custom positioning
        add(p1);

        // putting back button
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/3.png"));
        Image i2 = i1.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel back = new JLabel(i3); // Passing the image icon to JLabel constructor
        back.setBounds(5, 25, 25, 25); // Adjusted bounds for positioning
        p1.add(back);

        // making back button function
        back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.exit(0);
            }
        });
         // putting
        ImageIcon i4 = new ImageIcon(ClassLoader.getSystemResource("icons/1.png"));
        Image i5 = i4.getImage().getScaledInstance(50, 50,Image.SCALE_DEFAULT);
        ImageIcon i6 = new ImageIcon(i5);
        JLabel profile = new JLabel(i6);// Passing the image icon to JLabel constructor
        profile.setBounds(40, 10, 50, 50);
        // Adjusted bounds for positioning
        p1.add(profile);

        // adding video button
        ImageIcon i7 = new ImageIcon(ClassLoader.getSystemResource("icons/video.png"));
        Image i8 = i7.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ImageIcon i9 = new ImageIcon(i8);
        JLabel video = new JLabel(i9); // Passing the image icon to JLabel constructor
        video.setBounds(300, 20, 30, 30); // Adjusted bounds for positioning
        p1.add(video);

       // adding call button
        ImageIcon i10 = new ImageIcon(ClassLoader.getSystemResource("icons/phone.png"));
        Image i11 = i10.getImage().getScaledInstance(25, 25,Image.SCALE_DEFAULT);
        ImageIcon i12 = new ImageIcon(i11);
        JLabel phone = new JLabel(i12); // Passing the image icon to JLabel constructor
        phone.setBounds(360, 20, 30, 30); // Adjusted bounds for positioning
        p1.add(phone);

        ImageIcon i14 = new ImageIcon(ClassLoader.getSystemResource("icons/3icon.png"));
        Image i15 = i14.getImage().getScaledInstance(10, 25,Image.SCALE_DEFAULT);
        ImageIcon i16 = new ImageIcon(i15);
        JLabel  arrow= new JLabel(i16); // Passing the image icon to JLabel constructor
        arrow.setBounds(400, 20, 30, 30); // Adjusted bounds for positioning
        p1.add(arrow);

        //adding server name
        JLabel name = new JLabel("TAHA");
        name.setBounds(100,30,90,18);
        name.setBackground(Color.white);
        name.setFont(new Font("SAN SERIF",Font.BOLD,17));
        p1.add(name);

        // ADDING STATUS
        JLabel status = new JLabel("active now");
        status.setBounds(110,35,40,570);
        status.setForeground(Color.yellow);



        // properties of frame and make
        setSize(470, 700);
        setLocation(200, 50);
        getContentPane().setBackground(Color.white);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public static void main(String[] args) {
        new Server();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
