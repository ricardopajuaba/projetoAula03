package inputs;

import javax.swing.JOptionPane;

public class FornecedorInput {

	// método para que o usuario entre com o id do fornecedor
	public static Integer lerIdFornecedor() throws Exception {

		Integer idFornecedor = Integer.parseInt(JOptionPane.showInputDialog("Entre com o Id do fornecedor:"));

		// Regra: o id do fornecedor deve ser um valor maior do que zero
		if (idFornecedor > 0) {
			return idFornecedor; // retornando o valor da variavel..
		} else {
			// gerar uma exceção (erro, ou seja, executar o bloco catch)
			throw new Exception("O id do fornecedor deve ser maior do que zero.");
		}
	}

	// método para que o usuario entre com o nome do fornecedor
	public static String lerNome() throws Exception {

		String nome = JOptionPane.showInputDialog("Entre com o nome do fornecedor:");

		if (nome.trim().length() >= 6 && nome.trim().length() <= 150) {
			return nome; // retornando o valor da variável..
		} else {
			throw new Exception("Nome do fornecedor deve ter entre 6 e 150 caracteres.");
		}
	}

	// método para que o usuario entre com o cnpj do fornecedor
	public static String lerCnpj() throws Exception {

		String cnpj = JOptionPane.showInputDialog("Entre com o cnpj do fornecedor:");

		if (cnpj.trim().length() >= 14 && cnpj.trim().length() <= 18) {
			return cnpj; // retornando o valor da variavel..
		} else {
			throw new Exception("CNPJ deve conter de 14 a 18 caracteres.");
		}
	}

}
