/**
*	A class that sends all of the attributes obtained from a menuItem
*	to the class with the method that the attribute is associated with.
*	For example price attribute will be send to getPrice. It also
*	Overrides all inherited methods where required. 
*
*	@author Darragh King (ID 113372871)
*/	
public class ConcreteMenuItems implements MenuItems{

		private final Consumable consumable;
		private final Taxable taxable;
		private final Valuable valuable;
	
		/**
		*	A constuctor that gets its actual parameters either from ConcreteBeverage or
		*	ConcreteFood. The parameters obtained are gotten from a ConcreteMenuItems
		*	objects creted in either of the two classes. The object contains objects with
		*	attributes in them.	
		*
		*	@param consumable An object containing a DefaultConsumable object that contains one or more menu item attributes.
		*	@param taxable An object containing a Vat object that contains one or more menu item attributes.
		*	@param consumable An object containing a Getprice object that contains one or more menu item attributes.
		*/
		public ConcreteMenuItems(Consumable consumable, Taxable taxable, Valuable valuable){
			this.consumable = consumable;
			this.taxable = taxable;
			this.valuable = valuable;
		}

		/**
		*	Overrides getPrice using the method implemented in the GetPrice
		*	class.
		*
		*	@return A String indicating the menu item's price
		*/
		@Override
		public String getPrice(){
			return valuable.getPrice();
		}

		/**
		*	Overrides decideTaste using the method implemented in the DefaultConsumable 
		*	class.
		*
		*	@return A String indicating the menu item's taste.
		*/
		@Override
		public String decideTaste(){
			return consumable.decideTaste();
		}

		/**
		*	Overrides vatRate using the method implemented in the Vat class.
		*
		*	@return A String indicating whch vat rate to use.
		*/
		@Override
		public String vatRate(){
			return taxable.vatRate();
		}

		/**
		*	Overrides getName using the method implemented in the Default consumable class.
		*
		*	@return A String indicating the name of the menu item in question.
		*/
		@Override
		public String getName(){
			return consumable.getName();
		}
		
}
