

package principal;
 
public class coche {

	private String marca;

	private String modelo;
 
	public coche () {

		marca = "Lambo";

		modelo = "Pegasus";

	}
 
	public String getmarca() {

		return marca;

	}
 
	public String getmodelo() {

		return modelo;

	}
 
	public void setmarca(String marca) {

		this.marca = marca;

	}
 
	public void setmodelo(String modelo) {

		this.modelo = modelo;

	}

}

package principal;
 
import principal.coche;
 
public class main {
 
	public static void main(String[] args) {

		coche cocheLUCASFOKING = new coche();
 
		cocheLUCASFOKING.setmarca(	cocheLUCASFOKING.getmarca());

		cocheLUCASFOKING.setmodelo(	cocheLUCASFOKING.getmodelo());
 
		System.out.println(	cocheLUCASFOKING.getmarca());

		System.out.println(	cocheLUCASFOKING.getmodelo());
 
	}
 }

package Principal;
 
public class CAIXA {

	private String titular;

	private double saldo;
 
	public CAIXA() {

		titular = "ZAGALON XDDDD";

		saldo = 4000.78;

	}
 
	public String titular() {

		return titular;

	}
 
	public double saldo() {

		return saldo;

	}
 
	public void settitular(String titular) {

		this.titular = titular;

	}
 
	public void setsaldo(double saldo) {

		this.saldo = saldo;

	}
 
 
}

package Principal;
 
public class main {

	public static void main(String[] args) {

		CAIXA cuentazagalon = new CAIXA();
 
		cuentazagalon.settitular(cuentazagalon.gettitular());

		cuentazagalon.setsaldo(cuentazagalon.getsaldo());

		System.out.println(cuentazagalon.gettitular());

		System.out.println(cuentazagalon.getsaldo());
 
	}
}
package Principal;

package Principal;
 
public class BENYJR {

	private String nombre;

	private int edad;

	private double calificacion;
 
	public BENYJR() {

		nombre = "Grumete";

		edad = 99;

		calificacion = 10;

	}
 
	public String nombre() {

		return nombre;

	}
 
	public int edad() {

		return edad;

	}
 
	public double calificacion() {

		return calificacion;

	}
 
	public void setnombre(String nombre) {

		this.nombre = nombre;

	}
 
	public void setedad(int edad) {

		this.edad = edad;

	}
 
	public void setcalificacion(double calificacion) {

		this.calificacion = calificacion;

	}
 }

package Principal;
 
public class main3 {
 
	public static void main(String[] args) {

		BENYJR lucas = new BENYJR();
 
		lucas.setnombre(lucas.getnombre());

		lucas.setedad(lucas.getedad());

		lucas.setcalificacion(lucas.getcalificacion());
 
		System.out.println(lucas.getnombre());

		System.out.println(lucas.getedad());

		System.out.println(lucas.getcalificacion());
 
	}
 }

package Principal;
 
public class PRODUCTOVIVAELESPI {

	String nombre;

	double precio;

	int stock;
 
	public PRODUCTOVIVAELESPI() {

		nombre = "abadproductions";

		precio = 9.00;

		stock = 95;

	}
 
	public String nombre() {

		return nombre;

	}
 
	public double precio() {

		return precio;

	}
 
	public int stock() {

		return stock;

	}
 
	public void setnombre(String nombre) {

		this.nombre = nombre;

	}
 
	public void setprecio(double precio) {

		this.precio = precio;

	}
 
	public void setstock(int stock) {

		this.stock = stock;

	}
 
}

package Principal;
 
public class main4 {
 
	public static void main(String[] args) {

		PRODUCTOVIVAELESPI messi = new PRODUCTOVIVAELESPI();

		messi.setnombre(messi.getnombre());

		messi.setprecio(messi.getprecio());

		messi.setstock(messi.getstock());

		System.out.println(messi.getnombre());

		System.out.println(messi.getprecio());

		System.out.println(messi.getstock());
 
	}
 }
