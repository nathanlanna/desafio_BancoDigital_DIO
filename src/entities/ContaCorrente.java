package entities;

public class ContaCorrente extends Conta{

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void extratoCc() {
		System.out.println("==Extrato Conta Corrente==");
		imprimirextrato();
	}
}
