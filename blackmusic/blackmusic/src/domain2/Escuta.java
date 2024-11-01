package domain2;

import java.util.Date;

public class Escuta {

private Integer codEscuta;
private String biografia;
private Date dataOuviu;
private Musica musica;
private Usuario usuario;

public Escuta(String biografia, Date dataOuviu, Musica musica, Usuario usuario) {
    this.biografia = biografia;
    this.dataOuviu = dataOuviu;
    this.musica = musica;
    this.usuario = usuario;
}

public Integer getCodEscuta() {
    return codEscuta;
}

public void setCodEscuta(Integer codEscuta) {
    this.codEscuta = codEscuta;
}

public String getBiografia() {
    return biografia;
}

public void setBiografia(String biografia) {
    this.biografia = biografia;
}

public Date getDataOuviu() {
    return dataOuviu;
}

public void setDataOuviu(Date dataOuviu) {
    this.dataOuviu = dataOuviu;
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
    return "Escuta [codEscuta=" + codEscuta + ", biografia=" + biografia + ", dataOuviu=" + dataOuviu + ", musica="
            + musica + ", usuario=" + usuario + "]";
}


}
