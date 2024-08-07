/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mycompany.util.connectionBanco;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 04590876060
 */
public class DoencasSintomasDAO {
    public static void addDoencaSintoma(DoencasSintomas ds) throws SQLException {
        String sql = "INSERT INTO DoencasSintomas (id_sintomas, id_doencas) VALUES (?, ?)";
        try (Connection conn = connectionBanco.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, ds.getIdSintomas());
            stmt.setInt(2, ds.getIdDoencas());
            stmt.executeUpdate();
        }
    }

    //public static List<DoencasSintomas> searchDoencaSintomaByText(String idDoencasSintomas, int i) throws SQLException {
        
        //implementação futura: int i
        //String sql = "SELECT ds.id_doencasSintomas, d.nome AS nome_doenca, GROUP_CONCAT(s.nome SEPARATOR ', ') AS sintomas " +
                           //"FROM DoencasSintomas ds " +
                           //"JOIN Doencas d ON ds.id_doencas = d.id_doencas " +
                           //"JOIN Sintomas s ON ds.id_sintomas = s.id_sintomas " +
                           //:"WHERE ds.id_doencasSintomas = ? " +
                           //"GROUP BY ds.id_doencasSintomas, d.nome";
        //try (Connection conn = connectionBanco.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            //stmt.setString(1, "%" + idDoencasSintomas + "%");
            //ResultSet rs = stmt.executeQuery();

            //List<DoencasSintomas> dss = new ArrayList<>();
            //while (rs.next()) {
                //DoencasSintomas ds = new DoencasSintomas();
                //ds.setIdDoencasSintomas();rs.getInt("id_doencasSintomas");
                //String nomeDoenca = rs.getString("nome_doenca");
                //String sintomas = rs.getString("sintomas");
                
            //}
            //return ds;

        //}
    //}

    public static void deleteDS(int id) throws SQLException {
        String sql = "DELETE FROM DoencasSintomas WHERE id_doencasSintomas = ?";
        try (Connection conn = connectionBanco.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }

    public static boolean checkDS(int sintoma, int doenca) throws SQLException {
        try (Connection conn = connectionBanco.getConnection(); CallableStatement callableStatement = conn.prepareCall("{CALL VerificarSintomaEDoenca(?, ?, ?)}")) {
            callableStatement.setInt(1, sintoma);
            callableStatement.setInt(2, doenca);
            callableStatement.registerOutParameter(3, Types.TINYINT);
            
            //callableStatement.registerOutParameter(2, java.sql.Types.VARCHAR);
            callableStatement.execute();
    
            boolean resultado = callableStatement.getBoolean(3);
            
            callableStatement.close();
            conn.close();
            
            return resultado;
        } catch (Exception E){
            return false;
        }
    }

    public static void searchDS(String idString, DefaultTableModel modelo) throws SQLException {
        String sql = "SELECT ds.id_doencasSintomas, d.nome AS nome_doenca, GROUP_CONCAT(s.nome SEPARATOR ', ') AS sintomas " +
                           "FROM DoencasSintomas ds " +
                           "JOIN Doencas d ON ds.id_doencas = d.id_doencas " +
                           "JOIN Sintomas s ON ds.id_sintomas = s.id_sintomas " +
                           "WHERE ds.id_doencasSintomas = ? " +
                           "GROUP BY ds.id_doencasSintomas, d.nome";
        if(idString.isEmpty()==true){
            idString="0";
            sql = "SELECT ds.id_doencasSintomas, d.nome AS nome_doenca, GROUP_CONCAT(s.nome SEPARATOR ', ') AS sintomas " +
                           "FROM DoencasSintomas ds " +
                           "JOIN Doencas d ON ds.id_doencas = d.id_doencas " +
                           "JOIN Sintomas s ON ds.id_sintomas = s.id_sintomas " +
                           "WHERE ds.id_doencasSintomas LIKE '%' " +
                           "GROUP BY ds.id_doencasSintomas, d.nome";
        }
            int idInt = Integer.parseInt(idString);
        
        
        try (Connection conn = connectionBanco.getConnection(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            if(idInt!=0){
                stmt.setInt(1, idInt);
            }
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id_doencasSintomas");
                String nomeDoenca = rs.getString("nome_doenca");
                String sintomas = rs.getString("sintomas");
                modelo.addRow(new Object[]{id, nomeDoenca, sintomas});
            }

        }
    }
    
    
    
    
}
