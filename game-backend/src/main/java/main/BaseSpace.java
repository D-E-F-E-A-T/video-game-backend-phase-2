package main;



public abstract class BaseSpace 
{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

	protected String world;	
	protected String region;    
	protected int row;	
	protected int column;	
	protected int type;
	
	public BaseSpace()
	{		
	}
	
	public BaseSpace(String world, String region, int row, int column)
	{
		this.world = world;
		this.region = region;
		this.row = row;
		this.column = column;
	}
	
	public int getRow() 
	{
		return row;
	}
	
	public void setRow(int row) 
	{
		this.row = row;
	}
	
	public int getColumn() 
	{
		return column;
	}
	
	public void setColumn(int column) 
	{
		this.column = column;
	}
	
	public int getType()
	{
		return type;
	}
	
	public void setType(int type)
	{
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getWorld() {
		return world;
	}

	public void setWorld(String world) {
		this.world = world;
	}	
	
}
