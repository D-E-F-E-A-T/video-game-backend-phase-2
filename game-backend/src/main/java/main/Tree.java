package main;

@Entity
public class Tree extends BaseSpace 
{
	public Tree()
	{
	
	}
	
	public Tree(
		String world,
		String region,
		int row, 
		int column)
	{
		super(world, region, row, column);
		this.type = Constants.TREE;
	}
}
