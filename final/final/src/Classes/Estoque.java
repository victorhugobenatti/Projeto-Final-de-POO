package Classes;

public class Estoque{

	private int idEstoque;
	private int quantidade;
	private Produto produto;
	private static int IDcounter = 0;

	public int getIdEstoque() {
		return idEstoque;
	}

	public void setIdEstoque(int idEstoque) {
		this.idEstoque = idEstoque;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public void setQuantidade(int quantidade) {
		if (quantidade > 999999999) {
			quantidade = 999999999;
		}
		this.quantidade = quantidade;
	}

	public static int getIDcounter() {
		return IDcounter;
	}

	public static void setIDcounter(int IDcounter) {
		Estoque.IDcounter = IDcounter;
	}

	public Estoque(int quantidade) {
		this.quantidade = quantidade;
		this.idEstoque = getIDcounter();
		setIDcounter(getIDcounter()+1);
	}

	public Estoque(int quantidade, int idEstoque) {
		this.quantidade = quantidade;
		this.idEstoque = idEstoque;
	}

	@Override
	public String toString() {
		return produto.getNome();
	}

	public String salvarEstoque(){
		return getQuantidade() + "," + getIdEstoque() + "," + getProduto().getIdProduto() +
				"," + getProduto().getNome() + "," + getProduto().getObs() + "\n";
	}
}
