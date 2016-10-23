package testing;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class DrillPlayer extends Player
{
	BufferedImage imageCruise,imageUp,imageDown,imageLeft,imageRight;
	public DrillPlayer(int x, int y,int id)
	{
		super(x,y,id); 
		if(id == 1){
		try{
		      imageCruise = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
		      imageCruise = ImageIO.read(getClass().getResource("/images/DrillPlayer1.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      imageUp = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
		      imageUp = ImageIO.read(getClass().getResource("/images/DrillPlayer1_UP.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      imageDown = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
		      imageDown = ImageIO.read(getClass().getResource("/images/DrillPlayer1.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      imageLeft = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
		      imageLeft = ImageIO.read(getClass().getResource("/images/DrillPlayer1_LEFT.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }	
		
		try{
		      imageRight = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
		      imageRight = ImageIO.read(getClass().getResource("/images/DrillPlayer1_RIGHT.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		super.setSpeed(2);
		}
		
		else if(id == 2){
			try{
			      imageCruise = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			      imageCruise = ImageIO.read(getClass().getResource("/images/DrillPlayer2.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			
			
			try{
			      imageUp = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			      imageUp = ImageIO.read(getClass().getResource("/images/DrillPlayer2_UP.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			
			
			try{
			      imageDown = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			      imageDown = ImageIO.read(getClass().getResource("/images/DrillPlayer2.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			
			try{
			      imageLeft = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			      imageLeft = ImageIO.read(getClass().getResource("/images/DrillPlayer2_LEFT.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }	
			
			try{
			      imageRight = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			      imageRight = ImageIO.read(getClass().getResource("/images/DrillPlayer2_RIGHT.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			super.setSpeed(2);
			}
		
		
		super.setImage(imageCruise);
		super.isInvincible(180);
	}
	public void moveLeft()
	{
		super.moveLeft();
		super.setImage(imageLeft);
	}
	public void moveUp()
	{
		super.moveUp();
		super.setImage(imageUp);
	}
	public void moveRight()
	{
		super.moveRight();
		super.setImage(imageRight);
	}
	public void moveDown()
	{
		super.moveDown();
		super.setImage(imageDown);
	}
	public void cruise()
	{
		super.setImage(imageCruise);
	}
}