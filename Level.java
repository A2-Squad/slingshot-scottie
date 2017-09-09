import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Level extends JPanel{
	private Slingshot shooter;
	private ArrayList<Projectile> projectiles;
	private Target[] targets;
	private String backgroundImage;
	private final int SHOOTER_WIDTH; //TODO set value based on image
	private final int SHOOTER_HEIGHT; //TODO set value based on image
	
	public Level(int numTargets, int targetWidth, int targetHeight, String backgroundPath) {
		shooter = new Slingshot(new ImageIcon(""), SHOOTER_WIDTH, SHOOTER_HEIGHT); //TODO replace empty string with path to slingshot image
		projectiles = new ArrayList<Projectile>();
		targets = new Target[numTargets];
		for(int i = 0; i < numTargets; i++) {
			targets[i] = new Target(new ImageIcon(""), targetWidth, targetHeight); //TODO replace empty string with target image file path
		}
		backgroundImage = backgroundPath;
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
