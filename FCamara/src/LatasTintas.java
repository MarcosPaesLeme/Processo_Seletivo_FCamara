import javax.swing.JOptionPane;

public class LatasTintas {
	
	public static void main(String[] args) {
		double metrosQuadrados = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho em metros quadrados da área a ser pintada:"));
		quantidadeDeLatasdeTintas(metrosQuadrados);
	}
	
	public static void quantidadeDeLatasdeTintas(double metrosQuadrados)
	{
		double quantidadeDeTinta = 0.0;
		double precoTotal = 0.0;
		
		quantidadeDeTinta = Math.ceil(metrosQuadrados/54);
		
		precoTotal = quantidadeDeTinta * 80.00;
		
		System.out.println("Você irá precisar de " + quantidadeDeTinta + " dando um total de R$" +  precoTotal);
		
	}
}
