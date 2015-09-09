/**
*	A class that implements the method vatRate which is used
*	by each menu item to determine its vat rate 
*	for the menu.
*
*	@author Darragh King (ID 113372871)
*/

public class Vat implements Taxable{

	private final String VAT;

	private final String STANDARD = "Standard";
	private final String NO_VAT = "none";

	private String standardVatOutput = " vat rate: 0.23.";
	private String noVatOutput = " vat rate: 0.00.";
	private final String errorOutput = " No recorded vat rate.";

	/**
	*	Contructor that takes in the vat rate from the 
	*	menu item in question which can then be used in the 
	*	vatRate method.
	*
	*	@return vat The vat rate of the given menu item.
	*/
	public Vat(String vat){
		this.VAT = vat;
	}

	/**
	*	Determines the vat rate of an item depending
	*	on the stated rate indicated by the menu items class.
	*
	*	@return A String indicating the vat rate of the menu item.
	*/
	@Override 
	public String vatRate(){
		String vatRate;
		if(VAT.equals(STANDARD)){
			vatRate = standardVatOutput;
		}
		else if(VAT.equals(NO_VAT)){
			vatRate = noVatOutput;
		}
		else{
			vatRate = errorOutput;
		}
		return vatRate;
	}
}
