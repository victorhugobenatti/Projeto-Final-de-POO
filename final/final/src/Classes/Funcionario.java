package Classes;

public class Funcionario extends PessoaFisica {

	private int idFuncionarioChefe;


	public int getIdFuncionarioChefe() {
		return idFuncionarioChefe;
	}

	public void setIdFuncionarioChefe(int idFuncionarioChefe) {
		this.idFuncionarioChefe = idFuncionarioChefe;
	}


	public Funcionario(String telefone, String email, String nome, String cpf, String dtaNascimento, int idFuncionarioChefe) {
		super(telefone, email, nome, cpf, dtaNascimento);
		this.idFuncionarioChefe = idFuncionarioChefe;
		setIDcounter(getIDcounter() + 1);
	}

	public Funcionario(String telefone, String email, String nome, String cpf, String dtaNascimento, int idFuncionarioChefe, int idPessoa) {
		super(telefone, email, nome, cpf, dtaNascimento, idPessoa);
		this.idFuncionarioChefe = idFuncionarioChefe;
	}

	@Override
	public String toString() {
		return getNome();
	}

	public String salvarFuncionario() {
		return getTelefone() + "," + getEmail() + "," + getNome() + "," + getCpf() + "," + getDtaNascimento()
				+ "," + getIdFuncionarioChefe() + "," + getIdPessoa() + "\n";
	}
}
