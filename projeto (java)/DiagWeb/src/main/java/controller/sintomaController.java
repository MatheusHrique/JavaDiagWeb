/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import model.Sintoma;
import model.SintomaDAO;

/**
 *
 * @author 04590876060
 */
public class sintomaController {
    public static boolean addSintoma(String nome, String descricao) throws SQLException {
        if (nome.isEmpty() || descricao.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return false;
        } else if (nome.length()>100 || descricao.length()>300) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha menos informações nos campos");
            return false;
        } else {
            Sintoma sintoma = new Sintoma();
            sintoma.setNome(nome);
            sintoma.setDescricao(descricao);

            SintomaDAO.addSintoma(sintoma);
            JOptionPane.showMessageDialog(null, "Sintoma cadastro com sucesso!");
            return true;
        }
    }
    
    public static List<Sintoma> searchSintomaByText(String nome, int i) throws SQLException {
        return SintomaDAO.searchSintomaByText(nome, i);
    }

    public static void deleteSintoma(int id) throws SQLException {
        SintomaDAO.deleteSintoma(id);
    }

    public static void updateSintoma(Sintoma sintoma) throws SQLException {
        SintomaDAO.updateSintoma(sintoma);
    }
    
    public static boolean checkSintoma(String id) throws SQLException{
        return SintomaDAO.checkSintoma(id);
    }
}
