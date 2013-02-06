package week2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlottingEquationCosSin extends JApplet{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Plotting Cos and Sin");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JApplet applet = new PlottingEquationCosSin();
		applet.init();
		
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void init()
	{
		JPanel panel = new PlottingEquationCosSin2D();
		getContentPane().add(panel);
	}
}

class PlottingEquationCosSin2D extends JPanel
{
	public PlottingEquationCosSin2D()
	{
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.CYAN);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(100,100);
		
		int t = 0;
		int x1 = (int)((20*t)*Math.cos(t));
		int y1 = (int)((20*t)*Math.sin(t));
		int x2;
		int y2;
		
		for(t = 1; t <= 8; t++) {
			x2 = (int)((20*t)*Math.cos(t));
			y2 = (int)((20*t)*Math.sin(t));
			g2.drawLine(x1, y1, x2, y2);
			x1 = x2;
			y1 = y2;
		}
	}
}