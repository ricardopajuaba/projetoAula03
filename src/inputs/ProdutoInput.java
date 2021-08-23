package inputs;

import javax.swing.JOptionPane;

public class ProdutoInput {

	// método para ler o id do produto
	public static Integer lerIdProduto() throws Exception {

		Integer idProduto = Integer.parseInt(JOptionPane.showInputDialog("Entre com o id do produto:"));

		if (idProduto > 0) {
			return idProduto;
		} else {
			throw new Exception("O id do produto deve ser maior do que zero.");
		}
	}

	// método para ler o nome do produto
	public static String lerNome() throws Exception {

		String nome = JOptionPane.showInputDialog("Entre com o nome do produto:");

		if (nome.trim().length() >= 6 && nome.trim().length() <= 150) {
			return nome;
		} else {
			throw new Exception("O nome do produto deve ter de 6 a 150 caracteres.");
		}
	}

	// método para ler o preço do produto
	public static Double lerPreco() throws Exception {

		Double preco = Double.parseDouble(JOptionPane.showInputDialog("Entre com o preço do produto:"));

		if (preco > 0) {
			return preco;
		} else {
			throw new Exception("O preço do produto deve ser maior do que zero.");
		}
	}

	// método para ler a quantidade do produto
	public static Integer lerQuantidade() throws Exception {

		Integer quantidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com a quantidade do produto:"));

		if (quantidade > 0) {
			return quantidade;
		} else {
			throw new Exception("A quantidade do produto deve ser maior do que zero.");
		}
	}

}
