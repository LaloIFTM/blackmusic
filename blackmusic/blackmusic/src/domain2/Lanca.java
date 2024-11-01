import java.util.Date;

public class Lanca {

    private Integer codLanca;
    private Date dataLancamento;
    private Musica musica;
    private Plataforma plataforma;

    public Lanca(Date dataLancamento, Musica musica, Plataforma plataforma) {
        this.dataLancamento = dataLancamento;
        this.musica = musica;
        this.plataforma = plataforma;
    }

    public Integer getCodLanca() {
        return codLanca;
    }

    public void setCodLanca(Integer codLanca) {
        this.codLanca = codLanca;
    }

    public Date getDataLancamento() {
        return dataLancamento;
    }

    public void setDataLancamento(Date dataLancamento) {
        this.dataLancamento = dataLancamento;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Plataforma getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataforma plataforma) {
        this.plataforma = plataforma;
    }

    @Override
    public String toString() {
        return "Lanca [codLanca=" + codLanca + ", dataLancamento=" + dataLancamento + ", musica=" + musica
                + ", plataforma=" + plataforma + "]";
    }

    
    


}
