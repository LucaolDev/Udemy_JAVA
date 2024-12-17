package application;

import java.util.Scanner;

import entities.Triangle;

public class semObjetos {

	public static void main(String[] args) {
		
		Triangle x,y;
		x = new Triangle();
		y = new Triangle();
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the measures of triangle X: ");
		x.a = in.nextDouble();
		x.b = in.nextDouble();
		x.c = in.nextDouble();
		System.out.println("Enter the measures of triangle Y: ");
		y.a = in.nextDouble();
		y.b = in.nextDouble();
		y.c = in.nextDouble();
		
		
		double areaX = x.area();
		double areaY = y.area();
		
		System.out.printf("Triangle X area: %.4f%n", areaX);
		System.out.printf("Triangle Y area: %.4f%n", areaY);
		
		if (areaX > areaY) {
			System.out.println("Larger area: X");
		}else {
			System.out.println("Larger area: Y");
		}
		
		in.close();
	}

}
