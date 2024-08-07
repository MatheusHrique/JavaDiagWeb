/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import controller.doencaController;
import controller.sintomaController;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.Enumeration;
import java.util.List;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import model.Doenca;
import model.Sintoma;

/**
 *
 * @author 04590876060
 */
public class TelaPesquisarDoenca extends javax.swing.JFrame {

    /**
     * Creates new form TelaPesquisar
     */
    TelaHome th;

    public TelaPesquisarDoenca(TelaHome th) {
        initComponents();
        this.th = th;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup = new javax.swing.ButtonGroup();
        jpanelInput1 = new javax.swing.JPanel();
        btnExcluir = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtPesquisar = new javax.swing.JTextField();
        lblTexto = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDados = new javax.swing.JTable();
        rbtnId = new javax.swing.JRadioButton();
        rbtnNome = new javax.swing.JRadioButton();
        jpanelTitulo3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Pesquisar doença");

        jpanelInput1.setBackground(new java.awt.Color(153, 153, 255));

        btnExcluir.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        btnExcluir.setText("Excluir");
        btnExcluir.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnExcluir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnExcluir.setFocusPainted(false);
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnCancelar.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCancelar.setFocusPainted(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtPesquisar.setSelectedTextColor(new java.awt.Color(204, 255, 255));
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        lblTexto.setBackground(new java.awt.Color(255, 255, 255));
        lblTexto.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        lblTexto.setText("Pesquisar por nome da doença:");

        btnAlterar.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        btnAlterar.setText("Alterar");
        btnAlterar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnAlterar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAlterar.setFocusPainted(false);
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnPesquisar.setFont(new java.awt.Font("Lucida Fax", 0, 12)); // NOI18N
        btnPesquisar.setText("Pesquisar");
        btnPesquisar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btnPesquisar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPesquisar.setFocusPainted(false);
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        tblDados.setBackground(new java.awt.Color(153, 204, 255));
        tblDados.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        tblDados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "Descrição"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDados);

        rbtnId.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup.add(rbtnId);
        rbtnId.setText("Id");
        rbtnId.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnIdItemStateChanged(evt);
            }
        });
        rbtnId.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnIdStateChanged(evt);
            }
        });

        rbtnNome.setBackground(new java.awt.Color(153, 153, 255));
        buttonGroup.add(rbtnNome);
        rbtnNome.setText("Nome");
        rbtnNome.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rbtnNomeItemStateChanged(evt);
            }
        });
        rbtnNome.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                rbtnNomeStateChanged(evt);
            }
        });
        rbtnNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnNomeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpanelInput1Layout = new javax.swing.GroupLayout(jpanelInput1);
        jpanelInput1.setLayout(jpanelInput1Layout);
        jpanelInput1Layout.setHorizontalGroup(
            jpanelInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelInput1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jpanelInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTexto)
                    .addGroup(jpanelInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jpanelInput1Layout.createSequentialGroup()
                            .addGroup(jpanelInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(jpanelInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addGroup(jpanelInput1Layout.createSequentialGroup()
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnNome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbtnId, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jpanelInput1Layout.setVerticalGroup(
            jpanelInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelInput1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(lblTexto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpanelInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbtnNome)
                    .addComponent(rbtnId))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jpanelInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpanelInput1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(39, Short.MAX_VALUE))
        );

        jpanelTitulo3.setBackground(new java.awt.Color(51, 51, 255));

        jLabel6.setFont(new java.awt.Font("Yu Gothic Medium", 3, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DiagWeb");
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));

        javax.swing.GroupLayout jpanelTitulo3Layout = new javax.swing.GroupLayout(jpanelTitulo3);
        jpanelTitulo3.setLayout(jpanelTitulo3Layout);
        jpanelTitulo3Layout.setHorizontalGroup(
            jpanelTitulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelTitulo3Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpanelTitulo3Layout.setVerticalGroup(
            jpanelTitulo3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpanelTitulo3Layout.createSequentialGroup()
                .addContainerGap(24, Short.MAX_VALUE)
                .addComponent(jLabel6))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpanelInput1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jpanelTitulo3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpanelTitulo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpanelInput1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        int selectedRow = tblDados.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Selecione uma doença para excluir", "Aviso", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Obtenha o ID do cargo selecionado
        int id_doenca = (int) tblDados.getValueAt(selectedRow, 0);

        // Confirme a exclusão
        int option = JOptionPane.showConfirmDialog(this, "Tem certeza que deseja excluir esta doença?", "Confirmar Exclusão", JOptionPane.YES_NO_OPTION);
        if (option == JOptionPane.YES_OPTION) {
            // Exclua o cargo usando o SintomaController
            try {
                doencaController.deleteDoenca(id_doenca);
                JOptionPane.showMessageDialog(this, "Doença excluído com sucesso!");
                // Atualize a tabela após a exclusão
                pesquisarDoenca();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Erro ao excluir doença: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
        th.setVisible(true);
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int selectedRow = tblDados.getSelectedRow();
        if (selectedRow != -1) {
            int id = (int) tblDados.getValueAt(selectedRow, 0);
            String nome = (String) tblDados.getValueAt(selectedRow, 1);
            String descricao = (String) tblDados.getValueAt(selectedRow, 2);

            alterarDialog(id, nome, descricao);
            pesquisarDoenca();
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um sintoma para alterar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        pesquisarDoenca();
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void rbtnNomeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnNomeStateChanged

    }//GEN-LAST:event_rbtnNomeStateChanged

    private void rbtnIdStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_rbtnIdStateChanged

    }//GEN-LAST:event_rbtnIdStateChanged

    private void rbtnNomeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnNomeItemStateChanged
        lblTexto.setText("Pesquisar por nome da doença:");
    }//GEN-LAST:event_rbtnNomeItemStateChanged

    private void rbtnIdItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rbtnIdItemStateChanged
        lblTexto.setText("Pesquisar por id da doença:");
    }//GEN-LAST:event_rbtnIdItemStateChanged

    private void rbtnNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbtnNomeActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPesquisarDoenca.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPesquisarDoenca(new TelaHome()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpanelInput1;
    private javax.swing.JPanel jpanelTitulo3;
    private javax.swing.JLabel lblTexto;
    private javax.swing.JRadioButton rbtnId;
    private javax.swing.JRadioButton rbtnNome;
    private javax.swing.JTable tblDados;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

    private JRadioButton getSelectedButton(ButtonGroup buttonGroup) {
        for (Enumeration<AbstractButton> buttons = buttonGroup.getElements(); buttons.hasMoreElements();) {
            AbstractButton button = buttons.nextElement();
            if (button.isSelected()) {
                return (JRadioButton) button;
            }
        }
        return null;
    }

    private void pesquisarDoenca() {
        String texto = (txtPesquisar.getText()).trim();
        int i = 0; // 0==Nome; 1==Id;
        JRadioButton selectedRadioButton = getSelectedButton(buttonGroup);
        if (selectedRadioButton != null) {
            if (selectedRadioButton.getText() == "Nome") {
                i = 0;
            } else if (selectedRadioButton.getText() == "Id") {
                i = 1;
            }

            try {
                List<Doenca> doencas = doencaController.searchDoencaByText(texto, i);
                DefaultTableModel model = (DefaultTableModel) tblDados.getModel();
                model.setRowCount(0);  // Limpa a tabela antes de adicionar os resultados

                for (Doenca doenca : doencas) {
                    model.addRow(new Object[]{doenca.getId(), doenca.getNome(), doenca.getDescricao()});
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erro ao pesquisar doenças: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);

            }
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um radio button!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    private static void alterarDialog(int id, String nome, String descricao) {

        // Criação dos componentes
        JLabel idLabel = new JLabel("ID: " + id);
        JTextField doencaField = new JTextField(nome, 20);
        JTextField descricaoField = new JTextField(descricao, 20);
        JButton alterarButton = new JButton("Salvar");
        JButton cancelarButton = new JButton("Cancelar");

        // Painel para organizar os componentes
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        gbc.gridx = 0;
        gbc.gridy = 0;
        panel.add(idLabel, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(new JLabel("Doença:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(doencaField, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(new JLabel("Descrição:"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(descricaoField, gbc);

        // Criação do JOptionPane
        Object[] options = {alterarButton, cancelarButton};
        JOptionPane optionPane = new JOptionPane(panel, JOptionPane.PLAIN_MESSAGE, JOptionPane.DEFAULT_OPTION, null, options, null);

        // Criação do JDialog
        JDialog dialog = optionPane.createDialog("Alterando doença: " + nome);

        // Ação do botão Alterar
        alterarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica para alterar as informações
                String novoDoenca = doencaField.getText();
                String novaDescricao = descricaoField.getText();

                Doenca doenca = new Doenca();
                doenca.setId(id);  // Define o ID do sintoma a ser alterado
                doenca.setNome(novoDoenca);
                doenca.setDescricao(novaDescricao);

                try {
                    doencaController.updateDoenca(doenca);
                    JOptionPane.showMessageDialog(dialog, "Doença atualizado com sucesso!");
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(dialog, "Erro ao atualizar doença: " + ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
                }

                dialog.dispose();
            }
        });

        // Ação do botão Cancelar
        cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dialog.dispose();
            }
        });

        // Exibição do diálogo
        dialog.setVisible(true);
    }

}