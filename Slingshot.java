import java.awt.*;
import javax.swing.*;

public class Slingshot extends JLabel {
	private int power;

	public Slingshot(ImageIcon i, int width, int height) {
		super(i);
		setPreferredSize(new Dimension(width, height));
		setVisible(false);
	}

	public void move(int vx) {
		setBounds(getX() + vx, getY(), getWidth(), getHeight());
	}

	public void setPower(int p) {
		power = p;
	}

	public int getPower() {
		return power;
	}

	public Projectile shoot() {
		Projectile p = new Projectile(power, getX());
		setPower(0);
		return p;
	}

}
