package entities;

public abstract class Conta {
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;

	protected int numero;

	protected double saldo;
	
	protected Cliente cliente;


	public Conta(Cliente cliente) {
		
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0.00;
		this.cliente = cliente;
		
	}

	public void sacar(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

	public void transferir(double valor, Conta conta) {
		if (this.saldo >= valor) {
			this.saldo-=valor;
			conta.setSaldo(valor);
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	protected void imprimirextrato() {
		System.out.println("Angencia: "+ this.agencia);
		System.out.println("numero Conta: "+ this.numero);
		System.out.println("Saldo: "+ this.saldo);


	}
}
