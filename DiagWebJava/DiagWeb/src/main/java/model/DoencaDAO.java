/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mycompany.util.connectionBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 04590876060
 */
public class DoencaDAO {
    
    public static void addDoenca(Doenca doenca) throws SQLException {
        String sql = "INSERT INTO Doencas (nome, descricao) VALUES (?, ?)";
        try (Connection conn = connectionBanco.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, doenca.getNome());
            stmt.setString(2, doenca.getDescricao());
            stmt.executeUpdate();
        }
    }

    public static List<Doenca> searchDoencaByText(String texto, int i) throws SQLException {
        String text="";
        if(i==0){
            text="nome";
        }else if(i==1){
            text="id_doencas";
        }
        String sql = "SELECT * FROM Doencas WHERE "+text+ " LIKE ?";
        try (Connection conn = connectionBanco.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + texto + "%");
            ResultSet rs = stmt.executeQuery();

            List<Doenca> doencas = new ArrayList<>();
            while (rs.next()) {
                Doenca doenca = new Doenca();
                doenca.setId(rs.getInt("id_doencas"));
                doenca.setNome(rs.getString("nome"));
                doenca.setDescricao(rs.getString("descricao"));
                doencas.add(doenca);
            }
            return doencas;

        }

    }

    public static void deleteDoenca(int id) throws SQLException {
        String sql = "DELETE FROM Doencas WHERE id_doencas = ?";
        try (Connection conn = connectionBanco.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public static void updateDoenca(Doenca doenca) throws SQLException {
        String sql = "UPDATE Doencas SET nome = ?, descricao = ? WHERE id_doencas = ?";
        try (Connection conn = connectionBanco.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, doenca.getNome());
            stmt.setString(2, doenca.getDescricao());
            stmt.setInt(3, doenca.getId());
            stmt.executeUpdate();
        }
    }
    
}
