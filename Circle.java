import java.util.Scanner;

public class Circle {

	public static void main(String[] args){

		Scanner radius = new Scanner(System.in);

		System.out.print("Enter the radius of your circle: ");
		int rad = radius.nextInt();
		//int x = 2;
		//int dia = x * rad;
		//double area = Math.PI * rad * rad;
		//double circ = x * Math.PI * rad;
		
		//System.out.printf("diameter =  %d%n Circumfrence is %.5f%n Area is %.5f%n ", dia, circ, area);
		System.out.printf("Diameter with radius %d is %d%n Circumfrence with radius %d is %.2f%n Area is %.2f%n ", rad, (2*rad), rad, (2* Math.PI* rad), (Math.PI* rad* rad));
		










}










}