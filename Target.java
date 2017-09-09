import java.awt.*;
import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import java.applet.AudioClip;
import acm.util.MediaTools;

public class Target extends JLabel
{
    private int vx;
    private int vy;
    
    public Target(ImageIcon i, int width, int height)
    {
        super(i);
        setPreferredSize(new Dimension(width, height));
        setVisible(False);
    }
    
    public void move(int vx, int vy)
    {
        setX(getX()+vx);
        setY(getY()+vy);
    }
    
    public void appear()
    {
        setVisible(True);
    }
    
    public void disappear()
    {
        setVisible(False);
    }

    public boolean isHit(Projectile p)
    {
        if((getX()<=p.getX()+p.getWidth() && getX()+width>=p.getX()) && (getY()<=p.getY()+p.getHeight() && getY()+height>=p.getY()))
        {
            disappear();
            return True;
        }
        else
        {
            return False;
        }
    }
}