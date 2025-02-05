package application;

import java.util.Locale;
import java.util.Scanner;

import services.InterestService;
import services.UsaInterestService;
import services.BrazilInterestService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
		
		System.out.println("Amount: ");
		double amount = in.nextDouble();
		System.out.println("Months: ");
		int months = in.nextInt();
		
		InterestService is = new UsaInterestService(1.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Payment after " + months + " months:");
		System.out.println(String.format("%.2f", payment));
		
		in.close();
	}
}
