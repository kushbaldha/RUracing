package testing;

import java.awt.Color;
import java.awt.Graphics;
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
	int step = 5;
	ArrayList<Terrain> boulders = new ArrayList<Terrain>();

	Terrain tempTerrain;
	public GamePanel()
	{
	setOpaque(true);	
	}
	
	public void load()
	{
		//player1 = new RegPlayer(100,50,1,image);
		//player2 = new RegPlayer(400,50,2,image2);
		
		try{
		      backgroundImage = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      backgroundImage = ImageIO.read(getClass().getResource("/images/Background.jpg"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      brownBlock = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      brownBlock = ImageIO.read(getClass().getResource("/images/Brown_block.jpg"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      whiteBlock = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      whiteBlock = ImageIO.read(getClass().getResource("/images/White_Block.jpg"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      grayBlock = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      grayBlock = ImageIO.read(getClass().getResource("/images/Gray_Block.jpg"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		    }
	public void update()
	{
		
		int rand = (int) (Math.random()*2); //% chance
		if(rand>=1)
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
		
		
		
		step+=5;
		if(step == 3000)
			step = 1005;
		//player1.draw(g,this);
	}
	
	
}
