import java.util.Date;

public class Usuario {

    private Integer codUsuario;
    private String login;
    private String sexo;
    private Date dataNascimento;
    private String nome;

    public Usuario(String login, String sexo, Date dataNascimento, String nome) {
        this.login = login;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
        this.nome = nome;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Usuario [codUsuario=" + codUsuario + ", login=" + login + ", sexo=" + sexo + ", dataNascimento="
                + dataNascimento + ", nome=" + nome + "]";
    }

    
    

}
