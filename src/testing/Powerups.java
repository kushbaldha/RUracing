package testing;

import java.util.ArrayList;

public class Powerups 
{
	int x;
	int y;
	String z;
	String[] powers = new String[]{"drill","invert","speedboost"};
	public Powerups()
	{
		x = (int) (Math.random()*500);
		y = (int) (Math.random()*-500);
		z = powers[(int) Math.random()*3];
	}
	
	
}		