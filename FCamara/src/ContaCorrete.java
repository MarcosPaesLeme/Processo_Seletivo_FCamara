public class ContaCorrete {
	
	private String numero_da_conta;
	private String nome_do_correntista;
	private double saldo;
	
	public ContaCorrete(String numero_da_conta, String nome_do_correntista)
	{
		this.numero_da_conta = numero_da_conta;
		this.nome_do_correntista = nome_do_correntista;
		this.saldo = 0.0;
	}
	
	public void alterarNome(String nome, String conta)
	{
		if(this.numero_da_conta.equals(conta)) this.nome_do_correntista = nome;
	}
	
	public void deposito(double valor, String conta, String nome)
	{
		if(this.numero_da_conta.equals(conta) && this.nome_do_correntista.equals(nome)) this.saldo = saldo + valor;
	}
	
	public String saque(double valor, String conta, String nome){
		if(this.numero_da_conta.equals(conta) && this.nome_do_correntista.equals(nome))
		{
			if(this.saldo - valor >= 0.0) return "Saque de " + valor;
			else						  return "Saldo insuficiente para saque";
		}
		return "Dados não encontrados, por favor dirija-se ate o caixa";
	}
}
