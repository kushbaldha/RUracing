package testing;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Powerups 
{
	int x;
	int y;
	BufferedImage image;	



	public Powerups(BufferedImage image) {
		x = (int) (Math.random()*500);
		y = (int) (Math.random()*-100);
		this.image = image;
	}




	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	public BufferedImage getImage()
	{
		return image;
	}
	public void setY(int y)
	{
		this.y = y;
	}

}