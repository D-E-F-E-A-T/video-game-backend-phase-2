package main;


import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

//@Entity // This is a JPA entity.
//@Table(name = "MapItem")
public abstract class BaseMapItem 
{
//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
//	protected int id;
	
//	@NotNull
	protected int row;
	
//	@NotNull
	protected int column;
	
//	@NotNull
	protected int type;
	
	public BaseMapItem()
	{		
	}
	
	public BaseMapItem(int row, int column)
	{
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
	
}
