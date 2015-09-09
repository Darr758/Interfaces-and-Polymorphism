public class Taster implements Consumable{

	private final String NAME;
	private final boolean TASTE;

	public Taster(String name, boolean taste){
		this.NAME = name;
		this.TASTE = taste;
	}

	@Override 
	public String getName(){
		return NAME;
	}

	@Override 
	public String decideTaste(){
		String decidedTaste;
		if(TASTE == true){
			decidedTaste = " tastes good,";
		}
		else{
			decidedTaste = " tastes bad,";
		}
		return decidedTaste;
	}
}
