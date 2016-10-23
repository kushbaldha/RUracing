package testing;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Terrain 
{
	int x;
	int y;
	Rectangle hitbox;
	BufferedImage image;	



	public Terrain(BufferedImage image) {
		x = (int) (Math.random()*500);
		y = (int) (Math.random()*-100);
		this.image = image;
		hitbox = new Rectangle(x,y,image.getWidth(),image.getHeight());
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


