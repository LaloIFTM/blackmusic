public class Recomenda {
    
    private Integer codRecomenda;
    private Musica musica;
    private Usuario usuario;

    public Recomenda(Musica musica, Usuario usuario) {
        this.musica = musica;
        this.usuario = usuario;
    }

    public Integer getCodRecomenda() {
        return codRecomenda;
    }

    public void setCodRecomenda(Integer codRecomenda) {
        this.codRecomenda = codRecomenda;
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
        return "Recomenda [codRecomenda=" + codRecomenda + ", musica=" + musica + ", usuario=" + usuario + "]";
    }

    

    

}
