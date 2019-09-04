import java.util.Scanner;

public class Bmi {

	public static void main(String...args){

	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter your weight (in kg): ");
	double weight = input.nextDouble();

	System.out.print("Enter your height (in cm ): ");
	double height = input.nextDouble();
	
	double hei = height/100;
	
	double index = weight/(hei*hei);

	System.out.printf("Your BMI is:  %f%n",  index);

		if(index < 18.5 ){

		System.out.printf("%s%n", "Youre underweight");
			}

		if(index > 18.4 && index <= 24.5 ){

		System.out.printf("%s%n","Your BMI is normal");
			}

		if(index > 24.6 && index <= 29.9){

		System.out.printf("%s%n","Youre overerweight");
			}

		if(index >= 30 ){

		System.out.printf("%s%n","Youre Obese, Please watch your weight");
			}
 









}















}