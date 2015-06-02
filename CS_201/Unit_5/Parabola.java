package Unit_5;


import java.awt.BorderLayout;
import java.awt.Graphics;
import java.awt.Polygon;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class Parabola extends JFrame {
	
	public Parabola(String graph){
		super(graph);
	}
	
	public static class GraphPanel extends JPanel{		
		protected void paintComponent(Graphics graph){
			
			graph.drawLine(50,200,350,200);
			graph.drawString("x",360,200);
			graph.drawLine(200, 0, 200, 300);
			graph.drawString("y", 200, 310);
			Polygon parabola = new Polygon();
			double scaleFactor=0.1;
			for(int x=-100;x<=100;x++){
				parabola.addPoint(x+200,200-(int)(scaleFactor*x*x));
			}
			graph.drawPolygon(parabola);
		}
	}

	public static void main(String[] args) {

		Parabola frame = new Parabola(" Parabola ");
		BorderLayout border = new BorderLayout();
		frame.setVisible(true);
		frame.setSize(430,400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		Parabola.GraphPanel graph = new Parabola.GraphPanel();
		frame.add(graph, border.CENTER);
	}
}