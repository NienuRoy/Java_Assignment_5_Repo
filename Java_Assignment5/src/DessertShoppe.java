public class DessertShoppe {

	public final static double TAX_RATE = 6.5;
	public final static String STORE_NAME = "M & M Dessert Shoppe";
	public final static int ITEM_NAME_MAX_SIZE = 25;
	public final static int COST_WIDTH = 7;

	public static String cents2dollarsAndCents(int cents){

		int dol = cents/100;
		int cent = cents%100;	
		String result;

		if(cent<10){	
			result = dol +"." +"0" +cent; //adding a zero after decimal point for less than 10 numbers
			
			if(result.length()>COST_WIDTH){	//Checking if it exceeds the COST_WIDTH static variable
				result = result.substring(0, COST_WIDTH); //If it does, substring it
			}
			else{
				return result; 
			}
		}
		else 	
			result = dol +"." +cent;
		
		if(result.length()>COST_WIDTH){
			result = result.substring(0, COST_WIDTH);
		}
		else{
			return result; 
		}
		return result;
	}
}
