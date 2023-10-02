package Classes;

import java.util.ArrayList;

public class ContaPagar {

	private int idContaPagar;
	private double valor;
	private String obs;
	private ArrayList<Produto> produto = new ArrayList<>();
	private static int IDcounter = 0;

	public int getIdContaPagar() {
		return idContaPagar;
	}

	public void setIdContaPagar(int idContaPagar) {
		this.idContaPagar = idContaPagar;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		if (valor > 999999999) {
			valor = 999999999;
		}
		this.valor = valor;
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

	public ArrayList<Produto> getProduto() {
		return produto;
	}

	public void setProduto(ArrayList<Produto> produto) {
		this.produto = produto;
	}

	public static int getIDcounter() {
		return IDcounter;
	}

	public static void setIDcounter(int IDcounter) {
		ContaPagar.IDcounter = IDcounter;
	}

	public ContaPagar(double valor, String obs){
		this.valor = valor;
		this.obs = obs;
		this.idContaPagar = getIDcounter();
		setIDcounter(getIDcounter()+1);
	}

	public ContaPagar(double valor, String obs, int idContaPagar){
		this.valor = valor;
		this.obs = obs;
		this.idContaPagar = idContaPagar;
	}

	@Override
	public String toString() {
		return obs;
	}

	public String salvarContaPagar(){
		return getValor() + "," + getObs() + "," + getIdContaPagar() + "\n";
	}

}
