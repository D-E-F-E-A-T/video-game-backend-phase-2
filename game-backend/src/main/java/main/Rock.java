package main;

public class Rock extends BaseMapItem 
{
	public Rock()
	{
		
	}
	
	public Rock(int row, int column)
	{
		super(row, column);
		this.type = Constants.ROCK;
	}
}
