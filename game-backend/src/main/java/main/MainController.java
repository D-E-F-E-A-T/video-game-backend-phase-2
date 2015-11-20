package main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class MainController 
{
//	@Autowired
//	private WorldRepository worldRepository;

	@Autowired
	private UserRepository userRepository;


	// curl -X POST "http://localhost:8085/user" -d "first_name=Bob&last_name=Barker"
	@RequestMapping(value = "/user", method = RequestMethod.POST)
	public ResponseEntity<String> createUser(
		@RequestParam(value = "token") String token,
		@RequestParam(value = "last_name") String lastName,
		@RequestParam(value = "first_name") String firstName)
	{
		// TODO: Put request into queue.
		EntityManagerFactory entityManagerFactory;		
		entityManagerFactory = Persistence.createEntityManagerFactory("userPu");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		entityManager.getTransaction().begin();

		User user = new User(firstName, lastName);
		
		entityManager.persist(user);
		entityManager.getTransaction().commit();
		entityManager.close();		
		
		
    	return new ResponseEntity<String>(
        		user.getId(), 
        		HttpStatus.OK);		
	}
	
//	@RequestMapping(value = "/world", method = RequestMethod.POST)
//    public ResponseEntity<String> createWorld(   
//    	@RequestParam(value = "id") String id)    	    	
//    {
//		repository.deleteAll();

		// save a couple of customers
//		repository.save(new World());
		
/*		
		int numRows = 11;
		int numColumns = 11;
		
    	WorldMap worldMap = new WorldMap(numRows, numColumns);
    	
    	for (int row = 0; row < numRows; row++)
    	{
    		for (int column = 0; column < numColumns; column++)
    		{
    			worldMap.set(
    				row, 
    				column, 
    				new Tree(row, column));
    		}
    	}
*/    	
    	
//    	return new ResponseEntity<String>(
//    		"hello", //worldMap.toString(), 
//    		HttpStatus.OK);
//    }
	
	@RequestMapping(value = "/world", method = RequestMethod.GET)
	public ResponseEntity<String> getWorld(
		@RequestParam(value = "token") String token,
		@RequestParam(value = "id") String id)
	{
    	return new ResponseEntity<String>(
        		"hello", //worldMap.toString(), 
        		HttpStatus.OK);	
	}
}
