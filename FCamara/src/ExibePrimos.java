import javax.swing.JOptionPane;

public class ExibePrimos {
	
	public static void main(String[] args) {
		int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor inicial:"));
		int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor final:"));
		exibePrimos(inicio,fim);
	}
	
	public static void exibePrimos(int inicio, int fim)
	{
		
		System.out.println("Entrada: " + inicio + " " + fim);
		int i = 0;
		String texto = "2";
		while (inicio <= fim)
		{
			if(inicio % 2 == 1) 
			{
				texto = texto + " " + inicio;
			}
			
			inicio ++;
			
		}
		
		 System.out.println(texto);
	}
}
