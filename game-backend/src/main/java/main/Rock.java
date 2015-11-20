package main;

public class Rock extends BaseSpace 
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
