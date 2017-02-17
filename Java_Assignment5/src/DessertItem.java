public abstract class DessertItem extends java.lang.Object{
	
	//Declaring variables as protected so that subclasses can also access
	protected java.lang.String name;
	protected int cost;

	public DessertItem(String name) {
		super();
		//Conditions for displaying name
		if(name.length()>DessertShoppe.ITEM_NAME_MAX_SIZE){
			this.name=name.substring(0,DessertShoppe.ITEM_NAME_MAX_SIZE);
		}
		else if(name.length()<12){
			this.name = name +"\t";
		}
		else
			this.name=name;			
	}
	
	public abstract  int getCost();
	
}
