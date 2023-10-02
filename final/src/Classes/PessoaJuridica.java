package Classes;

abstract class PessoaJuridica extends Pessoa{

    private String nomeFantasia;
    private String cnpj;


    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        if (nomeFantasia.length() > 50) {
            nomeFantasia = nomeFantasia.substring(0, 50);
        }
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    PessoaJuridica(String telefone, String email, String nomeFantasia, String cnpj) {
        super(telefone, email);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    PessoaJuridica(String telefone, String email, String nomeFantasia, String cnpj, int idPessoa) {
        super(telefone, email, idPessoa);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }
}
