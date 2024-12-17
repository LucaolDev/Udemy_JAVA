package application;

import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		System.out.println("Enter product data: ");
//		System.out.print("Name: ");
//		String name = in.nextLine();
//		System.out.print("Price: ");
//		double price = in.nextDouble();
//		System.out.print("Quantity in stock: ");
//		int quantity = in.nextInt();
//		Product product = new Product(name, price, quantity);
//		
//		product.setName("Computer");
//		System.out.println("Updated name: " + product.getName());
//		product.setPrice(1200.00);
//		System.out.println("Updated price: " + product.getPrice());

//		System.out.println();
//		System.out.println("Product data: " + product);
//		
//		System.out.println();
//		System.out.println("Enter the number of products to be added in stock: ");
//		quantity = in.nextInt();
//		product.addProducts(quantity);
//		
//		System.out.println();
//		System.out.println("Updated data: " + product);
//		
//		System.out.println();
//		System.out.println("Enter the number of products to be removed from stock: ");
//		quantity = in.nextInt();
//		product.removeProducts(quantity);
//		
//		System.out.println();
//		System.out.println("Updated data: " + product);
//		
		
		int n = in.nextInt();
		Product[] vect = new Product[n];
		
		for (int i = 0; i < vect.length; i++) {
			in.nextLine();
			String name = in.nextLine();
			double price = in.nextDouble();
			vect[i] =  new Product(name, price);
		}
		
		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getPrice();
		}
		double avg = sum / 3;
		
		System.out.printf("AVERAGE PRICe = %.2f%n " , avg);
		
		in.close();
	}
	
}
