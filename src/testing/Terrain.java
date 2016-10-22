package testing;

import java.util.ArrayList;

public class Terrain 
{
	int x;
	int y;
	
	public Terrain()
	{
		x = (int) (Math.random()*500);
		y = (int) (Math.random()*-100);
	}
	
	ArrayList<Terrain> boulders = new ArrayList<Terrain>();			
	
	for (int i=0;i<=2;i++)
	{
		boulders.add(new Terrain());
	}

}

