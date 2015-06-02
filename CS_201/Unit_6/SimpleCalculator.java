package Unit_6;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class SimpleCalculator extends JFrame{

	public JPanel calcPanel;	
	public JTextField result, firstNumber, secondNumber;
	
	SimpleCalculator(){
		
		calcPanel = new JPanel();
		GridLayout grid = new GridLayout(4,3);
		calcPanel.setLayout(grid);
		
		firstNumber = new JTextField("Number 1: ");
		calcPanel.add(firstNumber);
		firstNumber.addFocusListener(new FocusAdapter() {
			  public void focusGained(FocusEvent fEvt) {
				firstNumber = (JTextField)fEvt.getSource();
				firstNumber.selectAll();
			  }
			});
		
		secondNumber = new JTextField("Number 2: ");
		calcPanel.add(secondNumber);
		secondNumber.addFocusListener(new FocusAdapter() {
			  public void focusGained(FocusEvent fEvt) {
				secondNumber = (JTextField)fEvt.getSource();
				secondNumber.selectAll();			    
			  }
			});
		
		result = new JTextField("Result: ");
		calcPanel.add(result);
		
		JButton buttonAdd = new JButton(" Add "); 
		calcPanel.add(buttonAdd);
		ActionListener AddActionListener = new Add();
		buttonAdd.addActionListener(AddActionListener);
		
		JButton buttonSubtract=new JButton(" Subtract ");  
		calcPanel.add(buttonSubtract);
		ActionListener SubtractActionListener = new Subtract();
		buttonSubtract.addActionListener(SubtractActionListener);
		
		JButton buttonMultiply=new JButton(" Multiply ");  
		calcPanel.add(buttonMultiply);
		ActionListener MultiplyActionListener = new Multiply();
		buttonMultiply.addActionListener(MultiplyActionListener);
		
		JButton buttonDivide = new JButton(" Divide ");  
		calcPanel.add(buttonDivide);
		ActionListener DivideActionListener = new Divide();
		buttonDivide.addActionListener(DivideActionListener);		

		add(calcPanel,BorderLayout.CENTER);				
		setTitle(" Simple Calculator ");		
		
		result.setEditable(false);
		add(result, BorderLayout.SOUTH);		
	}
	
	private class Add implements ActionListener{
		
		public void actionPerformed(ActionEvent passEntry){
			
			result.setText(Double.parseDouble(firstNumber.getText()) + Double.parseDouble(secondNumber.getText()) + "");			
		}
	}
	private class Subtract implements ActionListener{
		
		public void actionPerformed(ActionEvent passEntry){

			result.setText(Double.parseDouble(firstNumber.getText()) - Double.parseDouble(secondNumber.getText()) + "");
		}
	}
	private class Divide implements ActionListener{
		
		public void actionPerformed(ActionEvent passEntry){
			
			result.setText(Double.parseDouble(firstNumber.getText()) / Double.parseDouble(secondNumber.getText()) + "");
		}
	}
	private class Multiply implements ActionListener{
		
		public void actionPerformed(ActionEvent passEntry){
			
			result.setText(Double.parseDouble(firstNumber.getText()) * Double.parseDouble(secondNumber.getText()) + "");
		}
	}
	public static void main(String[] args){		
		
		SimpleCalculator calculator = new SimpleCalculator();
		
		calculator.setLocationRelativeTo(null);
		calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		calculator.pack();
		calculator.setVisible(true);  
	}
}