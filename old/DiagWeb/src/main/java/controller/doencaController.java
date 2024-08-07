/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
import javax.swing.JOptionPane;
import model.Doenca;
import model.DoencaDAO;

/**
 *
 * @author 04590876060
 */
public class doencaController {
    public static boolean addCargo(String nome, String descricao) throws SQLException {
        if (nome.isEmpty() || descricao.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return false;
        } else if (nome.length() >100 || descricao.length()>300) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha menos informações nos campos");
            return false;
        } else {
            Doenca doenca = new Doenca();
            doenca.setNome(nome);
            doenca.setDescricao(descricao);

            DoencaDAO.addDoenca(doenca);
            JOptionPane.showMessageDialog(null, "Sintoma cadastro com sucesso!");
            return true;
        }
    }
}
