package jana60.poligono;

public class Quadrato extends Parallelogramma {
	
	//attributi
	private int lato;

	//costruttore
	public Quadrato(int base) {
		super(base, base);
		 this.lato = base;
	}
	
	@Override
	public int calcolaPerimetro() {
		return lato*4;
	}
	
	@Override
	public int calcolaArea() {
		return lato*lato;
	}
	

}
