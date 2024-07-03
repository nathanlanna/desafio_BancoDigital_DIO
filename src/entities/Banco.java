package entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;

	private List<Conta> contasBancarias ;

	public Banco(String nome) {
		this.nome = nome;
		this.contasBancarias = new ArrayList<Conta>();
	}


	public String getNome() {
		return nome;
	}

	public void cadastrarConta(Conta conta) {
		this.contasBancarias.add(conta);
	}

	public void ListarContas() {
		this.contasBancarias.forEach((conta) -> {
				System.out.println("Agencia: " + conta.getAgencia() + "; Conta: "
						+ conta.getNumero());
		});
	}
}
