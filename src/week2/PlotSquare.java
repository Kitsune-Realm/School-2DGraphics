
package week2;

import java.awt.*;

import javax.swing.*;
import java.awt.geom.*;

public class PlotSquare {
	
	public static void main(String s[])
	{
		JFrame frame = new JFrame("Hoofdstuk 2 - Rotated Square");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new PlotSquare2D();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}
}


class PlotSquare2D extends JPanel {


	public PlotSquare2D()
	{
		setPreferredSize( new Dimension(200,150));
	}

	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		
		g2.setColor(Color.red);
		
		Rectangle2D rectangle = new Rectangle2D.Double(-50, -50, 100, 100);
		AffineTransform tr = new AffineTransform();
		tr.rotate(Math.PI / 4.0);		
		Shape shape = tr.createTransformedShape(rectangle);
		
		g2.translate(100, 75);
		g2.draw(shape);		
	}
}
