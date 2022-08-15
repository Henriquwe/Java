package pbl.pbl8;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ExcecaoContaInvalida {
		try (Scanner scan = new Scanner(System.in)) {
			int numero;
			String senha;
			double valor;

			Banco Banco = new Banco("Bari");
			Banco.criarConta(1, "123", 200.00);
			Banco.criarConta(2, "password", 500.00);
			Banco.criarConta(3, "ABC", 550.00);
			Banco.criarConta(4, "A1B2C3", 700.00);
			Banco.criarConta(5, "Password!321", 1200.00);
			for (int i = 0; i < 10; i++) {
				try {
					System.out.println("BEM VINDO AO APLICATIVO DO BANCO BARI!");
				System.out.println("Digite o número registrado da conta: ");
				numero = scan.nextInt();
				System.out.println("Digite a senha: ");
				senha = scan.next();
				System.out.println("Qual quantia vai retirar? ");
				valor = scan.nextDouble();
				Banco.sacar(numero, senha, valor);
				//catch
				}
				catch (ExcecaoSaldoInsuficiente | ExcecaoHorarioInvalido | ExcecaoSenhaInvalida |
					   ExcecaoContaInvalida ex) {
					ex.printStackTrace();
				} catch (IndexOutOfBoundsException iob) {
					throw new ExcecaoContaInvalida(null);
				}	
			}
		}
	}
}
