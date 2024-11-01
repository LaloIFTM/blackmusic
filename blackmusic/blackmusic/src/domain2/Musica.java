public class Musica {

    private Integer codMusica;
    private String descricao;
    private String duracao;
    private String link;
    private String titulo;
    private Musica musica;
    private Genero genero;

    public Musica(String descricao, String duracao, String link, String titulo, Musica musica, Genero genero) {
        this.descricao = descricao;
        this.duracao = duracao;
        this.link = link;
        this.titulo = titulo;
        this.musica = musica;
        this.genero = genero;
    }

    public Integer getCodMusica() {
        return codMusica;
    }

    public void setCodMusica(Integer codMusica) {
        this.codMusica = codMusica;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Musica getMusica() {
        return musica;
    }

    public void setMusica(Musica musica) {
        this.musica = musica;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "Musica [codMusica=" + codMusica + ", descricao=" + descricao + ", duracao=" + duracao + ", link=" + link
                + ", titulo=" + titulo + ", musica=" + musica + ", genero=" + genero + "]";
    }

    
    

}
