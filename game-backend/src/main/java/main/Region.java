package main;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.List;

@Entity
public class Region 
{
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;
	
	@ManyToOne
	private World world;

	@ElementCollection
	@OrderColumn(name = "stackNo")
	private List<Space> spaces;

	public Region() {}

}
