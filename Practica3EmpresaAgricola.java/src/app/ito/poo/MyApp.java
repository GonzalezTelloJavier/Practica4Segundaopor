package app.ito.poo;
import Agricultura.ito.poo.Fruta;
public class MyApp {
	static void run() {
		Fruta f= new Fruta("'pera", 15000, "3 meses", 237, 3600, 40000);
		System.out.println(f); 
		f.agregarPeriodo("5/02/2021", 4f);
		f.agregarPeriodo("25/01/2021", 1f);
		f.agregarPeriodo("27/08/2020", 4.4f);
		System.out.println(f);
		System.out.println(f.eliminarPeriodo(1));
		System.out.println(f);
		//
		System.out.println("Costo por periodo:  $"+f.costoPeriodo(0));
		System.out.println("Ganancias por periodo:  $"+f.ganancia(0));
	}
	public static void main (String []args) {
		
		run();
		
		
	}

}
