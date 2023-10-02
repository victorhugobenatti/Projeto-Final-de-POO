package Classes;

abstract class PessoaFisica extends Pessoa{

    private String nome;

    private String cpf;

    private String dtaNascimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome.length() > 50) {
            nome = nome.substring(0, 50);
        }
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDtaNascimento() {
        return dtaNascimento;
    }

    public void setDtaNascimento(String dtaNascimento) {
        this.dtaNascimento = dtaNascimento;
    }

    PessoaFisica(String telefone, String email, String nome, String cpf, String dtaNascimento) {
        super(telefone, email);
        this.nome = nome;
        this.cpf = cpf;
        this.dtaNascimento = dtaNascimento;
    }

    PessoaFisica(String telefone, String email, String nome, String cpf, String dtaNascimento, int idPessoa) {
        super(telefone, email, idPessoa);
        this.nome = nome;
        this.cpf = cpf;
        this.dtaNascimento = dtaNascimento;
    }
}
