package week1;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlottingEquation extends JApplet{
	
	
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Plotting Equations");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JApplet applet = new PlottingEquation();
		applet.init();
		
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);
	}
	
	public void init()
	{
		JPanel panel = new PlottingEquation2D();
		getContentPane().add(panel);
	}
}

class PlottingEquation2D extends JPanel
{
	public PlottingEquation2D()
	{
		setPreferredSize(new Dimension(1200,1200));
		setBackground(Color.YELLOW);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		//g2.scale(1,1);
		g2.translate(20, 130);
		
		int x1 = (int)Math.pow(-5,2);
		int y1 = (int)Math.pow(-5,3);
		int x2;
		int y2;
		for(int i=-4; i<=5; i++) {
			x2 = (int)Math.pow(i,2);
			y2 = (int)Math.pow(i,3);
			g2.drawLine(x1, y1, x2, y2);
			x1 = x2;
			y1 = y2;
		}
	}
}
