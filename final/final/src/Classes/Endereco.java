package Classes;

public class Endereco{

	private int idEndereco;
	private String logradouro;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String cep;
	private static int IDcounter = 0;

	public int getIdEndereco() {
		return idEndereco;
	}

	public void setIdEndereco(int idEndereco) {
		this.idEndereco = idEndereco;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		if (logradouro.length() > 100) {
			logradouro = logradouro.substring(0, 100);
		}
		this.logradouro = logradouro;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		if (bairro.length() > 50) {
			bairro = bairro.substring(0, 50);
		}
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		if (cidade.length() > 50) {
			cidade = cidade.substring(0, 50);
		}
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		if (estado.length() > 50) {
			estado = estado.substring(0, 50);
		}
		this.estado = estado;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		if (cep.length() > 9) {
			cep = cep.substring(0, 9);
		}
		this.cep = cep;
	}

	public static int getIDcounter() {
		return IDcounter;
	}

	public static void setIDcounter(int IDcounter) {
		Endereco.IDcounter = IDcounter;
	}

	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.idEndereco = getIDcounter();
		setIDcounter(getIDcounter()+1);
	}

	public Endereco(String logradouro, int numero, String bairro, String cidade, String estado, String cep, int idEndereco) {
		this.logradouro = logradouro;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
		this.cep = cep;
		this.idEndereco = idEndereco;
	}

	@Override
	public String toString() {
		return logradouro;
	}

	public String salvarEndereco(){
		return getLogradouro() + ";" + getNumero() + ";" + getBairro() + ";" + getCidade() + ";" + getEstado()
				+ ";" + getCep() + ";" + getIdEndereco() + "\n";
	}
}
