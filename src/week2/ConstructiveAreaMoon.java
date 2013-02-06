package week2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ConstructiveAreaMoon
{
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Area Moon");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new ConstructiveAreaMoon2D();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);		
	}
}

class ConstructiveAreaMoon2D extends JPanel
{
	public ConstructiveAreaMoon2D()
	{
		setPreferredSize(new Dimension(300,270));
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		Ellipse2D ellipse1 = new Ellipse2D.Double(0,10,450,250);
		Ellipse2D ellipse2 = new Ellipse2D.Double(120,10,250,250);
		Rectangle2D rectangle = new Rectangle2D.Double(245,10,250,250);
		
		Area moon = new Area(ellipse1);
		moon.subtract(new Area(ellipse2));
		moon.subtract(new Area(rectangle));
		
		g2.setColor(Color.LIGHT_GRAY);
		g2.fill(moon);
		g2.setColor(Color.BLACK);
		g2.draw(moon);
	}
}
