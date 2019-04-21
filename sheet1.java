package frames;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;

import javax.swing.JPanel;

public class sheet1 extends JPanel {
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2=(Graphics2D) g;
		
		Rectangle2D rect=new Rectangle2D.Double(100,100,200,150);
		g2.setColor(Color.BLUE);
		g2.draw(rect);
		
		Ellipse2D ellip=new Ellipse2D.Double();
		ellip.setFrame(rect);
		g2.setColor(Color.PINK);
		g2.draw(ellip);
		g2.setColor(Color.RED);
		g2.draw(new Line2D.Double(100,100,300,250));
		
		
		double centerX=rect.getCenterX();
		double centerY=rect.getCenterY();
		double radio=150;
		Ellipse2D circle=new Ellipse2D.Double();
		circle.setFrameFromCenter(centerX, centerY, centerX+radio, centerY+radio);
		g2.setColor(Color.MAGENTA);
		g2.draw(circle);
		
	}	
}
