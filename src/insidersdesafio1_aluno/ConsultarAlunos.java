/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package insidersdesafio1_aluno;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sony
 */
public class ConsultarAlunos extends javax.swing.JInternalFrame {

    /**
     * Creates new form ConsultarAlunos
     */
    private JDesktopPane jdpTelaPrincipal;
    public ConsultarAlunos(JDesktopPane jdp) {
        initComponents();
        jdpTelaPrincipal = jdp;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblNomeAluno = new javax.swing.JLabel();
        txtNomeAluno = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnConsultar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableAlunos = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Consultar Alunos");

        lblNomeAluno.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lblNomeAluno.setText("Nome:");

        btnCancelar.setText("Cancelar");
        btnCancelar.setPreferredSize(new java.awt.Dimension(79, 23));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setPreferredSize(new java.awt.Dimension(79, 23));
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.setPreferredSize(new java.awt.Dimension(79, 23));
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnNovo.setText("Novo");
        btnNovo.setMaximumSize(new java.awt.Dimension(79, 23));
        btnNovo.setMinimumSize(new java.awt.Dimension(79, 23));
        btnNovo.setPreferredSize(new java.awt.Dimension(79, 23));
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        tableAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Idade"
            }
        ));
        jScrollPane1.setViewportView(tableAlunos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblNomeAluno)
                        .addGap(18, 18, 18)
                        .addComponent(txtNomeAluno))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnConsultar)
                        .addGap(18, 18, 18)
                        .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNomeAluno)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        try {
            Connection con = DriverManager.getConnection("jbdc:mysql://localhost:3306/alunos");
            String db = "delete from alunos where idAluno = ?";
            PreparedStatement stmt = con.prepareStatement(db);
            int dados = this.tableAlunos.getSelectedRow();
            stmt.setInt(1, Integer.parseInt(tableAlunos.getValueAt(dados, 0).toString()));
            stmt.execute();
            stmt.close();
            con.close();
            DefaultTableModel modelo = (DefaultTableModel) tableAlunos.getModel();
            modelo.removeRow(dados);
            JOptionPane.showMessageDialog(this, "O aluno foi excluído com sucesso!");
            this.setClosable(true);
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
            
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        NovoAluno novo = new NovoAluno(); 
        jdpTelaPrincipal.add(novo);
        novo.setVisible(true);
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        try {
            Connection con = DriverManager.getConnection("jbdc:mysql://localhost:3306/alunos");
            String db = "select * from alunos";
            if(!txtNomeAluno.getText().equals(""))
                db = db + " where Nome LIKE ? ";
            PreparedStatement stmt = con.prepareStatement(db);
            if(!txtNomeAluno.getText().equals(""))
                stmt.setString(1, "%"+txtNomeAluno.getText()+"%");
            ResultSet rs = stmt.executeQuery();
            DefaultTableModel modelo = (DefaultTableModel) tableAlunos.getModel();
            modelo.setNumRows(0);
            while(rs.next()){
                String[] linha = {rs.getString("idAluno"), rs.getString("Nome"),
                    rs.getString("Idade")};
                modelo.addRow(linha);
            }
            
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ConsultarAlunos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        int dado = this.tableAlunos.getSelectedRow();
        int id = Integer.parseInt(tableAlunos.getValueAt(dado, 0).toString());
        NovoAluno novo = new NovoAluno(id);
        jdpTelaPrincipal.add(novo);
        novo.setVisible(true);
        
    }//GEN-LAST:event_btnAlterarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnConsultar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnNovo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblNomeAluno;
    private javax.swing.JTable tableAlunos;
    private javax.swing.JTextField txtNomeAluno;
    // End of variables declaration//GEN-END:variables
}
