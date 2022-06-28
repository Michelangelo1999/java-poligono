package jana60.poligono;

public class Main {

	public static void main(String[] args) {
	    
		Poligono trapezio = new Trapezio(10, 8, 6, 4, 2);
		Poligono triangolo = new Triangolo(10, 15, 20, 5);
		
		Parallelogramma quadrato = new Quadrato(10);
		
		System.out.println("trapezio - area, perimetro");
		System.out.println(trapezio.calcolaArea());
		System.out.println(trapezio.calcolaPerimetro());
		
		System.out.println("triangolo - area, perimetro");
		System.out.println(triangolo.calcolaArea());
		System.out.println(triangolo.calcolaPerimetro());
		
		System.out.println("quadrato - area, perimetro");
		System.out.println(quadrato.calcolaArea());
		System.out.println(quadrato.calcolaPerimetro());

	}

}
