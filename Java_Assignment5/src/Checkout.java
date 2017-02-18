public class Checkout {

	//Variables for this class are declared
	private int numberOfItems;
	private DessertItem[] items;
	private int totalCost;
	private int sizeOfList;

	public Checkout(){
		sizeOfList = 150; //Simply declaring 150 as a limit
		items = new DessertItem[sizeOfList];
		numberOfItems = 0;
	}

	public int numberOfItems(){
		return numberOfItems;
	}

	//Adding each item to the items[] array
	public void enterItem(DessertItem item){
		items[numberOfItems] = item;
		numberOfItems++;		
	}

	//Setting all items to null including totalCost and numberOfItems to clear for the next list of items
	public void clear(){
		for(int i =0;i<numberOfItems;i++){
			items[numberOfItems]=null;
		}	
		totalCost = 0;
		numberOfItems = 0;
	}

	//Calculating the cost of each item - overridden getCost() method of each item will be invoked
	public int totalCost(){
		totalCost = 0;
		for(int i =0;i<numberOfItems;i++){
			totalCost +=items[i].getCost();
		}
		return totalCost;		 
	}

	//Total tax will be totalcost*tax/100
	public int totalTax(){
		return (int)Math.round(totalCost() * DessertShoppe.TAX_RATE/100);		
	}

	public String toString(){	
		
		System.out.println("\t" +DessertShoppe.STORE_NAME);
		System.out.println("\t--------------------");
		System.out.println();

		for(int i=0;i<numberOfItems;i++){
			System.out.println(items[i]); //The toString method of each item will be invoked
		}
		//Printing the lines after the list of items
		System.out.println();
		System.out.println("Tax \t\t\t\t" +DessertShoppe.cents2dollarsAndCents(totalTax()));
		System.out.println("Total Cost \t\t\t" +DessertShoppe.cents2dollarsAndCents(totalCost()+totalTax()));
		return "";				
	}
}
