package Classes;

public class ContaReceber{

	private int idContaReceber;
	private double valor;
	private String obs;
	private static int IDcounter = 0;


	public int getIdContaReceber() {
		return idContaReceber;
	}

	public void setIdContaReceber(int idContaReceber) {
		this.idContaReceber = idContaReceber;
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
		this.obs = obs;
	}

	public static int getIDcounter() {
		return IDcounter;
	}

	public static void setIDcounter(int IDcounter) {
		ContaReceber.IDcounter = IDcounter;
	}

	public ContaReceber(double valor, String obs){
		this.valor = valor;
		this.obs = obs;
		this.idContaReceber = getIDcounter();
		setIDcounter(getIDcounter()+1);
	}

	public ContaReceber(double valor, String obs, int idContaReceber){
		this.valor = valor;
		this.obs = obs;
		this.idContaReceber = idContaReceber;
	}

	@Override
	public String toString() {
		return obs;
	}

	public String salvarContaReceber(){
		return getValor() + "," + getObs() + "," + getIdContaReceber() + "\n";
	}
}
