package testing;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.print.DocFlavor.URL;
import javax.swing.JPanel;

public class GamePanel extends JPanel implements KeyListener
{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7897690884317302383L;
	Player player1;
	Player player2;
	BufferedImage backgroundImage = null;
	BufferedImage brownBlock = null;
	BufferedImage whiteBlock = null;
	BufferedImage grayBlock = null;
	BufferedImage drill = null;
	BufferedImage invert = null;
	BufferedImage speedboost = null;
	KeyListener listening;
	boolean keyPressedW = false;
	boolean keyPressedA = false;
	boolean keyPressedS = false;
	boolean keyPressedD = false;
	boolean keyPressedUp = false;
	boolean keyPressedDown = false;
	boolean keyPressedLeft = false;
	boolean keyPressedRight = false;
	int powercounter1 = 180;
	int powercounter2 = 180;
	boolean powerCheck1 = false;
	boolean powerCheck2 = false;
	BufferedImage life1= null;
	BufferedImage life2 = null;
	BufferedImage win1 = null;
	BufferedImage win2 = null;
	BufferedImage whiteStar = null;
	BufferedImage redStar = null;
	BufferedImage yellowStar = null;
	Star tempStar;

	boolean stop = false;
	

	
	int step = 5;
	ArrayList<Terrain> boulders = new ArrayList<Terrain>();
	ArrayList<Powerups> power = new ArrayList<Powerups>();
	ArrayList<Star> starslist = new ArrayList<Star>();

	Terrain tempTerrain;
	Powerups tempPower;
	public GamePanel()
	{
	setOpaque(true);
	}
	
