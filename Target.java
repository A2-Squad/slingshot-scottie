import java.awt.*;
import javax.swing.*;

public class Target extends JLabel {
	private int vx;
	private int vy;

	public Target(ImageIcon i, int width, int height) {
		super(i);
		setPreferredSize(new Dimension(width, height));
		setVisible(false);
	}

	public void move(int vx, int vy) {
		setBounds(getX() + vx, getY() + vy, getWidth(), getHeight());
	}

	public void appear() {
		setVisible(true);
	}

	public void disappear() {
		setVisible(false);
	}

	public boolean isHit(Projectile p) {
		if ((getX() <= p.getX() + p.getWidth() && getX() + getWidth() >= p.getX())
				&& (getY() <= p.getY() + p.getHeight() && getY() + getHeight() >= p.getY())) {
			disappear();
			return true;
		} else {
			return false;
		}
	}
}
