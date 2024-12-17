package application;

import java.util.Scanner;
import util.Calculator;

public class Program {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);	
	
		System.out.println("Enter radius: ");
		double radius = in.nextDouble();
		
		double c = Calculator.circumference(radius);
		double v = Calculator.volume(radius);
		
		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);
		
		in.close();
	}
}
