package Classes;

abstract class Pessoa implements MostraEndereco{

	private int idPessoa;
	private String telefone;
	private String email;
	Endereco endereco;
	private static int IDcounter = 0;


	public int getIdPessoa() {
		return idPessoa;
	}

	public void setIdPessoa(int idPessoa) {
		this.idPessoa = idPessoa;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		if (telefone.length() > 11) {
			telefone = telefone.substring(0, 11);
		}
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		if (email.length() > 50) {
			email = email.substring(0, 50);
		}
		this.email = email;
	}

	public static int getIDcounter() {
		return IDcounter;
	}

	public static void setIDcounter(int IDcounter) {
		Pessoa.IDcounter = IDcounter;
	}

	public String Imprime(){
		return endereco.getLogradouro() + ", número " + endereco.getNumero() + ", " + endereco.getBairro() + ", " + endereco.getCidade() + "-" + endereco.getEstado();
	}

	Pessoa(String telefone, String email){
		this.telefone = telefone;
		this.email = email;
		this.idPessoa = getIDcounter();
		setIDcounter(getIDcounter()+1);
	}

	Pessoa(String telefone, String email, int idPessoa){
		this.telefone = telefone;
		this.email = email;
		this.idPessoa = idPessoa;
	}
}
