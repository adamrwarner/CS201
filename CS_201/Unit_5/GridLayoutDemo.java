package Unit_5;


import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.*;

public class GridLayoutDemo extends JFrame {

	public GridLayoutDemo() {		
		
		this.setLayout(new GridLayout(2,3));
		
		//create panel1 & panel2
		JPanel panel1 = new JPanel(); 
		JPanel panel2 = new JPanel();
		
		//set to grid layout
		panel1.setLayout(new GridLayout(2,3));
        panel2.setLayout(new GridLayout(2,3));
		
        //add three buttons to panel1 & panel2
        panel1.add(new JButton(" Button 1 "));
		panel1.add(new JButton(" Button 2 "));
		panel1.add(new JButton(" Button 3 "));						
		panel2.add(new JButton(" Button 4 "));
		panel2.add(new JButton(" Button 5 "));
		panel2.add(new JButton(" Button 6 "));
		
		//add panel1 & panel2 to frame in correct locations using border layout
		this.add(panel2, BorderLayout.CENTER);
        this.add(panel1, BorderLayout.SOUTH);
	}

	public static void main(String[] argv) {
		
		GridLayoutDemo frame = new GridLayoutDemo();
		
		frame.setTitle(" Gridlayout Demo ");
		frame.pack();
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}