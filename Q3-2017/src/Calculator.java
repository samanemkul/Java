import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {
    JFrame frame= new JFrame();
    JTextField text1 = new JTextField();
    JTextField text2 = new JTextField();
    JTextField text3 = new JTextField();
    JLabel l1 =new JLabel();
    JLabel l2 = new JLabel();
    JLabel l3 = new JLabel();

    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton button = new JButton();
    public void render(){
       frame.setSize(600,600);
       frame.setResizable(false);
       frame.setVisible(true);
       frame.setLayout(null);
       frame.setTitle("Java program calculator");
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

       text1.setBounds(150,100,90,40);
       frame.add(text1);
       text2.setBounds(150,150,90,40);
       frame.add(text2);
       text3.setBounds(150,200,90,40);
       frame.add(text3);
       l1.setText("First number");
       l1.setBounds(50,100,100,40);
       frame.add(l1);
        l2.setText("Second number");
        l2.setBounds(50,150,100,40);
        frame.add(l2);
        l3.setText("result ");
        l3.setBounds(50,200,90,40);
        frame.add(l3);
        b1.setBounds(250,300,90,70);
        b1.setText("Add");
        frame.add(b1);
        b2.setBounds(350,300,90,70);
        b2.setText("Sub");
        frame.add(b2);
        b1.addActionListener(this);
        b2.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            int num1 = Integer.parseInt (text1.getText());
            int num2 = Integer.parseInt(text2.getText());
            int sum = num1+num2;
            text3.setText(String.valueOf(sum));
        }
        else if(e.getSource()==b2){
            int num1 = Integer.parseInt (text1.getText());
            int num2 = Integer.parseInt(text2.getText());
            int sub = num1-num2;
            text3.setText(String.valueOf(sub));

        }
    }
}
