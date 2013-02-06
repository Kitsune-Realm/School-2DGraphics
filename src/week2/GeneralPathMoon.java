package week2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GeneralPathMoon {
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("General Path Moon");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new GeneralPathMoon2D();
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}

class GeneralPathMoon2D extends JPanel
{
	public GeneralPathMoon2D()
	{
		setPreferredSize(new Dimension(300, 270));
	}
	
	public void paintComponent(Graphics g)
	{
		Graphics2D g2 = (Graphics2D)g;
		GeneralPath path = new GeneralPath();
		
		
		path.moveTo(225, 0);
		path.quadTo(40, 125, 225, 250);
		path.quadTo(50, 220, 50, 125);
		path.quadTo(50, 5, 225, 0);
		
		g2.setColor(Color.LIGHT_GRAY);
		g2.fill(path);
		g2.setColor(Color.BLACK);
		g2.draw(path);
		
	}
}