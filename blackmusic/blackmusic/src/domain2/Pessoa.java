public class Pessoa {

    protected Integer codPessoa;
    protected String telefone;
    protected String senha;
    
    public Pessoa(String telefone, String senha) {
        this.telefone = telefone;
        this.senha = senha;
    }

    public Integer getCodPessoa() {
        return codPessoa;
    }

    public void setCodPessoa(Integer codPessoa) {
        this.codPessoa = codPessoa;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public String toString() {
        return "Pessoa [codPessoa=" + codPessoa + ", telefone=" + telefone + ", senha=" + senha + "]";
    }

    




}
