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
    public static boolean addCargo(String nome, String descricao) throws SQLException {
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
    
    public static List<Sintoma> searchCargosByText(String nome, int i) throws SQLException {
        return SintomaDAO.searchCargosByText(nome, i);
    }
}
