package main;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// Explore using Proto Buffers to increase transmission, 
//	serialization, deserialization speed.
@RestController
public class BackendController 
{
    // A map can be a map for a single screen or for an entire world.
	@RequestMapping("/map")
    public ResponseEntity<String> getMap(   
    	@RequestParam(value="world_id") int worldId,
    	@RequestParam(value="screen_id") int screenId)    	    	
    {
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
    	
    	return new ResponseEntity<String>(
    		worldMap.toString(), 
    		HttpStatus.OK);
    }
}
