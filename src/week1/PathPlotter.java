package week1;


import java.awt.*;

import javax.swing.*;
import java.awt.geom.*;

public class PathPlotter extends JApplet {
  public static void main(String s[]) {
    JFrame frame = new JFrame();
    frame.setTitle("Java Path Plotter");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JApplet applet = new PathPlotter();
    applet.init();
    frame.getContentPane().add(applet);
    frame.pack();
    frame.setVisible(true);
  }

  public void init() {
    JPanel panel = new PathPanel2D();
    getContentPane().add(panel);
  }
}

class PathPanel2D extends JPanel{
  public PathPanel2D() {
    setPreferredSize(new Dimension(400, 550));
    setBackground(Color.white);
  }

  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    Graphics2D g2 = (Graphics2D)g;
    
    //Ellipse2D ellipse = new Ellipse2D.Float(100, 300, 80, 100);
    //g2.draw(ellipse);
    
    GeneralPath path = new GeneralPath(GeneralPath.WIND_NON_ZERO);
    GeneralPath path2 = new GeneralPath(GeneralPath.WIND_NON_ZERO);
    
    path.moveTo(30, 10);
    path.lineTo(80, 10);
    path.lineTo(80, 60);
    path.lineTo(40, 60);
    path.lineTo(40, 30);
    path.lineTo(10, 30);
    path.lineTo(10, 20);
    path.lineTo(60, 20);
    path.lineTo(60, 40);
    path.lineTo(30, 40);    
    path.closePath();
    
    path2.moveTo(100, 20);
    path2.lineTo(120, 20);
    path2.lineTo(120, 30);
    path2.lineTo(50, 30);
    path2.lineTo(50, 50);
    path2.lineTo(100, 50);
    path2.closePath();
    
    
    
    g2.scale(2, 2); // makes the coordinate system bigger scale for visibility 
    //g2.translate(4, 5); // shifts the origin from the top left corner so negative become visible
    g2.setPaint(Color.ORANGE);
    g2.fill(path);
    g2.fill(path2);
    g2.draw(path);
    g2.draw(path2);
    
    /*Ellipse2D ellipse = new Ellipse2D.Float(20f, 30f, 100f, 80f);
    Arc2D arc = new Arc2D.Float(20f, 30f, 100f, 80f, 30f, 45f, Arc2D.PIE);
    g2.draw(ellipse);
    g2.draw(arc);*/
    
    
    
    
    //g2.drawString("Java", 120, 200);
    
    
    System.out.println("drawing");

  }
}