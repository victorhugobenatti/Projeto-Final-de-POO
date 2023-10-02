package Classes;

import java.util.ArrayList;

public class Contrato{
	private int idContrato;
	private int prazo;
	private ArrayList<ContaReceber> contaReceber = new ArrayList<>();
	private static int IDcounter = 0;

	public int getIdContrato() {
		return idContrato;
	}

	public void setIdContrato(int idContrato) {
		this.idContrato = idContrato;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		prazo = prazo;
	}

	public ArrayList<ContaReceber> getContaReceber() {
		return contaReceber;
	}

	public void setContaReceber(ArrayList<ContaReceber> contaReceber) {
		this.contaReceber = contaReceber;
	}

	public static int getIDcounter() {
		return IDcounter;
	}

	public static void setIDcounter(int IDcounter) {
		Contrato.IDcounter = IDcounter;
	}

	public Contrato(int prazo){
		this.prazo = prazo;
		this.idContrato = getIDcounter();
		setIDcounter(getIDcounter()+1);
	}

	public Contrato(int prazo, int idContrato){
		this.prazo = prazo;
		this.idContrato = idContrato;
	}

	@Override
	public String toString() {
		return String.valueOf(idContrato);
	}

	public String salvarContrato(){
		return getPrazo() + "," + getIdContrato() + "\n";
	}
}
