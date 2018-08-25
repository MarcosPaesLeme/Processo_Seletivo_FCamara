import javax.swing.JOptionPane;

public class RetanguloMain {

	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null, "Informe as medidas do local.");
		double ladoA = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado A:"));
		double ladoB = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado B:"));
		
		Retangulo retangulo = new Retangulo(ladoA, ladoB);
		
		JOptionPane.showMessageDialog(null, retangulo.quantidadePisosERodapes());
	}

}
