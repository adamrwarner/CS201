package Unit_5;


import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;


public class ATM extends JFrame{

	public JPasswordField password;
	public JPanel buttonPanel;	
	public static int correctPin = 1234;
	public int passTrial = 3;
	
	ATM(){
		
		buttonPanel=new JPanel();
		GridLayout grid=new GridLayout(4,3);
		ActionListener buttonActionListener = new ButtonAction();
		buttonPanel.setLayout(grid);
		JButton buttonOne=new JButton("1"); 
		buttonPanel.add(buttonOne);
		buttonOne.addActionListener(buttonActionListener);
		JButton buttonTwo=new JButton("2");  
		buttonPanel.add(buttonTwo);
		buttonTwo.addActionListener(buttonActionListener);
		JButton buttonThree=new JButton("3");  
		buttonPanel.add(buttonThree);
		buttonThree.addActionListener(buttonActionListener);
		JButton buttonFour=new JButton("4");  
		buttonPanel.add(buttonFour);
		buttonFour.addActionListener(buttonActionListener);
		JButton buttonFive=new JButton("5");  
		buttonPanel.add(buttonFive);
		buttonFive.addActionListener(buttonActionListener);
		JButton buttonSix=new JButton("6");  
		buttonPanel.add(buttonSix);
		buttonSix.addActionListener(buttonActionListener);
		JButton buttonSeven=new JButton("7"); 
		buttonPanel.add(buttonSeven);
		buttonSeven.addActionListener(buttonActionListener);
		JButton buttonEight=new JButton("8");  
		buttonPanel.add(buttonEight);
		buttonEight.addActionListener(buttonActionListener);
		JButton buttonNine=new JButton("9");
		buttonPanel.add(buttonNine);
		buttonNine.addActionListener(buttonActionListener);
		JButton buttonZero=new JButton("0");  
		buttonPanel.add(buttonZero);
		buttonZero.addActionListener(buttonActionListener);
		JButton buttonEnter=new JButton("Enter");
		buttonPanel.add(buttonEnter);
		ActionListener enterActionListener = new EnterAction();
		buttonEnter.addActionListener(enterActionListener);
		JButton buttonClear=new JButton("Clear");
		buttonPanel.add(buttonClear);
		ActionListener clearActionListener = new ClearAction();
		buttonClear.addActionListener(clearActionListener);	

		//BorderLayout border = new BorderLayout();
		add(buttonPanel,BorderLayout.SOUTH);				
		setTitle(" ATM PIN AUTHENTICATION ");		
		
		password = new JPasswordField(20);
		password.setEditable(false);
		add(password, BorderLayout.NORTH);		
	}
	private class ButtonAction implements ActionListener{
		
		public void actionPerformed(ActionEvent passEntry){
			String pass=new String(password.getPassword());
			if(pass.length() < 4){
				password.setText(pass+passEntry.getActionCommand());
			}
		}
	}
	private class ClearAction implements ActionListener{
		
		public void actionPerformed(ActionEvent passEntry){
			password.setText("");
		}
	}
	private class EnterAction implements ActionListener{
		
		public void actionPerformed(ActionEvent passEntry){
			
			String pass = new String(password.getPassword());
			
			if(!pass.equals("")){
				int PIN = Integer.parseInt(pass);
				if(correctPin == PIN){
					
					JOptionPane.showMessageDialog(null, " Welcome to CS201 Bank ");
					buttonPanel.setVisible(false);
					password.setVisible(false);
					JLabel welcomeMessage = new JLabel(" Welcome to CS201 Bank ");
					add(welcomeMessage,BorderLayout.NORTH);
				}else{
					
					if(passTrial>0){
						
						JOptionPane.showMessageDialog(null, " Incorrect PIN , " + passTrial + " tries until system exit ");
						password.setText("");
						passTrial--;
					}else{
						
						JOptionPane.showMessageDialog(null, " Please contact administartor ");
						buttonPanel.setVisible(false);
						password.setVisible(false);
						password.setText("");
						JLabel adminMessage = new JLabel(" Please contact administartor ");
						add(adminMessage, BorderLayout.NORTH);
					}
				}
			}
		}
	}
	public static void main(String[] args){		
		
		ATM atm=new ATM();
		
		atm.setLocationRelativeTo(null);
		atm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		atm.pack();
		atm.setVisible(true);  
	}
}