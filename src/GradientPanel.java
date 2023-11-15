import javax.swing.JPanel;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
//import java.awt.geom.Rectangle2D;
import java.awt.geom.RoundRectangle2D;


public class GradientPanel extends JPanel 
{
    Color startColor;
    Color endColor;
    int arc;

    GradientPanel(Color startColor,Color endColor,int arc)
    {
        this.startColor = startColor; 
        this.endColor = endColor;
        this.arc = arc;
    }

    public void paintComponent(Graphics g) 
    {
        //super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        int width = getWidth();
        int height = getHeight();

        GradientPaint gradient = new GradientPaint(0,0, startColor, width/2, height/2, endColor);
        g2d.setPaint(gradient);

        //Rectangle2D.Double rect = new Rectangle2D.Double(0, 0, width, height);
        RoundRectangle2D rect = new RoundRectangle2D.Double(0, 0, width, height, arc,arc);
        g2d.fill(rect);

        
    }

}
