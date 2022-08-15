package pbl.pbl8;

class ContaCorrente extends Banco {
	public String senhaCriada;
	private double saldo;

	public ContaCorrente(String nome, int numero, String senhaCriada, double saldo) {
		super(nome);
		this.senhaCriada = senhaCriada;
		this.saldo = saldo;		
	}

	public void retirar(double valor, String senhaDigitada) throws ExcecaoSaldoInsuficiente, ExcecaoSenhaInvalida {	
		if (saldo < valor) {throw new ExcecaoSaldoInsuficiente("Saldo Insuficiente.");}
		else {System.out.println("Valor Válido.");}
		saldo = (saldo - valor);	
	}
}