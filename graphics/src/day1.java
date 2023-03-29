import javax.swing.*;

public class day1 {
    JFrame frame = new JFrame();
    GameUI box = new GameUI();
    public void render(){
        frame.add(box);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
