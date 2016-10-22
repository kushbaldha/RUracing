	package testing;

import java.awt.image.BufferedImage;

public class GamePanel 
{

	Player player1;
	Player player2;
	BufferedImage background;
	public GamePanel (BufferedImage image, BufferedImage image2,BufferedImage background)
	{
		player1 = new RegPlayer(100,50,1,image);
		player2 = new RegPlayer(400,50,2,image2);
		this.background = background
	}
	
	public void load()
	{
		
	}
	
	
}
