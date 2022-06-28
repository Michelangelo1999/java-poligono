package jana60.poligono;

public class Triangolo implements Poligono {
	
	//attributi
	private int base;
	private int latoDue;
	private int latoTre;
	private int altezza;
	
	//cotruttori
	public Triangolo(int base, int latoDue, int latoTre, int altezza) {
		this.base = base;
		this.latoDue = latoDue;
		this.latoTre = latoTre;
		this.altezza = altezza;
	}
	
	//metodi
	@Override
	public int calcolaPerimetro() {
		return base+latoDue+latoTre;
	}
	
	@Override
	public int calcolaArea() {
		return (base*altezza)/2;
	}

}
