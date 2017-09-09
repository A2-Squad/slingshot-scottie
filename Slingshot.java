import java.awt.*;
import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import java.applet.AudioClip;
import acm.util.MediaTools;

public class Slingshot extends JLabel
{
    private int vx;
    private int power;

    public Slingshot(ImageIcon i, int width, int height)
    {
        super(i);
        setPreferredSize(new Dimension(width, height));
        setVisible(False);
    }

    public void move(int vx)
    {
        setX(getX()+vx)
    }
    
    public void setPower(int p)
    {
        power = p;
    }
    
    public int getPower()
    {
        return power;
    }
    
    public Projectile shoot()
    {
        Projectile p = new Projectile (power, getX());
        setPower(0);
        return p;
    }


}
