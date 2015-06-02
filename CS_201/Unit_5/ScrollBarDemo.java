package Unit_5;


import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class ScrollBarDemo extends JFrame{
	
	public JPanel panel, panel2;
	public JLabel label;
	public JSlider jslider1,jslider2,jslider3;
	
	ScrollBarDemo(){
		
		panel2 = new JPanel();
		panel2.setBorder(new EmptyBorder(2, 2, 2, 2));
		label = new JLabel(" Show Colors");
		label.setForeground(Color.BLACK);
		panel2.add(label);
		
		panel = new JPanel();
		setTitle(" Scroll Bars Demo ");
		panel.setBorder(new CompoundBorder(new TitledBorder(" Choose colors "),new EmptyBorder(2, 2, 2, 2)));
				
		jslider1 = new JSlider(JSlider.HORIZONTAL);
		ChangeListener listener1 = new Listener1();
		jslider1.addChangeListener(listener1);
		panel.add(jslider1);
		
		jslider2 = new JSlider(JSlider.HORIZONTAL);
		ChangeListener listener2 = new Listener2();
		jslider2.addChangeListener(listener2);
		panel.add(jslider2);		
		
		jslider3 = new JSlider(JSlider.HORIZONTAL);					
		ChangeListener listener3 = new Listener3();				
		jslider3.addChangeListener(listener3);		
		panel.add(jslider3);
		
		BorderLayout border = new BorderLayout();
		add(panel2, border.NORTH);
		add(panel, border.CENTER);				
	}
	public static void main(String[] args){
		
		ScrollBarDemo scr = new ScrollBarDemo();
		scr.setSize(300, 200);
		scr.setLocationRelativeTo(null);
		scr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		scr.setVisible(true);  
	}
	class Listener1 implements ChangeListener{		
		public void stateChanged(ChangeEvent slide){			
			label.setForeground(Color.RED);
		}  
	}
	class Listener2 implements ChangeListener{		
		public void stateChanged(ChangeEvent slide){			
			label.setForeground(Color.GREEN);
		}  
	}
	class Listener3 implements ChangeListener{		
		public void stateChanged(ChangeEvent slide){			
			label.setForeground(Color.BLUE);
		}  
	}
}