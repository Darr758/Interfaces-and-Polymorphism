/**
*	A class that implements the getName and decideTaste methods 
*	which are used by each menu item. 
*
*	@author Darragh King (ID 113372871)
*/

public class DefaultConsumable implements Consumable{

	private final String NAME;
	private final boolean TASTE;

	private final String TASTES_GOOD = " tastes good,";
	private final String TASTES_BAD = " tastes bad,";

	/**
	*	Constructor that takes in both the name
	*	and taste of the menu item in question
	*	which can then be used in the getName and decideTaste 
	*	methods
	*	
	*	@param name The given name
	*	@param taste The taste, which is either true(good) or false(bad)
	*/
	public DefaultConsumable(String name, boolean taste){
		this.NAME = name;
		this.TASTE = taste;
	}

	/**
	*	Returns the name of the menu item in question 
	*	which can be used later on in printing the menu.
	*
	*	@return A String indicating the name of the menu item in question.
	*/
	@Override 
	public String getName(){
		return NAME;
	}

	/**
	*	Takes in the boolean value gotten from the menu items class
	*	by the constructor and prints a statement indicating if
	*	it tastes good or bad depending on the value gotten.
	*
	*	@return A string indicating if the item in question tastes good or bad.
	*/
	@Override 
	public String decideTaste(){
		String decidedTaste;
		if(TASTE == true){
			decidedTaste = TASTES_GOOD;
		}
		else{
			decidedTaste = TASTES_BAD;
		}
		return decidedTaste;
	}
}
