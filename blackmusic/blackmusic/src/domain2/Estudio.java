package domain2;

import java.util.List;

public class Estudio {

    private Integer CNAE;
    private String nome;
    private String localizacao;
    private List<Musica> musicas;

    public Estudio(String nome, String localizacao) {
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public Integer getCNAE() {
        return CNAE;
    }

    public void setCNAE(Integer cNAE) {
        CNAE = cNAE;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "Estudio [CNAE=" + CNAE + ", nome=" + nome + ", localizacao=" + localizacao + "]";
    }

    

    

}
