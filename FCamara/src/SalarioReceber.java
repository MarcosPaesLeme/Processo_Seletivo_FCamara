import javax.swing.JOptionPane;

public class SalarioReceber {

	public static void main(String[] args) {
		
		double horasTrabalhadas = Double.parseDouble(JOptionPane.showInputDialog("Digite as horas trabalhadas:"));
		double salarioMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salario minimo:"));
		
		JOptionPane.showMessageDialog(null,calculaSalario(horasTrabalhadas,salarioMinimo));
	}
	
	public static double calculaSalario (double horas, double salarioMinimo)
	{
		
		double salarioBruto = 0.0;
		
		salarioBruto = (horas * (0.10 * salarioMinimo)) - (salarioBruto * 0.03);

		return salarioBruto;
		
	}
}
