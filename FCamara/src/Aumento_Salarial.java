
public class Aumento_Salarial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.printf("Valor no ano atual é de = %.2f %n", reajusteSalarial(1000,1.5,2005) );
		//System.out.println("Valor "+reajusteSalarial(1000,1.5,2005));
	}
	public static double reajusteSalarial(double salario,double reajuste, int ano)
	{
		if(ano == 2018) return salario;
		else			return reajusteSalarial((salario+(salario*reajuste/100)),2*reajuste,ano+1);
	}

}
