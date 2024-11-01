package domain2;

import java.util.List;
import java.util.Date;

public class Album{


    
        private Integer codAlbum;
        private String nome;
        private Date dataLancamento;
        private List<Cantor> cantors;
        private Cantor cantor;
        
        public Album(String nome, Date dataLancamento, Cantor cantor) {
            this.nome = nome;
            this.dataLancamento = dataLancamento;
            this.cantor = cantor;
        }

        public Integer getCodAlbum() {
            return codAlbum;
        }

        public void setCodAlbum(Integer codAlbum) {
            this.codAlbum = codAlbum;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Date getDataLancamento() {
            return dataLancamento;
        }

        public void setDataLancamento(Date dataLancamento) {
            this.dataLancamento = dataLancamento;
        }

        public List<Cantor> getCantors() {
            return cantors;
        }

        public void setCantors(List<Cantor> cantors) {
            this.cantors = cantors;
        }

        public Cantor getCantor() {
            return cantor;
        }

        public void setCantor(Cantor cantor) {
            this.cantor = cantor;
        }

        @Override
        public String toString() {
            return "Album [codAlbum=" + codAlbum + ", nome=" + nome + ", dataLancamento=" + dataLancamento + ", cantor="
                    + cantor + "]";
        }

        



    
        
    }
