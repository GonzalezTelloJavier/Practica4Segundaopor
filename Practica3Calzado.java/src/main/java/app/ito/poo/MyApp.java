package app.ito.poo;
import industria_calzado.ito.poo.Calzado;

public class MyApp {

	static void run() {
		Calzado cal;
		
		cal=new Calzado(190530,"piel","zapato",350,"cafe");
		System.out.println(cal);
		System.out.println("EL Costo por lote es "+cal.costoxLote(800));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     run();
	}

}
 