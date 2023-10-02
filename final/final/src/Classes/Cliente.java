package Classes;

import java.util.ArrayList;

public class Cliente extends PessoaFisica {
	private int idCliente;
	private ArrayList<Contrato> contrato = new ArrayList<>();



	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public ArrayList<Contrato> getContratos() {
		return contrato;
	}

	public void setContrato(ArrayList<Contrato> novoArray) {
		contrato = novoArray;
	}

	public Cliente(String telefone, String email, String nome, String cpf, String dtaNascimento){
		super(telefone, email, nome, cpf, dtaNascimento);
		this.idCliente = getIDcounter();
		setIDcounter(getIDcounter()+1);
	}

	public Cliente(String telefone, String email, String nome, String cpf, String dtaNascimento, int idCliente, int idPessoa){
		super(telefone, email, nome, cpf, dtaNascimento, idPessoa);
		this.idCliente = idCliente;
	}

	@Override
	public String toString() {
		return super.getNome();
	}

	public String salvarCliente(){
		return getNome() + "," + getCpf() + "," + getTelefone() + "," + getEmail() + "," + getDtaNascimento()
				+ "," + getIdPessoa() + "," + getIdCliente() + "\n";
	}
}
