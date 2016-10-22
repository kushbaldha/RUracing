	package testing;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class GamePanel extends JPanel
{

	Player player1;
	Player player2;
	public GamePanel ()
	{
	}
	
	public void load()
	{
		//player1 = new RegPlayer(100,50,1,image);
		//player2 = new RegPlayer(400,50,2,image2);
		 BufferedImage backgroundImage = null;
		 try {
		     backgroundImage = ImageIO.read(new File("background.jpg"));
		 } catch (IOException e) {
		 }
	}
	public void update()
	{
		
	}
	public void paintComponent(Graphics G)
	public void draw()
	{
		
	}
	
	
}
