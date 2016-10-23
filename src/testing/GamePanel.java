package testing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.JPanel;

public class GamePanel extends JPanel
{

	Player player1;
	Player player2;
	BufferedImage backgroundImage = null;
	BufferedImage brownBlock = null;
	BufferedImage whiteBlock = null;
	BufferedImage grayBlock = null;
	BufferedImage drill = null;
	BufferedImage invert = null;
	BufferedImage speedboost = null;
	int step = 5;
	ArrayList<Terrain> boulders = new ArrayList<Terrain>();
	ArrayList<Powerups> power = new ArrayList<Powerups>();
	Terrain tempTerrain;
	Powerups tempPower;
	public GamePanel()
	{
	setOpaque(true);	
	}
	
	public void load()
	{
		player1 = new RegPlayer(100,50,1);
		player2 = new RegPlayer(400,50,2);
		
		try{
		      backgroundImage = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      backgroundImage = ImageIO.read(getClass().getResource("/images/Background.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      brownBlock = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      brownBlock = ImageIO.read(getClass().getResource("/images/Brown_block.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      whiteBlock = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      whiteBlock = ImageIO.read(getClass().getResource("/images/White_Block.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      grayBlock = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      grayBlock = ImageIO.read(getClass().getResource("/images/Gray_Block.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      drill = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      drill = ImageIO.read(getClass().getResource("/images/DrillPower.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      invert = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      invert = ImageIO.read(getClass().getResource("/images/InvertPower.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		try{
		      speedboost = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      speedboost = ImageIO.read(getClass().getResource("/images/SpeedboostPower.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		
		    }
	public void update()
	{
		
		int rand = (int) (Math.random()*20); //% chance
		if(rand>=19)
		{
			int randomBlock =  (int) (Math.random()*3);
			if(randomBlock == 0)
				tempTerrain = new Terrain(brownBlock);
				//boulders.add(new Terrain(brownBlock));
			else if(randomBlock == 1)
				tempTerrain = new Terrain(grayBlock);

				//boulders.add(new Terrain(grayBlock));
			else if(randomBlock == 2)
				tempTerrain = new Terrain(whiteBlock);

				//boulders.add(new Terrain(whiteBlock));
			boulders.add(tempTerrain);
			tempTerrain = null;
			}
		
		for(int i = 0; i<boulders.size();i++)
		{
			tempTerrain = boulders.get(i);
			if(tempTerrain.getY()>1010)
			{
				boulders.remove(i);
			}
		}
		
		int randPower = (int) (Math.random()*50); //% chance
		if(randPower>=49)
		{
			int randomBlock =  (int) (Math.random()*3);
			if(randomBlock == 0)
				tempPower= new Powerups(drill);
				//boulders.add(new Terrain(brownBlock));
			else if(randomBlock == 1)
				tempPower = new Powerups(invert);

				//boulders.add(new Terrain(grayBlock));
			else if(randomBlock == 2)
				tempPower = new Powerups(speedboost);

				//boulders.add(new Terrain(whiteBlock));
			power.add(tempPower);
			tempPower = null;
			}
		
		for(int i = 0; i<power.size();i++)
		{
			tempPower = power.get(i);
			if(tempPower.getY()>1010)
			{
				power.remove(i);
			}
		}
	}
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		if (key == KeyEvent.VK_LEFT) {
	        player2.moveLeft();
	    }

	    if (key == KeyEvent.VK_RIGHT) {
	        player2.moveRight();
	    }

	    if (key == KeyEvent.VK_UP) {
	        player2.moveUp();
	    }

	    if (key == KeyEvent.VK_DOWN) {
	        player2.moveDown();
	    }
	    
	    
	    if (key == KeyEvent.VK_A) {
	        player1.moveLeft();
	    }

	    if (key == KeyEvent.VK_D) {
	        player1.moveRight();
	    }

	    if (key == KeyEvent.VK_W) {
	        player1.moveUp();
	    }

	    if (key == KeyEvent.VK_S) {
	        player1.moveDown();
	    }
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		g.drawImage(backgroundImage,0,-4000+step,this); 
		
		for(int i = 0;i<boulders.size();i++)
		{
			tempTerrain = boulders.get(i);
			tempTerrain.setY(tempTerrain.getY()+5);
			g.drawImage(tempTerrain.getImage(), tempTerrain.getX(), tempTerrain.getY(), this);
		}
		for(int i = 0;i<power.size();i++)
		{
			tempPower = power.get(i);
			tempPower.setY(tempPower.getY()+5);
			g.drawImage(tempPower.getImage(), tempPower.getX(), tempPower.getY(), this);
		}
		
		g.drawImage(player1.image,player1.x,player1.y,this);
		g.drawImage(player2.image, player2.x, player2.y, this);
		
		step+=5;
		if(step == 3000)
			step = 1005;
		//player1.draw(g,this);
	}
	
	
}
