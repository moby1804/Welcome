import java.util.Scanner;

	public class Separator{

		public static void main(String...args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 digit number: ");
		int value = input.nextInt();
		int num1 = value/10_000;
		value = value % 10_000;
		int num2 = value / 1000;
		value = value % 1000;
		int num3 = value / 100;
		value = value % 100;
		int num4 = value / 10;
		int num5 = value / 1;

		System.out.printf("%d   %d   %d   %d   %d", num1, num2, num3, num4, num5);






}







}