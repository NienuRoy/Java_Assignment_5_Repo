
public class Sundae extends IceCream{

	//Declas=ring variables for this class
	private String toppingName;
	private int toppingCost;

	public Sundae(String name, int cost, String toppingName, int toppingCost) {
		super(name,cost);
		this.toppingName=toppingName;
		this.toppingCost=toppingCost;	
	}

	@Override
	public int getCost() {
		//Ice Cream cost is used here along with sundae topping cost
		return cost+toppingCost;
	}

	@Override
	public String toString() {
		return toppingName + " Sundae with \n" +name + "\t\t" +DessertShoppe.cents2dollarsAndCents(getCost());
	}

}