	public void load()
	{
		player1 = new RegPlayer(100,850,1,3);
		player2 = new RegPlayer(200,850,2,3);
		try{
		      backgroundImage = new BufferedImage(750,65000, BufferedImage.TYPE_INT_ARGB);
		      backgroundImage = ImageIO.read(getClass().getResource("/images/Background.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      win1 = new BufferedImage(750,6500, BufferedImage.TYPE_INT_ARGB);
		      win1 = ImageIO.read(getClass().getResource("/images/Win1.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		try{
		      whiteStar = new BufferedImage(750,6500, BufferedImage.TYPE_INT_ARGB);
		      whiteStar = ImageIO.read(getClass().getResource("/images/WhiteStar.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      redStar = new BufferedImage(750,6500, BufferedImage.TYPE_INT_ARGB);
		      redStar = ImageIO.read(getClass().getResource("/images/RedStar.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      yellowStar = new BufferedImage(750,6500, BufferedImage.TYPE_INT_ARGB);
		      yellowStar = ImageIO.read(getClass().getResource("/images/YellowStar.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      win2 = new BufferedImage(750,6500, BufferedImage.TYPE_INT_ARGB);
		      win2 = ImageIO.read(getClass().getResource("/images/Win2.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      life1 = new BufferedImage(750,6500, BufferedImage.TYPE_INT_ARGB);
		      life1 = ImageIO.read(getClass().getResource("/images/Life1.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      life2 = new BufferedImage(750,6500, BufferedImage.TYPE_INT_ARGB);
		      life2 = ImageIO.read(getClass().getResource("/images/Life2.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		
		try{
		      whiteBlock = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      whiteBlock = ImageIO.read(getClass().getResource("/images/White_Block.png"));

		      System.out.println("Reading complete white");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      grayBlock = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      grayBlock = ImageIO.read(getClass().getResource("/images/Gray_Block.png"));

		      System.out.println("Reading complete gray");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      drill = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      drill = ImageIO.read(getClass().getResource("/images/DrillPower.png"));

		      System.out.println("Reading complete drill");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      brownBlock = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      brownBlock = ImageIO.read(getClass().getResource("/images/brown_Block.png"));

		      System.out.println("Reading complete brown");
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
		if(!stop)
		{
			if(player1.life <= 0)
				{
				stop = true;
			}
			if(player2.life <= 0)
				{
				stop = true;
				}
				
		updateBoulder();
		updatePower();		
		checkCollisionBoulder();
		updateStar();
		player1.update();
		player2.update();
		checkCollisionPower();
		if(powerCheck1)
		{
			if(powercounter1<=0)
			{
				powerCheck1 = false;
				player1 = new RegPlayer(player1.getX(),player1.getY(),player1.id,player1.life);
			}
			else
			{
				powercounter1--;
			}
		}
		if(powerCheck2)
		{
			if(powercounter2<=0)
			{
				powerCheck2 = false;
				player2 = new RegPlayer(player2.getX(),player2.getY(),player2.id,player2.life);
			}
			else
			{
				powercounter2--;
			}
		}
		
		
		
		
		
		
		
		if(keyPressedA)
		{
			player1.moveLeft();
		}
		if(keyPressedD)
		{
			player1.moveRight();
		}
		if(keyPressedW)
		{
			player1.moveUp();
		}
		if(keyPressedS)
		{
			player1.moveDown();
		}


		if(keyPressedLeft)
		{
			player2.moveLeft();
		}
		if(keyPressedRight)
		{
			player2.moveRight();
		}
		if(keyPressedUp)
		{
			player2.moveUp();
		}
		if(keyPressedDown)
		{
			player2.moveDown();
		}
		}
		}
	
	
	
	
	
	
	public void keyPressed(KeyEvent e)
	{
		int key = e.getKeyCode();
		System.out.println("printing");
		if (key == KeyEvent.VK_LEFT) {
	        keyPressedLeft = true;
	        
	    }

	    if (key == KeyEvent.VK_RIGHT) {
	        keyPressedRight = true;
	    }

	    if (key == KeyEvent.VK_UP) {
	        keyPressedUp = true;
	        
	    }

	    if (key == KeyEvent.VK_DOWN) {
	        keyPressedDown = true;
	    }
	    
	    
	    if (key == KeyEvent.VK_A) {
	    	keyPressedA = true;
	    }

	    if (key == KeyEvent.VK_D) {
	        keyPressedD = true;
	    }

	    if (key == KeyEvent.VK_W) {
	        keyPressedW = true;
	    }

	    if (key == KeyEvent.VK_S) {
	        keyPressedS = true;
	    }
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		
		
		g.drawImage(backgroundImage,0,-64000+step,this); 
		
		for(int i = 0;i<boulders.size();i++)
		{
			tempTerrain = boulders.get(i);
			tempTerrain.setY(tempTerrain.getY()+7);
			g.drawImage(tempTerrain.getImage(), tempTerrain.getX(), tempTerrain.getY(), this);
		}
		for(int i = 0;i<power.size();i++)
		{
			tempPower = power.get(i);
			tempPower.setY(tempPower.getY()+7);
			g.drawImage(tempPower.getImage(), tempPower.getX(), tempPower.getY(), this);
		}
		for(int i = 0;i<starslist.size();i++)
		{
			tempStar = starslist.get(i);
			tempStar.setY(tempStar.getY()+6);
			g.drawImage(tempStar.getImage(), tempStar.getX(), tempStar.getY(), this);
		}
		if(stop)
		{
			if(player1.life <= 0)
				{
				stop = true;
				g.drawImage(win2, 0, 0, this);
				//g.fillRect(0, 0, 500, 500);
			}
			if(player2.life <= 0)
				{
				stop = true;
				g.drawImage(win1, 0, 0, this);
				//g.fillRect(0, 0, 500, 500);
				}
		}
		g.drawImage(player1.getImage(),player1.getX(),player1.getY(),this);
		g.drawImage(player2.getImage(),player2.getX(),player2.getY(),this);
		step+=5;
		if(step == 62000)
			step = 1005;
		for(int i = 1 ; i<=player1.life;i++)
		{
			g.drawImage(life1, 20+i*30 , 30, this);
		}
		for(int i = 1 ; i<=player2.life;i++)
		{
			g.drawImage(life2, 730-(20+i*30) , 30, this);
		}
		g.setColor(Color.BLUE);
		if(player1.invincible)
		{
			g.fillRect(30, 60, player1.inviCounter*2, 10);
			}
		if(player2.invincible)
		{
				g.fillRect(500, 60, player2.inviCounter*2, 10);
		}
		g.setColor(Color.YELLOW);
		if(powerCheck1)
		{
			g.fillRect(30,90,powercounter1,10);
		}
		if(powerCheck2)
		{
			g.fillRect(500, 60, powercounter2,10);
		}
	
	}

	@Override
	public void keyReleased(KeyEvent e) 
	{
		int key = e.getKeyCode();
		System.out.println("printing");
		if (key == KeyEvent.VK_LEFT) {
	        keyPressedLeft = false;
	        
	    }

	    if (key == KeyEvent.VK_RIGHT) {
	        keyPressedRight = false;
	    }

	    if (key == KeyEvent.VK_UP) {
	        keyPressedUp = false;
	        
	    }

	    if (key == KeyEvent.VK_DOWN) {
	        keyPressedDown = false;
	    }
	    
	    
	    if (key == KeyEvent.VK_A) {
	    	keyPressedA = false;
	    }

	    if (key == KeyEvent.VK_D) {
	        keyPressedD = false;
	    }

	    if (key == KeyEvent.VK_W) {
	        keyPressedW = false;
	    }

	    if (key == KeyEvent.VK_S) {
	        keyPressedS = false;
	    }
		
	}
	public void updateStar()
	{
		int rand = (int) (Math.random()*20); //% chance
		if(rand>=15)
		{
			int randomStar =  (int) (Math.random()*3);
			if(randomStar == 0)
				tempStar = new Star(whiteStar);
				//boulders.add(new Terrain(brownBlock));
			else if(randomStar == 1)
				tempStar = new Star(yellowStar);

				//boulders.add(new Terrain(grayBlock));
			else if(randomStar == 2)
				tempStar = new Star(redStar);

				//boulders.add(new Terrain(whiteBlock));
			starslist.add(tempStar);
			tempStar = null;
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
		public void updateBoulder()
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
		}
		public void updatePower()
		{
			int randPower = (int) (Math.random()*100); //% chance
			if(randPower>=99)
			{
				int randomBlock =  (int) (Math.random()*3);
				if(randomBlock == 0)
					tempPower= new Powerups(drill, 0);
				else if(randomBlock == 1)
					tempPower = new Powerups(invert, 1);

				else if(randomBlock == 2)
					tempPower = new Powerups(speedboost, 2);

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
	public void invertPlayer(int x, int y, int id, int life)
	{
		if(id == 1)
			player1 = new InvertedPlayer(x,y,id, life);
		else
			player2= new InvertedPlayer(x,y,id, life);
	}
	public void drillPlayer(int x, int y, int id, int life)
	{
		if(id == 1)
			player1 = new DrillPlayer(x,y,id, life);
		else
			 player2= new DrillPlayer(x,y,id, life);
	}
	public void boostedPlayer(int x, int y, int id, int life)
	{
		if(id == 1)
			player1 = new SpeedPlayer(x,y,id, life);
		else
			 player2= new SpeedPlayer(x,y,id, life);
	}
	public void checkCollisionBoulder()
	{
		for(int i = 0; i < boulders.size(); i++)
		{
			tempTerrain = boulders.get(i);
			if(player1.hitbox.intersects(tempTerrain.hitbox))
			{
				if(!player1.invincible)
				{player1.life --;
				player1.isInvincible(60);}
				System.out.println(player1.life);

			}
			if(player2.hitbox.intersects(boulders.get(i).hitbox))
			{
				if(!player2.invincible)
				{player2.life --;
				player2.isInvincible(60);}
				System.out.println(player2.life);
			}

		}
	}
	public void checkCollisionPower()
	{
		for(int i = 0; i <power.size();i++)
		{
			tempPower = power.get(i);
			if(player1.hitbox.intersects(tempPower.hitbox))
			{
				if(tempPower.id == 0) //drill
				{
					drillPlayer(player1.x,player1.y,player1.id, player1.life);
					powerCheck1 = true;
					powercounter1 = 180;
					power.remove(i);
					
				}
				else if(tempPower.id == 1) //invert
				{
					invertPlayer(player2.x,player2.y,player2.id, player2.life);
					powerCheck2 = true;
					powercounter2 = 180;
					power.remove(i);
				}
				else if(tempPower.id == 2) //speed boost
				{
					boostedPlayer(player1.x,player1.y,player1.id, player1.life);
					powerCheck1 = true;
					powercounter1= 180;
					power.remove(i);
				}
			}
			if(player2.hitbox.intersects(tempPower.hitbox))
			{
				if(tempPower.id == 0) //drill
				{
					drillPlayer(player2.x,player2.y,player2.id,player2.life);
					powerCheck2 = true;
					powercounter2 = 180;
					power.remove(i);
				}
				else if(tempPower.id == 1) //invert
				{
					invertPlayer(player1.x,player1.y,player1.id, player1.life);
					powerCheck1 = true;
					powercounter1 = 180;
					power.remove(i);
				}
				else if(tempPower.id == 2) //speed boost
				{
					boostedPlayer(player2.x,player2.y,player2.id,player2.life);
					powerCheck2 = true;
					powercounter2= 180;
					power.remove(i);
				}
			}
		}
	}
	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	}

	
	

