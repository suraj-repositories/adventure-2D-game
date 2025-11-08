package main;

import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {

		JFrame window = new JFrame();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setResizable(false);
		window.setTitle("2D Adventure");

		try {
			Image icon = ImageIO.read(Main.class.getResourceAsStream("/objects/key.png"));
			window.setIconImage(icon);
		} catch (IOException e) {
			System.out.println("Icon image not found!");
			e.printStackTrace();
		}

		GamePanel gamePanel = new GamePanel();
		window.add(gamePanel);

		window.pack();

		window.setLocationRelativeTo(null);
		window.setVisible(true);

		gamePanel.setupGame();
		gamePanel.startGameThread();
	}
}
