package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contract;
import model.entities.Installment;
import model.services.ContractService;
import model.services.PaypalService;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner in = new Scanner(System.in);
	
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do contrato: ");
		System.out.print("Numero: ");
		int number = in.nextInt();
		System.out.print("Data (dd/MM/yyyy): ");
		LocalDate date = LocalDate.parse(in.next(), fmt);
		System.out.print("Valor do contrato: ");
		double totalValue = in.nextDouble();
		
		Contract contract = new Contract(number, date, totalValue);

		System.out.print("Entre com o numero de parcelas: ");
		int n = in.nextInt();
		
		ContractService contractService = new ContractService(new PaypalService());
		
		contractService.processContract(contract, n);
		
		System.out.println("Parcelas: ");
		for (Installment installment : contract.getInstallments()) {
			System.out.println(installment);
		}
	
		
		in.close();
	}
}
