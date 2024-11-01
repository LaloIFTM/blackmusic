package dao;

import domain2.Cantor;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Cantordao {
	public void inserir(Cantor cantor) throws Exception {
        String sql = "INSERT INTO TB_CANTOR (NOM_CANTOR) VALUES (?)";

        try (Connection conexao = ConexaoMysql.getConexao();
             PreparedStatement stmt = conexao.prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS)) {

            stmt.setString(1, cantor.getNome());
            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    cantor.setCodCantor(rs.getInt(1));
                }
            }
        }
    }
}
