package week2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlotSquare extends JApplet{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Plot Square turn 45 degrees");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JApplet applet = new PlotSquare();
		applet.init();
		
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);		
	}
	
	public void init()
	{
		JPanel panel = new PlotSquare2D();
		getContentPane().add(panel);		
	}
}

class PlotSquare2D extends JPanel
{
	public PlotSquare2D()
	{
		setPreferredSize(new Dimension(500, 500));
		setBackground(Color.GREEN);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.translate(100,100);
		
		
	}
}