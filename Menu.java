import java.util.ArrayList;
/**	
*	A class consisting of the datastructure that contains
*	all of the items on the menu aswell as methods required
*	for printing the menu, adding items to the menu,
*	removing items form the menu and the main method.
*
*	@author Darragh King (ID 113372871)
*/
public class Menu{

	private static ArrayList<MenuItems> menuItems = new ArrayList<MenuItems>();

	/**
	*	Method for adding beverage items to the menu.
	*
	*	@param beverage The given beverage item to be added.
	*/
	public void addBeverage(Beverage beverage){
		menuItems.add(beverage);
	}

	/**
	*	Method for adding food items to the menu.
	*
	*	@param food The given food item to be added.
	*/
	public void addFood(Food food){
		menuItems.add(food);
	}

	/**
	*	Method for removing beverage items from the menu.
	*
	*	@param beverage The given beverage item to be removed.
	*/
	public void removebeverage(Beverage beverage){
		menuItems.remove(beverage);
	}

	/**
	*	Method for removing food items from the menu.
	*
	*	@param food The given food item to be removed.
	*/
	public void removeFood(Food food){
		menuItems.remove(food);
	}

	/**
	*	The method that goes through the menu and prints out 
	* 	all menu items starting with beverages.
	*/
	public void printMenu(){
		System.out.println("Beverages");
		for(MenuItems menuItem : menuItems){
			if(menuItem instanceof Beverage){
				String name = menuItem.getName();
				String taste = menuItem.decideTaste();
				String price = menuItem.getPrice();
				String vatRate = menuItem.vatRate();
				System.out.println(name + taste + price + vatRate);
			}
		}
		System.out.println("Food");
		for(MenuItems menuItem : menuItems){
			if(menuItem instanceof Food){
				String name = menuItem.getName();
				String taste = menuItem.decideTaste();
				String price = menuItem.getPrice();
				String vatRate = menuItem.vatRate();
				System.out.println(name + taste + price + vatRate);
			}
		}
		System.out.println();
	}

	/**
	*	The method where you can print the menu aswell as
	*	add food and beverages to and from the menu.
	*
	*	@param args The given command line arguments 
	*/
    public static void main( String[] args ) {

    	Beverage lemonade = new Lemonade();
		Beverage tapWater = new TapWater();
		Food boxty = new Boxty();
		Food beef = new Beef();
		Food irishStew = new IrishStew();
    	Menu menu = new Menu();
    	menu.addBeverage(lemonade);
    	menu.addBeverage(tapWater);
    	menu.addFood(boxty);
    	menu.addFood(beef);
    	menu.addFood(irishStew);
    	menu.printMenu();
    	
    }
}
 
