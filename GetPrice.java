/**
* This class implements the method getPrice from the interface
* "Valuable" which is used by all of the items on the menu.
* It also contains a constructor which will take in the individual
* price of each menu items class to be used in the getPrice method.
* 
* @author Darragh King (ID 113372871)
*/

public class GetPrice implements Valuable{

	private final String PRICE;

	/**
	*	Constructor that takes in each menu items specific price.
	*	
	*	@param price The given price.
	*/
	public GetPrice(String price){
		this.PRICE = price;
	}

	/**
	*	Takes in the price from whichever class the method is applied to 
	*	and puts it into a string format. 
	*
	*	@return A String that states the menu items price
	*/
	@Override
	public String getPrice(){
		String priceGiven = " price: " + PRICE + " Euro,";
		return priceGiven;
	}
}
