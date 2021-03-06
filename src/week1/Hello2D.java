package week1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class Hello2D extends JApplet
{
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Hello 2D");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JApplet applet = new Hello2D();
		applet.init();
		frame.getContentPane().add(applet);
		frame.pack();
		frame.setVisible(true);		
	}
	
	public void init()
	{
		JPanel panel = new Hello2DPanel();
		getContentPane().add(panel);
	}
	
}

class Hello2DPanel extends JPanel
{
	public Hello2DPanel()
	{
		setPreferredSize(new Dimension(640, 480));
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		Graphics2D g2 = (Graphics2D)g;
		g2.setColor(Color.GREEN);
		Ellipse2D e = new Ellipse2D.Double(-110, -50, 200, 100);
		AffineTransform tr = new AffineTransform();
		tr.rotate(Math.PI / 6.0);
		Shape shape = tr.createTransformedShape(e);
		g2.translate(300, 200);
		g2.scale(2, 2);
		g2.draw(shape);
		g2.setColor(Color.BLACK);
		g2.drawString("Hello 2D", 0, 0);
	}
}
