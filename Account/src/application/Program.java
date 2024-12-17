package application;

import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		Account account;
		
		System.out.println("Enter account number: ");
		int number = in.nextInt();
		System.out.println("Enter account holder");
		in.nextLine();
		String holder = in.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = in.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter initial deposit value: ");
			double initialDeposit = in.nextDouble();
		    account = new Account(number, holder, initialDeposit);
		}else {
			account = new Account(number, holder);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = in.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = in.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);
		
		in.close();
	}
}
