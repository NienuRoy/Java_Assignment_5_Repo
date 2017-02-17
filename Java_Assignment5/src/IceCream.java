
public class IceCream extends DessertItem{
	//protected so that sundae class can use it
	protected int cost;

	public IceCream(String name, int cost) {
		super(name);	
		this.cost=cost;
	}	

	@Override
	public int getCost() {
		//No cost calculation - cost as it is
		return cost;		
	}

	@Override
	public String toString() {
		//Cost is converted to string for display
		return this.name + "\t\t" + DessertShoppe.cents2dollarsAndCents(getCost());
	}
}
