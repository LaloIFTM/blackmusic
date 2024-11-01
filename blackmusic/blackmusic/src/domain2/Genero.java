package domain2;

import java.util.List;

public class Genero {


    private Integer codGenero;
    private String descricao;
    private List<Musica> musicas;

    public Genero(String descricao) {
        this.descricao = descricao;
    }

    public Integer getCodGenero() {
        return codGenero;
    }

    public void setCodGenero(Integer codGenero) {
        this.codGenero = codGenero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "Genero [codGenero=" + codGenero + ", descricao=" + descricao + "]";
    }

    
    
}
