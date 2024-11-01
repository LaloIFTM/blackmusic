import java.util.List;

public class Plataforma {


    private Integer codPlataforma;
    private String nome;
    private String descricao;
    private String site;
    private List<Musica> musicas;

    public Plataforma(String nome, String descricao, String site) {
        this.nome = nome;
        this.descricao = descricao;
        this.site = site;
    }

    public Integer getCodPlataforma() {
        return codPlataforma;
    }

    public void setCodPlataforma(Integer codPlataforma) {
        this.codPlataforma = codPlataforma;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "Plataforma [codPlataforma=" + codPlataforma + ", nome=" + nome + ", descricao=" + descricao + ", site="
                + site + "]";
    }

    
    
    

}
