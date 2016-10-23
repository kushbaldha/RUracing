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
	int backgroundStep = 5;
	ArrayList<Terrain> boulders;
	File f;
	public GamePanel()
	{
	setOpaque(true);	
	}
	
	public void load()
	{
		//player1 = new RegPlayer(100,50,1,image);
		//player2 = new RegPlayer(400,50,2,image2);
		//boulders = new ArrayList<Terrain>();
		try{
		      //f = new File("Background2.jpg"); //image file path
		      backgroundImage = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      backgroundImage = ImageIO.read(GamePanel.class.getResourceAsStream("/images/Background.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		}
	public void update()
	{
		
		/*int rand = (int) Math.random()*20; //50% chance
		if(rand>=19)
		{
			boulders.add(new Terrain());
		}*/
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.drawImage(backgroundImage,0,-4000+backgroundStep,this); 
		g.fillRect(25,-3000+backgroundStep, 500, 100);
		backgroundStep+=5;
		//player1.draw(g,this);
	}
	
	
}
