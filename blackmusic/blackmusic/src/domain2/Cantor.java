package domain2;

import java.util.List;

public class Cantor {
    
private Integer codCantor;
private String biografia;
private String nome;
private List<Musica> musicas;

public Cantor(String biografia, String nome) {
    this.biografia = biografia;
    this.nome = nome;
}

public Cantor(Integer codCantor, String biografia, String nome) {
    this.codCantor = codCantor;
    this.biografia = biografia;
    this.nome = nome;
}



public Integer getCodCantor() {
    return codCantor;
}

public void setCodCantor(Integer codCantor) {
    this.codCantor = codCantor;
}

public String getBiografia() {
    return biografia;
}

public void setBiografia(String biografia) {
    this.biografia = biografia;
}

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public List<Musica> getMusicas() {
    return musicas;
}

public void setMusicas(List<Musica> musicas) {
    this.musicas = musicas;
}

@Override
public String toString() {
    return "Cantor [codCantor=" + codCantor + ", biografia=" + biografia + ", nome=" + nome + "]";
}





}
