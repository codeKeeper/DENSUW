
/** The standard interface for a room in the game
 * 
 * @author Robin (codeKeeper) McNally
 * @since 04-15-2013
 * 
 */
public interface Room{
	
	//Gets the full description of the room
	public String fullDesc();
	
	//Gets the short description of the room
	public String shortDesc();
	
	//Gets the Item array related with this room
	public Item[] getItems();
	
	//Gets the Baddie in this room if there is one
	public Baddie getBaddie();
	
	//Gets the name of this room
	public String getName();
}
