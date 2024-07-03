package App;

import entities.Banco;
import entities.Cliente;
import entities.ContaCorrente;
import entities.ContaPoupança;

public class BancoSimulator {

	public static void main(String[] args) {
		
		Banco bank = new Banco("DioPay");
		System.out.println("===Banco "+ bank.getNome()+" está aberto.===");
		
		Cliente carlos = new Cliente("Carlos","12345678911");
		
		ContaCorrente cc = new ContaCorrente(carlos);
		ContaPoupança cp = new ContaPoupança(carlos);
		
		bank.cadastrarConta(cc);
		
		bank.cadastrarConta(cp);
		
		cc.depositar(1000.00);
		cc.extratoCc();
		
		cc.sacar(500.00);
		cc.extratoCc();
		
		cc.transferir(500.00, cp);
		cc.extratoCc();
		cp.extratoPp();

		
	}
}
