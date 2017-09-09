import java.awt.*;
import javax.swing.*;

public class Projectile extends JLabel {
	private int speed;

	public Projectile(ImageIcon i, int width, int height, int speed, int x, int y) {
		super(i);
		setPreferredSize(new Dimension(width, height));
	}

    //testing
    public Projectile(String s, int width, int height, int speed, int x, int y) {
		super(s);
		setPreferredSize(new Dimension(width, height));
	}

	public void move() {
		setBounds(getX(), getY() - speed, getWidth(), getHeight());
	}

}
