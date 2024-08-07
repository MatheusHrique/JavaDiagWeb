/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mycompany.util.connectionBanco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
    
}
