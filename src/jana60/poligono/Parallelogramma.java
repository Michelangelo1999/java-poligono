package jana60.poligono;

public abstract class Parallelogramma implements Poligono {
	
	//attributi
	private int base;
	private int altezza;
	
	//costruttori
	public Parallelogramma(int base, int altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	//metodi
	@Override
	public int calcolaPerimetro() {
		return (base+altezza)*2;
	}
	
	@Override
	public int calcolaArea() {
		return (base*altezza);
	}

}
