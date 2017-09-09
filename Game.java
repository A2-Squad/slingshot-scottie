import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Game {

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
				RenderingHints.VALUE_ANTIALIAS_ON);
		ball.paint(g2d);
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mini Tennis");
        Level level1 = new Level()
        frame.add(level1);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true) {
			level.update();
			game.repaint();
			Thread.sleep(10);
		}
	}
}
