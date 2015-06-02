package Unit_5;


import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.*;

public class BorderLayoutDemo extends JFrame {

    public BorderLayoutDemo() {
        
        this.setLayout(new BorderLayout());

        //create panel1 & panel2
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();

        //set to flow layout
        panel1.setLayout(new FlowLayout());
        panel2.setLayout(new FlowLayout());

        //add three buttons to panel1 & panel2
        panel1.add(new JButton(" Button 1 "));
        panel1.add(new JButton(" Button 2 "));
        panel1.add(new JButton(" Button 3 "));
        panel2.add(new JButton(" Button 4 "));
        panel2.add(new JButton(" Button 5 "));
        panel2.add(new JButton(" Button 6 "));

        //add panel1 & panel2 to frame in correct locations using border layout
        this.add(panel1, BorderLayout.CENTER);
        this.add(panel2, BorderLayout.SOUTH);
    }

    public static void main(String[] args) {
        
    	BorderLayoutDemo frame = new BorderLayoutDemo();
        frame.setTitle(" BorderLayoutDemo ");
        frame.pack();
        frame.setLocationRelativeTo(null); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}