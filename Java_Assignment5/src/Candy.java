
public class Candy extends DessertItem{

	//Initializing private variables for this class
	private double weight;
	private int pricePerPound;

	public Candy(String name , double weight, int pricePerPound){
		super(name);
		this.weight=weight;
		this.pricePerPound=pricePerPound;
	}

	@Override
	public int getCost() {	
		//calculation for the cost of candy
		return (int)Math.round(weight * pricePerPound);
	}

	@Override
	public String toString() {
		
		//costs are displayed as a string with decimal points
		return weight +" lbs."+ " @ " + DessertShoppe.cents2dollarsAndCents(pricePerPound) + " /lb.\n" 
				+ this.name +"\t\t" +DessertShoppe.cents2dollarsAndCents(getCost());
	}	
}
