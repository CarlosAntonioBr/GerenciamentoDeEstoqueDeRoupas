package GerenciamentoDoEstoque;

	public class Roupa {

	    public static void main(String[] args) {
	        Main estoque = new Main();
	        estoque.informarEstoque(); 
	        estoque.adicionarAoEstoque(); 
	        estoque.removerDoEstoque();
	        estoque.mostrarValorTotal();
	        estoque.editarTiposDeRoupas();
	        estoque.mostrarMarcas();
	        estoque.mostrarTamanhos();
	    }
}