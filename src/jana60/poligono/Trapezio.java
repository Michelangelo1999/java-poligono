package jana60.poligono;

public class Trapezio implements Poligono {
	
	private int baseMaggiore;
	private int altezza;
	private int baseMinore;
	private int latoUno;
	private int latoDue;
	
	public Trapezio(int baseMaggiore, int altezza, int baseMinore, int latoUno, int latoDue) {
		super();
		this.baseMaggiore = baseMaggiore;
		this.altezza = altezza;
		this.baseMinore = baseMinore;
		this.latoUno = latoUno;
		this.latoDue = latoDue;
	}

	@Override
	public int calcolaPerimetro() {
		return baseMaggiore+baseMinore+latoUno+latoDue;
	}

	@Override
	public int calcolaArea() {
        return (baseMaggiore+baseMinore)*altezza/2;
	}
	
	public int calcolaAltezza() {
		return (calcolaArea()*2)/(baseMaggiore+baseMinore);
	}
	
	
	
	

}
