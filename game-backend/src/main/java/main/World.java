package main;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;

import java.util.HashSet;
import java.util.Set;

@Entity
public class World 
{
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

/*
	@OneToMany(mappedBy = "world", cascade = CascadeType.PERSIST)
	private Set<Region> regions = new HashSet<>();
*/
	
	World()
	{		
	}
}
