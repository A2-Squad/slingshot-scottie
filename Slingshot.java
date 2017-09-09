
public class Slingshot {
	int power;
	int position;
	final int POS_MIN = 0;
	final int POS_MAX = 100;
	
	public Slingshot() {
		power = 0;
		position = 0;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}
	
	Projectile shoot() {
		Projectile p = new Projectile();
		setPower(0);
		return p;
	}
}
