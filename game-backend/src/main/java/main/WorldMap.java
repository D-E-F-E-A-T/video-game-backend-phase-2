package main;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Set;

import org.codehaus.jackson.map.ObjectMapper;

public class WorldMap 
{
	private int numItemsPerRow = 0;
	private int numItemsPerColumn = 0;
	
	private Hashtable<Integer, BaseMapItem> items = null;
	
	public WorldMap(int numItemsPerRow, int numItemsPerColumn)
	{
		this.numItemsPerRow = numItemsPerRow;
		this.numItemsPerColumn = numItemsPerColumn;
		
		items = new Hashtable<Integer, BaseMapItem>();
	}
	
	public void set(int row, int column, BaseMapItem item)
	{
		items.put(
			this.numItemsPerRow * row + column, 
			item);
	}
	
	@Override
	public String toString()
	{
		String retVal = "";
		
		ObjectMapper mapper = new ObjectMapper();
		
		try
		{
			Set<Integer> set = items.keySet();
			
			Iterator<Integer> iterator = set.iterator();
			
			Collection<BaseMapItem> set2 = items.values();
			Iterator<BaseMapItem> iterator2 = set2.iterator();
			
			retVal = mapper.writeValueAsString(iterator2);
		}
		catch (Exception ex)
		{
			
		}
		
		return retVal;
	}
}
