/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.DoencaDAO;
import model.DoencasSintomas;
import model.DoencasSintomasDAO;
import model.Sintoma;
import model.SintomaDAO;

/**
 *
 * @author 04590876060
 */
public class DoencasSintomasController {

    public static boolean addSintomasDoencas(String doenca, boolean typeNomeDoenca, String sintoma, boolean typeNomeSintoma) throws SQLException {
        if (doenca.isEmpty() || sintoma.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, preencha todos os campos.");
            return false;
        } else {
            //boolean sucesso1=sintomaController.checkSintoma(sintoma);
            //boolean sucesso2=doencaController.checkDoenca(doenca); // search por 1==id_doencas ; 0==nome
            //if(sucesso1==true && sucesso2==true){
            DoencasSintomas ds = new DoencasSintomas();
            Integer idDoencaInt = Integer.valueOf(doenca);
            Integer idSintomaInt = Integer.valueOf(sintoma);
            ds.setIdSintomas(idSintomaInt);
            ds.setIdDoencas(idDoencaInt);

            DoencasSintomasDAO.addDoencaSintoma(ds);
            JOptionPane.showMessageDialog(null, "Sintoma cadastro com sucesso!");
            return true;
            //} else {
            //    System.out.println("ERRO NA CONDIÇÃO!");
            //}
        }
        //return false;
    }

    //public static List<DoencasSintomas> searchDoencasSintomasByText(String id, int i) {
    //    return DoencasSintomasDAO.searchDoencaSintomaByText(id, i);
    //}

    public static void deleteDS(int id) throws SQLException {
        DoencasSintomasDAO.deleteDS(id);
    }

    public static boolean checkDS(int sintoma, int doenca) throws SQLException {
        return DoencasSintomasDAO.checkDS(sintoma, doenca);
    }

    public static void searchDS(String idString, DefaultTableModel modelo) throws SQLException {
        DoencasSintomasDAO.searchDS(idString, modelo);
    }
    
}
