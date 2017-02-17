public class DessertShoppe {
	
	public final static double TAX_RATE = 6.5;
	public final static String STORE_NAME = "M & M Dessert Shoppe";
	public final static int ITEM_NAME_MAX_SIZE = 25;
	public final static int COST_WIDTH = 5;
	
	public static String cents2dollarsAndCents(int cents){
		
		int dol = cents/100;
		int cent = cents%100;		
		
		if(cent<10){	
			return dol +"." +"0" +cent; //adding a zero after decimal point for less than 10 numbers
		}
		else 		
			return dol +"." +cent;
	}
}
