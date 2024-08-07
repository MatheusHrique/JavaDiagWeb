/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;
import model.DoencasSintomas;
import model.DoencasSintomasDAO;
import model.Sintoma;
import model.SintomaDAO;

/**
 *
 * @author 04590876060
 */
public class DoencasSintomasController {

    public static boolean addSintomasDoencas(String doenca, boolean typeNomeDoenca, String sintoma, boolean typeNomeSintoma) {
        if (doenca.isEmpty() || sintoma.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return false;
        } else {
            if(){
                
            }
            DoencasSintomas ds = new DoencasSintomas();
            ds.setIdDoencas();
            ds.setIdDoencas();

            DoencasSintomasDAO.searchDoencaSintomaByText(ds);
            JOptionPane.showMessageDialog(null, "Sintoma cadastro com sucesso!");
            return true;
        }
    }
    
}
