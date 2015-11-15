package main;

public class Tree extends BaseMapItem 
{
	public Tree()
	{
	
	}
	
	public Tree(int row, int column)
	{
		super(row, column);
		this.type = Constants.TREE;
	}
}
