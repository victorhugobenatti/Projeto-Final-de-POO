package Classes;

public class Produto {

	private int idProduto;
	private String nome;
	private String obs;
	private static int IDcounter = 0;


	public int getIdProduto() {
		return idProduto;
	}

	public void setIdProduto(int idProduto) {
		this.idProduto = idProduto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome.length() > 50) {
			nome = nome.substring(0, 50);
		}
		this.nome = nome;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		if (obs.length() > 50) {
			obs = obs.substring(0, 50);
		}
		this.obs = obs;
	}

	public static int getIDcounter() {
		return IDcounter;
	}

	public static void setIDcounter(int IDcounter) {
		Produto.IDcounter = IDcounter;
	}

	public Produto(String nome, String obs) {
		this.nome = nome;
		this.obs = obs;
		this.idProduto = getIDcounter();
		setIDcounter(getIDcounter()+1);
	}

	public Produto(String nome, String obs, int idProduto) {
		this.nome = nome;
		this.obs = obs;
		this.idProduto = idProduto;
	}

	@Override
	public String toString() {
		return nome;
	}

	public String salvarProduto(){
		return getNome() + "," + getObs() + "," + getIdProduto() + "\n";
	}
}
