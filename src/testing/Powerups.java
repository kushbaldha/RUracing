package testing;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Powerups 
{
	int x;
	int y;
	BufferedImage image;
	Rectangle hitbox;
	int id;



	public Powerups(BufferedImage image, int id) {
		x = (int) (Math.random()*500);
		y = (int) (Math.random()*-100);
		this.image = image;
		hitbox = new Rectangle(x,y,image.getWidth(),image.getHeight());
		this.id = id;
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
		hitbox.setLocation(x,y);
	}
	public void setX(int x)
	{
		this.x = x;
		hitbox.setLocation(x,y);
	}

}