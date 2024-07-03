package entities;

public class ContaPoupança extends Conta {

	public ContaPoupança(Cliente cliente) {
		super(cliente);
	}
	
	public void extratoPp() {
		System.out.println("==Extrato Conta Poupança==");
		imprimirextrato();
	}
}
 