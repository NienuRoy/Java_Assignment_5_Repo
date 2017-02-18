public abstract class DessertItem extends java.lang.Object{

	//Declaring variables as protected so that subclasses can also access
	protected java.lang.String name;
	protected int cost;

	//Declaring a null constructor
	public DessertItem(){

	}

	public DessertItem(java.lang.String name) {
		super();
		
		if(name.length()>DessertShoppe.ITEM_NAME_MAX_SIZE){   //Conditions for displaying name
			this.name=name.substring(0,DessertShoppe.ITEM_NAME_MAX_SIZE);
		}
		else if(name.length()<12){
			this.name = name +"\t";
		}
		else
			this.name=name;			
	}

	public final java.lang.String getName(){
		return name;
	}

	public abstract  int getCost();

}
