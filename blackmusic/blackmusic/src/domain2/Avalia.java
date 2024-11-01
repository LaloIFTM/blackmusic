package domain2;


import java.util.Date;

public class Avalia {

private String notaAvaliacao;
private Integer codAvalia;
private Date dataAvaliacao;
private Musica musica;
private Usuario usuario;

public Avalia(String notaAvaliacao, Date dataAvaliacao, Musica musica, Usuario usuario) {
    this.notaAvaliacao = notaAvaliacao;
    this.dataAvaliacao = dataAvaliacao;
    this.musica = musica;
    this.usuario = usuario;
}

public String getNotaAvaliacao() {
    return notaAvaliacao;
}

public void setNotaAvaliacao(String notaAvaliacao) {
    this.notaAvaliacao = notaAvaliacao;
}

public Integer getCodAvalia() {
    return codAvalia;
}

public void setCodAvalia(Integer codAvalia) {
    this.codAvalia = codAvalia;
}

public Date getDataAvaliacao() {
    return dataAvaliacao;
}

public void setDataAvaliacao(Date dataAvaliacao) {
    this.dataAvaliacao = dataAvaliacao;
}

public Musica getMusica() {
    return musica;
}

public void setMusica(Musica musica) {
    this.musica = musica;
}

public Usuario getUsuario() {
    return usuario;
}

public void setUsuario(Usuario usuario) {
    this.usuario = usuario;
}

@Override
public String toString() {
    return "Avalia [notaAvaliacao=" + notaAvaliacao + ", codAvalia=" + codAvalia + ", dataAvaliacao=" + dataAvaliacao
            + ", musica=" + musica + ", usuario=" + usuario + "]";
}



}
