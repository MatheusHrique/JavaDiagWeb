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
public class DoencasSintomasDAO {
    public static List<Sintoma> searchDoencaSintomaByText(DoencasSintomas ds, boolean typeNomeDoenca, boolean typeNomeSintoma) throws SQLException {
        String text="";
        if(i==0){
            text="nome";
        }else if(i==1){
            text="id_sintomas";
        }
        String sql = "SELECT * FROM Sintomas WHERE "+text+ " LIKE ?";
        try (Connection conn = connectionBanco.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%" + texto + "%");
            ResultSet rs = stmt.executeQuery();

            List<Sintoma> sintomas = new ArrayList<>();
            while (rs.next()) {
                Sintoma sintoma = new Sintoma();
                sintoma.setId(rs.getInt("id_sintomas"));
                sintoma.setNome(rs.getString("nome"));
                sintoma.setDescricao(rs.getString("descricao"));
                sintomas.add(sintoma);
            }
            return sintomas;

        }

    }
}