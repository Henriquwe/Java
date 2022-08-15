package pbl.pbl08;

import java.util.ArrayList;

public class Banco {
	private final String nome;
	private final ArrayList<ContaCorrente> Contas_Corrente;
	private int horas = 18;
	ContaCorrente contaCorrente;

	public Banco(String nome) {
		this.nome = nome;
		Contas_Corrente = new ArrayList<ContaCorrente>();
	}

	public void criarConta(int numero, String senhaCriada, double saldo) {
		contaCorrente = new ContaCorrente(nome, numero, senhaCriada, saldo);
		Contas_Corrente.add(contaCorrente);
	}

	public void sacar(int numero, String senhaDigitada, double valor) throws ExcecaoSaldoInsuficiente, ExcecaoHorarioInvalido, 
	ExcecaoContaInvalida, ExcecaoSenhaInvalida, IndexOutOfBoundsException {
		horas ++;
		if (Contas_Corrente.size() < numero) throw new ExcecaoContaInvalida("Conta Inexistente.");
		System.out.println("Conta Existente...");
		if (senhaDigitada.equals(Contas_Corrente.get(numero-1).senhaCriada)) {
			System.out.println("Senha Válida...");
			if (8 <= horas && horas <= 22) {
				System.out.println("Banco Aberto...");
				Contas_Corrente.get(numero-1).retirar(valor, senhaDigitada);
			}
			else throw new ExcecaoHorarioInvalido("Banco Fechado.");
		}
		else throw new ExcecaoSenhaInvalida("Senha Inválida.");	
	}
	
}
