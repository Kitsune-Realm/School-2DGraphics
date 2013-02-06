package week2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlotChessBoard {
	
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("Chessboard");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new PlotChessBoard2D();
		
		frame.getContentPane().add(panel);
		frame.pack();
		frame.setVisible(true);
	}	
}

class PlotChessBoard2D extends JPanel
{
	public PlotChessBoard2D()
	{
		setPreferredSize(new Dimension(300,230));		
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponents(g);
		Graphics2D g2 = (Graphics2D)g;
		int mod = 30;
		int i = 0;
		for(int row=0; row<8; row++) {
			for(int col=0; col<8; col++) {
				Rectangle2D rectangle = new Rectangle2D.Double((row*mod),(col*mod),mod,mod);
				Color fieldColor = (i%2==0) ? Color.WHITE : Color.BLACK;
				i++;
				System.out.println(row + "-" + col + "-" + i);
				g2.setColor(fieldColor);
				g2.fill(rectangle);
				g2.draw(rectangle);
			}
			i--;
		}
	}
}