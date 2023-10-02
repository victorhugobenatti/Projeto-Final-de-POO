package Classes;

public class Manutencao {

	private int idManutencao;
	private String dtaManutencao;
	private String obs;
	private static int IDcounter = 0;


	public int getIdManutencao() {
		return idManutencao;
	}

	public void setIdManutencao(int idManutencao) {
		this.idManutencao = idManutencao;
	}

	public String getDtaManutencao() {
		return dtaManutencao;
	}

	public void setDtaManutencao(String dtaManutencao) {
		if (dtaManutencao.length() > 10) {
			dtaManutencao = dtaManutencao.substring(0, 10);
		}
		this.dtaManutencao = dtaManutencao;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		if (obs.length() > 10) {
			obs = obs.substring(0, 10);
		}
		this.obs = obs;
	}

	public static int getIDcounter() {
		return IDcounter;
	}

	public static void setIDcounter(int IDcounter) {
		Manutencao.IDcounter = IDcounter;
	}

	public Manutencao(String dtaManutencao, String obs) {
		this.dtaManutencao = dtaManutencao;
		this.obs = obs;
		this.idManutencao = getIDcounter();
		setIDcounter(getIDcounter()+1);
	}

	public Manutencao(String dtaManutencao, String obs, int idManutencao) {
		this.dtaManutencao = dtaManutencao;
		this.obs = obs;
		this.idManutencao = idManutencao;
	}

	@Override
	public String toString() {
		return String.valueOf(idManutencao);
	}

	public String salvarManutencao(){
		return getDtaManutencao() + "," + getObs() + "," + getIdManutencao() + "\n";
	}
}
