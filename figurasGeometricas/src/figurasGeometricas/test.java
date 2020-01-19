package figurasGeometricas;

public class test {
	public static void main (String[] args) {
		circulo ci = new circulo( );
		cuadrado cu = new cuadrado( );
		triangulo t = new triangulo( );
		rombo r = new rombo( );
		System.out.print(ci.toString());
		ci.identidad( );
		System.out.print(cu.toString());
		cu.identidad( );
		System.out.print(t.toString());
		t.identidad( );
		System.out.print(r.toString());
		r.identidad( );
		}
	}
