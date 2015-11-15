package main;

public class Door extends BaseMapItem 
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
