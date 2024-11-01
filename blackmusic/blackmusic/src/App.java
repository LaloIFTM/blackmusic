import dao.Cantordao;
import domain2.Cantor;

public class App {
public static void main(String[] args) throws Exception {
    Cantor pop = new Cantor("coisa oisa oisa", "IZA");
    Cantordao cantorsdao = new Cantordao();
    cantorsdao.inserir (pop);
    System.out.println(pop);
}
};