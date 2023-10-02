package Classes;

import java.util.ArrayList;

public class Maquina {

	private int idMaquina;
	private String obs;
	private String dtaCompra;
	private ArrayList<Manutencao> manutencao = new ArrayList<>();
	private static int IDcounter = 0;


	public int getIdMaquina() {
		return idMaquina;
	}

	public void setIdMaquina(int idMaquina) {
		this.idMaquina = idMaquina;
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

	public String getDtaCompra() {
		return dtaCompra;
	}

	public void setDtaCompra(String dtaCompra) {
		if (dtaCompra.length() > 10) {
			dtaCompra = dtaCompra.substring(0, 10);
		}
		this.dtaCompra = dtaCompra;
	}

	public static int getIDcounter() {
		return IDcounter;
	}

	public static void setIDcounter(int IDcounter) {
		Maquina.IDcounter = IDcounter;
	}

	public ArrayList<Manutencao> getManutencao() {
		return manutencao;
	}

	public void setManutencao(ArrayList<Manutencao> manutencao) {
		this.manutencao = manutencao;
	}

	public Maquina(String obs, String dtaCompra) {
		this.obs = obs;
		this.dtaCompra = dtaCompra;
		this.idMaquina = getIDcounter();
		setIDcounter(getIDcounter()+1);
	}

	public Maquina(String obs, String dtaCompra, int idMaquina) {
		this.obs = obs;
		this.dtaCompra = dtaCompra;
		this.idMaquina = idMaquina;
	}

	@Override
	public String toString() {
		return obs;
	}

	public String salvarMaquina(){
		return getObs() + "," + getDtaCompra() + "," + getIdMaquina() + "\n";
	}

}
