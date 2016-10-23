package testing;

import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Star 
{
	int x;
	int y;
	BufferedImage image;	



	public Star(BufferedImage image) {
		x = (int) (Math.random()*750);
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
	public void setX(int x)
	{
		this.x = x;
	}

}


