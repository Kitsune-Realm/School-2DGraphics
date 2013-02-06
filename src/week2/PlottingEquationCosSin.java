package week2;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;

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
		/*
		double t = 0;		
		GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
		
		double x1 = (20*t)*Math.cos(t);
		double y1 = (20*t)*Math.sin(t);
		
		path.moveTo(x1,y1);
		
		for(t=1; t<=(8*Math.PI); t++) {
			path.lineTo((20*t)*Math.cos(t),(20*t)*Math.sin(t));
		}
		g2.draw(path);*/
		double t = 0;
		int v = 3;
		double x1 = (v*t)*Math.cos(t);
		double y1 = (v*t)*Math.sin(t);
		double x2;
		double y2;
		
		for(t=1; t<=(8*Math.PI); t+=0.01) {			
			x2 = (v*t)*Math.cos(t);
			y2 = (v*t)*Math.sin(t);			
			g2.drawLine((int)x1,(int)y1,(int)x2,(int)y2);
			x1 = x2;
			y1 = y2;
		}
	}
}