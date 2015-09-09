/**
*	A class that takes all of a beverages attributes
*	and puts them in objects to be used in the ConcreteMenuItems
*	class. It also Overrides all inherited methods where required.
*
*	@author Darragh King (ID 113372871)
*/
public class ConcreteBeverage implements Beverage{

	private final MenuItems menuItems;

	/**
	*	A constructor that creates a ConcreteMenuItems object with object arguements which
	*	in turn contain the attributes of a beverage that will be passed into the ConcreteMenuItems
	*	constructor for use. Each object arguement contains one or more attributes from a menu 
	* 	item class that will be used as a parameter in one of the methods required for printing the menu.
	*
	*	@param name The given name.
	*	@param taste The taste which is either true(good) or false (bad).
	*	@param vat The given vat rate
	*	@param price The given price
	*
	*/
	public ConcreteBeverage(String name, boolean taste, String vat, String price){
		menuItems = new ConcreteMenuItems( new DefaultConsumable(name, taste), new Vat(vat), new GetPrice(price));
	}

	/**
	*	Overrides getPrice using the method implemented in the GetPrice
	*	class.
	*
	*	@return A String indicating the menu item's price
	*/
	@Override
	public String getPrice(){
		return menuItems.getPrice();
	}

	/**
	*	Overrides decideTaste using the method implemented in the DefaultConsumable 
	*	class.
	*
	*	@return A String indicating the menu item's taste.
	*/
	@Override 
	public String decideTaste(){
		return menuItems.decideTaste();
	}


	/**
	*	Overrides vatRate using the method implemented in the Vat class.
	*
	*	@return A String indicating whch vat rate to use.
	*/
	@Override
	public String vatRate(){
		return menuItems.vatRate();
	}

	/**
	*	Overrides getName using the method implemented in the Default consumable class.
	*
	*	@return A String indicating the name of the menu item in question.
	*/
	@Override
	public String getName(){
		return menuItems.getName();
	}

}
