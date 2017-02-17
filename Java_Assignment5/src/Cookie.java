public class Cookie extends DessertItem{

	//Initializing private variables for this class
	private int number;
	private int pricePerDozen;

	public Cookie(String name, int number, int pricePerDozen) {
		super(name);
		this.number=number;
		this.pricePerDozen=pricePerDozen;
	}

	@Override
	public int getCost() {
		//Calculation for the cost of cookies
		return (int)Math.round(number * pricePerDozen/12);
	}

	@Override
	public String toString(){
		return number +" @ " +DessertShoppe.cents2dollarsAndCents(pricePerDozen) +" /dz.\n" +name +"\t\t" +DessertShoppe.cents2dollarsAndCents(getCost());
	}

}
