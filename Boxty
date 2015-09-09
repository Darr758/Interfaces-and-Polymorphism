/**
*	Class for the menu item Boxty.
*	Contains all of	TapWaters individual attrivutes.
*	It also Overrides all inherited methods where required.
*
*	@author Darragh King (ID 113372871)
*/
public class Boxty implements Food{ 

	private final Food food;
	private final String NAME = "Boxty,";
	private final boolean TASTE = false;
	public final String VAT = "Standard";
	private final String PRICE = "7.00";

	/**
	*	Constructor that passes on all of Boxty's individual 
	*	attributes for use in the ConcreteFood class.
	*
	*/
	public Boxty(){
		food = new ConcreteFood(this.NAME,this.TASTE,this.VAT,this.PRICE);
	}

	/**
	*	Overrides getPrice using the method implemented in the GetPrice
	*	class.
	*
	*	@return A String indicating the menu item's price
	*/
	@Override
	public String getPrice(){
		return food.getPrice();
	}

	/**
	*	Overrides decideTaste using the method implemented in the DefaultConsumable 
	*	class.
	*
	*	@return A String indicating the menu item's taste.
	*/
	@Override
	public String decideTaste(){
		return food.decideTaste();
	}

	/**
	*	Overrides vatRate using the method implemented in the Vat class.
	*
	*	@return A String indicating whch vat rate to use.
	*/
	@Override
	public String vatRate(){
		return food.vatRate();
	}

	/**
	*	Overrides getName using the method implemented in the Default consumable class.
	*
	*	@return A String indicating the name of the menu item in question.
	*/
	@Override
	public String getName(){
		return food.getName();
	}

} 
