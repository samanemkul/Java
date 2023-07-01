import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sum implements ActionListener {
    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JLabel label = new JLabel();
    void render(){
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setResizable(false);//Disable resize
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JTextField textField = new JTextField();
        textField.setBounds(200,50,70,20);
        frame.add(textField);

        textField1.setBounds(200,70,80,20);
        frame.add(textField1);

        textField2.setBounds(200,100,80,20);
        frame.add(textField2);


        JButton button = new JButton();
        button.setBounds(100,300,80,50);
        button.setText("Add");
        button.addActionListener( this);
        frame.add(button);
//        JButton button2 = new JButton();
//        button2.setBounds(200,300,80,50);
//        button2.setText("Sub");
//        frame.add(button2);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int num1 = Integer.parseInt (textField.getText());
        int num2 = Integer.parseInt(textField1.getText());
        int sum = num1+num2;
        textField2.setText(String.valueOf(sum));
        System.out.println("Sum is "+sum);
    }
}
