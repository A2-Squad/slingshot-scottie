import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class Game {

	public static void main(String[] args) throws InterruptedException {
		JFrame frame = new JFrame("Mini Tennis");
        Level level1 = new Level(0, 30, 30, "");
        frame.add(level1);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		while (true) {
			level1.update();
			Thread.sleep(10);
		}
	}
}
