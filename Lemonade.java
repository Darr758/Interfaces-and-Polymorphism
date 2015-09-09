/**
*	Class for the menu item TapWater.
*	Contains all of	TapWaters individual attrivutes.
*	It also Overrides all methods where required.
*
*	@author Darragh King (ID 113372871)
*/

public class Lemonade implements Beverage{

	private final Beverage beverage;
	private final String NAME = "Lemonade,";
	private final boolean TASTE = true;
	public final String VAT = "Standard";
	private final String PRICE = "2.00";

	/**
	*	Constructor that passes on all of Lemonade's individual 
	*	attributes for use in the ConcreteBeverage class.
	*
	*/
	public Lemonade(){
		beverage = new ConcreteBeverage(this.NAME,this.TASTE,this.VAT,this.PRICE);
	}

	/**
	*	Overrides getPrice using the method implemented in the GetPrice
	*	class.
	*
	*	@return A String indicating the menu item's price
	*/
	@Override
	public String getPrice(){
		return beverage.getPrice();
	}

	/**
	*	Overrides decideTaste using the method implemented in the DefaultConsumable 
	*	class.
	*
	*	@return A String indicating the menu item's taste.
	*/
	@Override
	public String decideTaste(){
		return beverage.decideTaste();
	}

	/**
	*	Overrides vatRate using the method implemented in the Vat class.
	*
	*	@return A String indicating whch vat rate to use.
	*/
	@Override
	public String vatRate(){
		return beverage.vatRate();
	}

	/**
	*	Overrides getName using the method implemented in the Default consumable class.
	*
	*	@return A String indicating the name of the menu item in question.
	*/
	@Override
	public String getName(){
		return beverage.getName();
	}
} 
