import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Multiply implements ActionListener {
    JFrame frame = new JFrame();
    JTextField T1 = new JTextField();
    JTextField T2 = new JTextField();
    JTextField T3 = new JTextField();
    JButton B1 = new JButton();
    JButton B2 = new JButton();
    void  render(){
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setResizable(false);

        T1.setBounds(50,50,70,40);
        frame.add(T1);

        T2.setBounds(50,100,70,40);
        frame.add(T2);

        T3.setBounds(50,150,70, 40);
        frame.add(T3);
        B1.setBounds(200,200,70,40);
        B1.setText("Mul");
        B1.addActionListener(this);
        frame.add(B1);
        B2.setBounds(300,200,70,40);
        B2.setText("Exit");
        B2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        frame.add(B2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt (T1.getText());
        int num2 = Integer.parseInt (T2.getText());
        int mul = num1*num2;
        T3.setText(String.valueOf(mul));
        System.out.println("The square is "+mul);
    }
}
