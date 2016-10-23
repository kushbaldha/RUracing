package testing;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpeedPlayer extends Player
{
	BufferedImage imageCruise,imageUp,imageDown,imageLeft,imageRight;
	public SpeedPlayer(int x, int y,int id)
	{
		super(x,y,id); 
		if(id == 1){
		try{
		      imageCruise = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
		      imageCruise = ImageIO.read(getClass().getResource("/images/SpeedPlayer1.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      imageUp = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
		      imageUp = ImageIO.read(getClass().getResource("/images/SpeedPlayer1_UP.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      imageDown = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
		      imageDown = ImageIO.read(getClass().getResource("/images/SpeedPlayer1.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      imageLeft = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
		      imageLeft = ImageIO.read(getClass().getResource("/images/SpeedPlayer1_LEFT.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }	
		
		try{
		      imageRight = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
		      imageRight = ImageIO.read(getClass().getResource("/images/SpeedPlayer1_RIGHT.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		super.setSpeed(2);
		}
		
		else if(id == 2){
			try{
			      imageCruise = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			      imageCruise = ImageIO.read(getClass().getResource("/images/SpeedPlayer2.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			
			
			try{
			      imageUp = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			      imageUp = ImageIO.read(getClass().getResource("/images/SpeedPlayer2_UP.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			
			
			try{
			      imageDown = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			      imageDown = ImageIO.read(getClass().getResource("/images/SpeedPlayer2.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			
			try{
			      imageLeft = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			      imageLeft = ImageIO.read(getClass().getResource("/images/SpeedPlayer2_LEFT.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }	
			
			try{
			      imageRight = new BufferedImage(x, y, BufferedImage.TYPE_INT_ARGB);
			      imageRight = ImageIO.read(getClass().getResource("/images/SpeedPlayer2_RIGHT.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			super.setSpeed(2);
			}
		
		
		super.setImage(imageCruise);
		
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