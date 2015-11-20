package main;

public class Water extends BaseSpace 
{
	public Water()
	{
		
	}
	
	public Water(int row, int column)
	{
		super(row, column);
		this.type = Constants.WATER;
	}
}
