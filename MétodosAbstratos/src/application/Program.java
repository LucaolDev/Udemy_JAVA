package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		List<Shape> list = new ArrayList<>();
		
		System.out.println("Enter the number of shapes: ");
		int n = in.nextInt();
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Shape #" + i + " data:");
			System.out.println("Rectangle or Circle (r/c)? ");
			char ch = in.next().charAt(0);
			System.out.println("Color (BLACK/BLUE/RED): ");
			Color color = Color.valueOf(in.next());
			
			if(ch == 'r') {
				System.out.println("Width: ");
				double width = in.nextDouble();
				System.out.println("Height: ");
				double height = in.nextDouble();
				list.add(new Rectangle(color, width, height));
			}
			else {
				System.out.println("Radius: ");
				double radius = in.nextDouble();
				list.add(new Circle(color, radius));
				
			}
		}
		
		System.out.println();
		System.out.println("SHAPE AREAS: ");
		for (Shape shape : list) {
			System.out.println(String.format("%.2f", shape.area()));
		}
		
		in.close();
	}
	
}
