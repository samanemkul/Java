import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameUI extends JPanel implements ActionListener {
    int boxX = 10;
    int boxY = 10;
    JButton button = new JButton("Move");
    JButton leftbtn  = new JButton("Move");
    GameUI(){


        button.addActionListener(this);
        add(button);
        add(leftbtn);
        leftbtn.addActionListener(this);
    }
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillRect(10,10,100,100);

        g.setColor(Color.RED);
        g.fillRect(100,10,100,100);
        g.setColor(Color.GRAY);
        g.fillRect(100,150,100,100);
        g.setColor(Color.BLACK);
        g.fillRect(10,150,100,100);
        g.setColor(Color.PINK);
        g.fillRect(boxX,boxY,100,100);
        g.setColor(Color.GREEN);
        g.fillRect(10,250,400,100);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== button){
            boxX+=10;
        } else if (e.getSource()==leftbtn) {
            boxX-=10;

        }
        System.out.println("clicked");

        repaint();
    }
}
