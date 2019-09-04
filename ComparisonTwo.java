
import java.util.Scanner;

public class ComparisonTwo {


	public static void main (String[] args) {

	Scanner input = new Scanner(System.in);

	/**Here we will be comparing two inputs Cost Price and Selling Price*/
	
		System.out.print("Enter Cost Price: ");
		int costPrice = input.nextInt();
		
		System.out.print(" Enter Selling Price: ");
		int sellingPrice = input.nextInt();
		


	if(costPrice == sellingPrice){

	System.out.printf("%d == %d%n", costPrice, sellingPrice);

		}

	if(costPrice != sellingPrice){

	System.out.printf("%d == %d%n", costPrice, sellingPrice);

 		}

	if(costPrice >= sellingPrice){

	System.out.printf("%d >= %d%n", costPrice, sellingPrice);

 		}

	if(costPrice <= sellingPrice){

	System.out.printf("%d <= %d%n", costPrice, sellingPrice);

 		}







}









}