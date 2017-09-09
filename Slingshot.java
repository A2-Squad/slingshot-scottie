import java.awt.*;
import javax.swing.*;

public class Slingshot extends JLabel {
	private int power;
	private Level level;

	public Slingshot(ImageIcon i, int width, int height, Level l) {
		super(i);
		level = l;
		setPreferredSize(new Dimension(width, height));
		setVisible(false);
	}

	public void move(int vx) {
		if(getX()+vx >= 0 && getX()+getWidth()+vx <= level.getWidth())
			setBounds(getX() + vx, getY(), getWidth(), getHeight());
	}
	
	public void incPower() {
		setPower(getPower() + 0.5);
		if(power >= 100) {
			setPower(100);
			shoot();
		}
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
