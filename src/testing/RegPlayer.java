package testing;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class RegPlayer extends Player
{
	BufferedImage imageCruise,imageUp,imageDown,imageLeft,imageRight;
	public RegPlayer(int x, int y,int id)
	{
		super(x,y,id); 
		if(id == 1){
		try{
		      imageCruise = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      imageCruise = ImageIO.read(getClass().getResource("/images/RegPlayer1.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      imageUp = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      imageUp = ImageIO.read(getClass().getResource("/images/RegPlayer1_UP.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		
		try{
		      imageDown = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      imageDown = ImageIO.read(getClass().getResource("/images/RegPlayer1_DOWN.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		
		try{
		      imageLeft = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      imageLeft = ImageIO.read(getClass().getResource("/images/RegPlayer1_LEFT.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }	
		
		try{
		      imageRight = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
		      imageRight = ImageIO.read(getClass().getResource("/images/RegPlayer1_RIGHT.png"));

		      System.out.println("Reading complete.");
		    }catch(IOException e){
		      System.out.println("Error: "+e);
		    }
		}
		
		else if(id == 2){
			try{
			      imageCruise = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
			      imageCruise = ImageIO.read(getClass().getResource("/images/RegPlayer2.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			
			
			try{
			      imageUp = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
			      imageUp = ImageIO.read(getClass().getResource("/images/RegPlayer2_UP.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			
			
			try{
			      imageDown = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
			      imageDown = ImageIO.read(getClass().getResource("/images/RegPlayer2_DOWN.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			
			try{
			      imageLeft = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
			      imageLeft = ImageIO.read(getClass().getResource("/images/RegPlayer2_LEFT.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }	
			
			try{
			      imageRight = new BufferedImage(500,5000, BufferedImage.TYPE_INT_ARGB);
			      imageRight = ImageIO.read(getClass().getResource("/images/RegPlayer2_RIGHT.png"));

			      System.out.println("Reading complete.");
			    }catch(IOException e){
			      System.out.println("Error: "+e);
			    }
			}
		
		
		
		
	}
	public void moveLeft()
	{
		super.moveLeft();
		super.image = imageLeft;
	}
	public void moveUp()
	{
		super.moveUp();
		super.image = imageUp;
	}
	public void moveRight()
	{
		super.moveRight();
		super.image = imageRight;
	}
	public void moveDown()
	{
		super.moveDown();
		super.image = imageDown;
	}
	public void stationary()
	{
		super.image = this.image;
	}
}
