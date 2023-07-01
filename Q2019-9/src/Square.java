import com.sun.jdi.event.MethodExitEvent;

import javax.swing.*;
import javax.swing.plaf.PanelUI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Square implements ActionListener {
    JFrame frame= new JFrame();
    JTextField T1 = new JTextField();
    JTextField T2 = new JTextField();
    JButton button = new JButton();
    public void render(){
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);//Disable resize
        frame.setSize(500,500);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        T1.setBounds(200,50,70,20);
        frame.add(T1);
        T2.setBounds(200,100,100,20);
        frame.add( T2);
        JButton button = new JButton();
        button.setBounds(100,300,100,50);
        button.setText("Square");
        button.addActionListener(this);
        frame.add(button);
        JButton button2 = new JButton();
        button2.setBounds(200,300,100,50);
        button2.setText("Exit");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num = Integer.parseInt (T1.getText());
        int sqr = num*num;
        T2.setText(String.valueOf(sqr));
        System.out.println("The square is "+sqr);

    }
}
