package principal;

import java.util.ArrayList;
import java.util.List;

import entities.Fornecedor;
import entities.Produto;
import inputs.FornecedorInput;
import inputs.ProdutoInput;
import repositories.FornecedorRepository;

public class Program {

	public static void main(String[] args) {

		//Criando objeto para a classe Fornecedor..
		Fornecedor fornecedor = new Fornecedor();

		try {
			
			System.out.println("\nLENDO OS DADOS DO FORNECEDOR:\n");
			
			fornecedor.setIdFornecedor(FornecedorInput.lerIdFornecedor());
			fornecedor.setNome(FornecedorInput.lerNome());
			fornecedor.setCnpj(FornecedorInput.lerCnpj());
			
			//criando uma lista de produtos..
			List<Produto> listaDeProdutos = new ArrayList<Produto>();
			
			//pedir para que o usuario informe 2 produtos..
			System.out.println("\nLENDO OS DADOS DO PRIMEIRO PRODUTO:\n");
			
			Produto produto1 = new Produto();
			
			produto1.setIdProduto(ProdutoInput.lerIdProduto());
			produto1.setNome(ProdutoInput.lerNome());
			produto1.setPreco(ProdutoInput.lerPreco());
			produto1.setQuantidade(ProdutoInput.lerQuantidade());
			
			//adicionando o produto na lista
			listaDeProdutos.add(produto1);
			
			System.out.println("\nLENDO OS DADOS DO SEGUNDO PRODUTO:\n");
			
			Produto produto2 = new Produto();
			
			produto2.setIdProduto(ProdutoInput.lerIdProduto());
			produto2.setNome(ProdutoInput.lerNome());
			produto2.setPreco(ProdutoInput.lerPreco());
			produto2.setQuantidade(ProdutoInput.lerQuantidade());
			
			//adicionando o produto na lista
			listaDeProdutos.add(produto2);
			
			//adicionando a lista de produtos no fornecedor..
			fornecedor.setProdutos(listaDeProdutos);
			
			//gravar em arquivo..
			FornecedorRepository fornecedorRepository = new FornecedorRepository();
			fornecedorRepository.exportarDados(fornecedor);
			
			System.out.println("\nDADOS GRAVADOS COM SUCESSO!");
		}
		catch(Exception e) {
			System.out.println("\nErro: " + e.getMessage());
		}
	}
}