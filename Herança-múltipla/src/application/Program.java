package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;


public class Program {

	public static void main(String[] args) {
		
		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("My letter");
		p.print("My letter");
		
		System.out.println();
		ConcreteScanner in = new ConcreteScanner("2003");
		in.processDoc("My Email");
		System.out.println("Scan result: " + in.scan());
		
		System.out.println();
		ComboDevice c = new ComboDevice("2081");
		c.processDoc("My dissertation");
		c.print("My dissertation");
		System.out.println("Scan result: " + c.scan());
	}
}
