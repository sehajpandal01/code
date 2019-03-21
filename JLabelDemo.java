import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JLabelDemo {

    public JLabel labelText;
    public JLabelDemo() {
        JFrame f = new JFrame("First Name Last Name");
        f.setVisible(true);
        f.setSize(500, 500);
        f.setLayout(null);

        labelText = new JLabel("Hello There");
        labelText.setBounds(50, 100, 150, 30);
        f.add(labelText);

        JButton btn = new JButton("Sehaj Pandal");
        btn.setBounds(70, 200, 150, 60);
        f.add(btn);

        JButton btn1 = new JButton("CLICK HERE");
        btn.setBounds(90, 200, 150, 60);
        f.add(btn1);

        JButton btn2 = new JButton("OR HERE");
        btn.setBounds(70, 100, 150, 60);
        f.add(btn2);


        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                labelText.setText("sup");
            }
        });

    }

    public static void main(String[] args) {
        new JLabelDemo();
    }
}