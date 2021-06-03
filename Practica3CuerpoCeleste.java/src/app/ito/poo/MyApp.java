package app.ito.poo;
import observatorio.ito.poo.CuerpoCeleste;
import observatorio.ito.poo.ubicacion;

public class MyApp {

	static void run() {
		CuerpoCeleste c;
		ubicacion u;
		
		c=new CuerpoCeleste("Marte","Carbono");
		System.out.println(c);
		u=new ubicacion (101.00f,27003.0988f,"9 meses",25438.89f);
		System.out.println(u);
		System.out.println("Su nueva ubicación es: "+c.desplazamiento(55,1));
		System.out.println(c);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     run();
}

}
