import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Hello world");
        frame.setResizable(false);//Disable resize
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);//toggle visibility
        JButton button = new JButton("Click me");
        button.setBounds(100,100,100,50);
        frame.add(button);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.RED);



    }
}