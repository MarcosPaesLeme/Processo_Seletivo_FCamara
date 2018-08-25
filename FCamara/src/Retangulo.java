public class Retangulo {

	private double ladoA;
	private double ladoB;
	
	public Retangulo(double ladoA, double ladoB)
	{
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	public void mudaValores(double ladoA, double ladoB)
	{
		this.ladoA = ladoA;
		this.ladoB = ladoB;
	}
	
	public String retornaValoresLado()
	{
		return "Valor da lado A " +this.ladoA + " valor do lado B " + this.ladoB;
	}
	
	public double calculaArea(double ladoA, double ladoB)
	{
		return ladoA*ladoB;
	}
	
	public double calculaPerimetro(double ladoA, double ladoB)
	{
		return 2*(ladoA + ladoB);
	}
	
	public String quantidadePisosERodapes()
	{
		//Suponhamos que você pretende revestir com pisos de 60cm x 60 cm
		//Suponhamos que você pretende revestir com rodapes de 15cm x 15 cm
		
		return "Você ira precisar de " + (this.ladoA/60) + " pisos e " + (this.ladoB/15) + " de rodapes." ;
		
	}
}
