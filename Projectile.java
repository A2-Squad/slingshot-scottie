import java.awt.*;
import acm.program.*;
import acm.graphics.*;
import java.awt.Color;
import java.awt.event.*;
import java.util.*;
import java.applet.AudioClip;
import acm.util.MediaTools;

public class Projectile extends JLabel
{
    private int speed;
    
    public Projectile(ImageIcon i, int width, int height)
    {
        super(i);
        setPreferredSize(new Dimension(width, height));
    }
    
    public void move()
    {
        setY(getY()-speed);
    }

}
