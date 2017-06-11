import javax.swing.*;
import java.awt.*;
import java.awt.Color;



public class GradPanel extends JPanel
{
  public static Color a = new java.awt.Color(225,225,225,5);
  public static Color b = new java.awt.Color(147,200,255);
   
    
    
 public void setColorA(int p, int q, int r, int s)
 {
    a = new Color(p,q,r,s);
 }
 
  public void setColorB(int p, int q, int r)
 {
    b = new Color(p,q,r);
 }
   
    
    @Override
    protected void paintComponent(Graphics g)
    {
       
       paintThis(g);        
    }
    
    
    public void paintThis(Graphics g)
    {
         if(!isOpaque())
        {
            super.paintComponents(g);
            
        }
       setOpaque(false);
        Graphics2D g2d = (Graphics2D)g;
        
        int h = getHeight();
        int w = getWidth();
            
        
        
        GradientPaint gp = new GradientPaint(0,0,a,0,h,b,true);
        g2d.setPaint(gp);
        g2d.fillRect(0, 0, w, h);
       
       super.paintComponent(g);
       setOpaque(true);
    }
}
