import javax.swing.*;
import java.awt.*;

public class layout{
    JFrame frame= new JFrame();
    public void render(){
        frame.setLayout(new BorderLayout());
        frame.setSize(400,400);
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel p1 = new JPanel();
        p1.setBackground(Color.ORANGE);
        frame.add(p1,BorderLayout.WEST);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.CYAN);
        frame.add(p2,BorderLayout.EAST);
        JPanel p3 = new JPanel();
        p3.setBackground(Color.BLUE);
        frame.add(p3,BorderLayout.NORTH);
        JPanel p4 = new JPanel();
        p4.setBackground(Color.BLACK);
        frame.add(p4,BorderLayout.SOUTH);
        JPanel p5 = new JPanel();
        p5.setBackground(Color.GRAY);
        frame.add(p5,BorderLayout.CENTER);
        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        p3.add(new JButton("CLICK ME"));
        p1.setLayout(new BoxLayout(p1,BoxLayout.Y_AXIS));
        p1.add(new JButton("CLICK ME"));
        p1.add(new JButton("CLICK ME"));

        p5.setLayout(new GridLayout(2,2));

        p5.add(new JButton("CLICK ME"));
        p5.add(new JButton("CLICK ME"));
        p5.add(new JButton("CLICK ME"));
        p5.add(new JButton("CLICK ME"));







    }
}
