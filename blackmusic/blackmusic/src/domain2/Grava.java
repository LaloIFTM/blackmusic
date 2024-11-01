package domain2;

import java.util.Date;

public class Grava {

    private Integer codGrava;
    private Date dataGravacao;
    private Musica musica;
    private Estudio estudio;

    public Grava(Date dataGravacao, Musica musica, Estudio estudio) {
        this.dataGravacao = dataGravacao;
        this.musica = musica;
        this.estudio = estudio;
    }

    public Integer getCodGrava() {
        return codGrava;
    }

    public void setCodGrava(Integer codGrava) {
        this.codGrava = codGrava;
    }

    public Date getDataGravacao() {
        return dataGravacao;
    }

    public void setDataGravacao(Date dataGravacao) {
        this.dataGravacao = dataGravacao;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Estudio getEstudio() {
        return estudio;
    }

    public void setEstudio(Estudio estudio) {
        this.estudio = estudio;
    }

    @Override
    public String toString() {
        return "Grava [codGrava=" + codGrava + ", dataGravacao=" + dataGravacao + ", musica=" + musica + ", estudio="
                + estudio + "]";
    }

    

    

}
