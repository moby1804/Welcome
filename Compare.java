
import java.util.Scanner;

public class Compare {


	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

	/**Here we will be comparing two inputs Cost Price and Selling Price*/
	
		System.out.print("Enter Cost Price: ");
		int costPrice = input.nextInt();
		
		System.out.print(" Enter Selling Price: ");
		int sellingPrice = input.nextInt();
		
		
		System.out.print(" Enter Gross Profit: ");
		int grossProfit = input.nextInt();

		int max = 0;
		if(costPrice > sellingPrice){
			max = costPrice;
		}
		else{
			max = sellingPrice;
		}
		if(max > grossProfit){
			System.out.println(max);
		}
		else{
			System.out.println(grossProfit);
		}

	//if(costPrice == sellingPrice && sellingPrice == grossProfit && costPrice == grossProfit){

	//System.out.printf("%s%n", "All values are equal");

		//}

	//if(costPrice != sellingPrice && sellingPrice != grossProfit && costPrice != grossProfit){

	//System.out.printf("%s%n","Values are not equal");

 		//}

	//if(costPrice >= sellingPrice && costPrice >= grossProfit){

	//System.out.printf("%s%n","Cost price is likely our largest value");

 		//}

	//if(costPrice <= sellingPrice && sellingPrice <= grossProfit){

	//System.out.printf("%s%n","Gross Profit is likely our largest value");

 		//}


	//if(costPrice <= sellingPrice && grossProfit <= sellingPrice){

	//System.out.printf("%s%n","Selling Price is likely our largest value");

 		//}



}









}