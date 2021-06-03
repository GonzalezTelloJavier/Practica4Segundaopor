package app.ito.poo;
import java.time.LocalDate;

import clases.ito.poo.CuentaBancaria;
public class MyApp {
	static void run() {
		CuentaBancaria c=new CuentaBancaria(123456,"Fernando Torres", 14500, LocalDate.of(2021, 8, 18));
	System.out.println(c);
	System.out.println("Se retira:  "+c.retiro(5000));
	System.out.println(c);
	System.out.println("Deposito: "+c.deposito(10000));
	System.out.println(c);
	
	}
	public static void main(String []args) {
		run();
		
	}
}
