import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Game extends JFrame {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Mini Tennis");
		frame.add(new Game());
		frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        run();
	}

    private void run() {
        Level level1 = new Level(8, 30, 30, "");
        this.add(level1);
        level1.addProjectile();
    }
}
