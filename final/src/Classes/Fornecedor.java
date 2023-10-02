package Classes;

import java.util.ArrayList;

public class Fornecedor extends PessoaJuridica {

	private int idFornecedor;
	private ArrayList<ContaPagar> contaPagar = new ArrayList<>();


	public int getIdFornecedor() {
		return idFornecedor;
	}

	public void setIdFornecedor(int idFornecedor) {
		this.idFornecedor = idFornecedor;
	}

	public ArrayList<ContaPagar> getContaPagar() {
		return contaPagar;
	}

	public void setContaPagar(ArrayList<ContaPagar> contaPagar) {
		this.contaPagar = contaPagar;
	}

	public Fornecedor(String telefone, String email, String nomeFantasia, String cnpj) {
		super(telefone, email, nomeFantasia, cnpj);
		this.idFornecedor = getIDcounter();
		Pessoa.setIDcounter(getIDcounter()+1);
	}

	public Fornecedor(String telefone, String email, String nomeFantasia, String cnpj, int idFornecedor, int idPessoa) {
		super(telefone, email, nomeFantasia, cnpj, idPessoa);
		this.idFornecedor = idFornecedor;
	}

	@Override
	public String toString() {
		return getNomeFantasia();
	}

	public String salvarFornecedor(){
		return getTelefone() + "," + getEmail() + "," + getNomeFantasia() + "," + getCnpj() + "," + getIdFornecedor()
				+ "," + getIdPessoa() + "\n";
	}
}
