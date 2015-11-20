package main;

public class Door extends BaseSpace 
{
	public Door()
	{
		
	}
	
	public Door(int row, int column)
	{
		super(row, column);
		this.type = Constants.DOOR;
	}

}
