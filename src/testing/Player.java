package testing;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;


public class Player 
{
	int x;
	int y;
	int id;
	double speedScalar;
	int step = 10;
	int life = 3;
	Rectangle hitbox;
	BufferedImage image;
	
	public Player(int x, int y,int id, BufferedImage image)
	{
		this.x = x;
		this.y = y;
		this.id = id;
		hitbox = new Rectangle(image.getWidth(),image.getHeight());
		this.image = image;
	}
	public void setX(int x)
	{
		this.x = x;
		hitbox.setLocation(x, y);
	}
	public void setY(int y)
	{
		this.y = y;
		hitbox.setLocation(x, y);
	}
	
	public void moveLeft()
	{
		setX(this.x - (int)speedScalar*step);
	}
	public void moveUp()
	{
		setY(this.y + (int)speedScalar*step);
	}
	public void moveRight()
	{
		setX(this.x + (int)speedScalar*step);
		
	}
	public void moveDown()
	{
		setY(this.y - (int)speedScalar*step);
	}
	public void setSpeed(double speed)
	{
		this.speedScalar = speed;
	}
	public void draw(Graphics g,GamePanel panel)
	{
		g.drawImage(image,x,y,panel);
	}
}
