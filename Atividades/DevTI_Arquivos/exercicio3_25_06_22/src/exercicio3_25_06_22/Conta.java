package exercicio3_25_06_22;

public class Conta {
	private String numeroConta, tipoConta, titularConta;
	private double saldo;

	public Conta(String numeroConta, String tipoConta, String titularConta, double saldo) {
		super();
		this.numeroConta = numeroConta;
		this.tipoConta = tipoConta;
		this.titularConta = titularConta;
		this.saldo = saldo;
	}

	public void depositar(double deposito) {
		this.saldo = this.saldo + deposito;
		System.out.println("Valor em conta �: " + saldo);
	}

	public void sacar(double saque) {
		if (saque <= saldo) {
			this.saldo = this.saldo - saque;
			System.out.println("Valor em conta �: " + saldo);
		} else {
			System.out.println("Saldo insuficiente para saque!");
		}
	}

	public void verificaSaldo() {
		System.out.println("O n�mero da conta �: " + numeroConta);
		System.out.println("O tipo da conta �: " + tipoConta);
		System.out.println("O titular da conta �: " + titularConta);
		System.out.println("O saldo da sua conta �: " + saldo);
	}

}
