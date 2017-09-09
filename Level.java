import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Level extends JPanel implements KeyListener{
	private Slingshot shooter;
	private ArrayList<Projectile> projectiles;
	private Target[] targets;
	private String backgroundImage;
	private final int SHOOTER_WIDTH = 30; //TODO set value based on image
	private final int SHOOTER_HEIGHT = 30; //TODO set value based on image
	private final int LEVEL_WIDTH = 30; //TODO set this value
	private final int LEVEL_HEIGHT = 30; //TODO set this value

	public Level(int numTargets, int targetWidth, int targetHeight, String backgroundPath) {
		//shooter = new Slingshot(new ImageIcon(""), SHOOTER_WIDTH, SHOOTER_HEIGHT); //TODO replace empty string with path to slingshot image
        shooter = new Slingshot("", SHOOTER_WIDTH, SHOOTER_HEIGHT, this);
		projectiles = new ArrayList<Projectile>();
		targets = new Target[numTargets];
		for(int i = 0; i < numTargets; i++) {
			targets[i] = new Target(new ImageIcon(""), targetWidth, targetHeight); //TODO replace empty string with target image file path
		}
		this.setPreferredSize(new Dimension(LEVEL_WIDTH, LEVEL_HEIGHT));
        // Commented out for testing purposes only
		//JLabel background = new JLabel(new ImageIcon(backgroundPath));
		//background.setPreferredSize(this.getPreferredSize());
		//this.add(background);
	}

    public void keyPressed(keyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			shooter.move(-1);
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			shooter.move(1);
		if(e.getKeyCode() == KeyEvent.VK_SPACE)
			shooter.incPower();
	}
    
	public void keyPressed(keyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE)
			shooter.shoot();
	}
	
	public void keyPressed(keyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_LEFT)
			shooter.move(-1);
		if(e.getKeyCode() == KeyEvent.VK_RIGHT)
			shooter.move(1);
		if(e.getKeyCode() == KeyEvent.VK_SPACE)
			shooter.incPower();
	}
	public void keyPressed(keyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_SPACE)
			shooter.shoot();
	}

    public void update() {
        projectiles.add(shooter.shoot());
        for (Projectile p: projectiles) {
            p.move();
        }
    }

	protected void paintComponent(Graphics g) {
	    super.paintComponent(g);
	    shooter.repaint();
	    for(Projectile p : projectiles)
	    	p.repaint();
	    for(Target t : targets)
	    	t.repaint();
	}
}
