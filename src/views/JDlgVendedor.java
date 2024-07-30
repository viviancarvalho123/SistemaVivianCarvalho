/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import telasPesquisas.JDlgPesquisaVendedor;
import tools.util;

/**
 *
 * @author vivic
 */
public class JDlgVendedor extends javax.swing.JDialog {

    /**
     * Creates new form JDlgVendedor
     */
    public JDlgVendedor(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setTitle("Vendedor");
        util.habilitar(false, jTxt_vcsCodigo, jTxt_vcsNome,
       jPwf_vcsSenha,  jCbo_vcsNivel, jChbAtivo, jBtn_vcsCancelar, jBtn_vcsConfirmar);
        util.habilitar(true, jBtn_vcsIncluir, jBtn_vcsAlterar, jBtn_vcsExcluir, jBtn_vcsPesquisar);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTxt_vcsNome = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTxt_vcsCodigo = new javax.swing.JTextField();
        jPwf_vcsSenha = new javax.swing.JPasswordField();
        jLabel7 = new javax.swing.JLabel();
        jCbo_vcsNivel = new javax.swing.JComboBox<>();
        jChbAtivo = new javax.swing.JCheckBox();
        jSeparator1 = new javax.swing.JSeparator();
        jBtn_vcsIncluir = new javax.swing.JButton();
        jBtn_vcsExcluir = new javax.swing.JButton();
        jBtn_vcsAlterar = new javax.swing.JButton();
        jBtn_vcsConfirmar = new javax.swing.JButton();
        jBtn_vcsCancelar = new javax.swing.JButton();
        jBtn_vcsPesquisar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel3.setText("Nome");

        jLabel1.setText("Código");

        jLabel6.setText("Senha");

        jTxt_vcsCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTxt_vcsCodigoActionPerformed(evt);
            }
        });

        jLabel7.setText("Nível");

        jCbo_vcsNivel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Anonimo", "Comun" }));
        jCbo_vcsNivel.setSelectedIndex(-1);

        jChbAtivo.setText("Ativo");

        jBtn_vcsIncluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/incluirIcon.png"))); // NOI18N
        jBtn_vcsIncluir.setText("Incluir");
        jBtn_vcsIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_vcsIncluirActionPerformed(evt);
            }
        });

        jBtn_vcsExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Captura de tela 2024-03-26 233440.png"))); // NOI18N
        jBtn_vcsExcluir.setText("Excluir");
        jBtn_vcsExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_vcsExcluirActionPerformed(evt);
            }
        });

        jBtn_vcsAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/alterarIcon.png"))); // NOI18N
        jBtn_vcsAlterar.setText("Alterar");
        jBtn_vcsAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_vcsAlterarActionPerformed(evt);
            }
        });

        jBtn_vcsConfirmar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/confimarIcon.png"))); // NOI18N
        jBtn_vcsConfirmar.setText("Confirmar");
        jBtn_vcsConfirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_vcsConfirmarActionPerformed(evt);
            }
        });

        jBtn_vcsCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/excluirIcon.png"))); // NOI18N
        jBtn_vcsCancelar.setText("Cancelar");
        jBtn_vcsCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_vcsCancelarActionPerformed(evt);
            }
        });

        jBtn_vcsPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pesquisarIcon.png"))); // NOI18N
        jBtn_vcsPesquisar.setText("Pesquisar");
        jBtn_vcsPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_vcsPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jBtn_vcsIncluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn_vcsAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn_vcsExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn_vcsConfirmar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn_vcsCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn_vcsPesquisar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxt_vcsCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTxt_vcsNome, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jPwf_vcsSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jCbo_vcsNivel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jChbAtivo)))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jPwf_vcsSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCbo_vcsNivel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jChbAtivo)
                    .addComponent(jTxt_vcsNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTxt_vcsCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtn_vcsIncluir, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jBtn_vcsAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jBtn_vcsExcluir)
                        .addComponent(jBtn_vcsConfirmar)
                        .addComponent(jBtn_vcsCancelar)
                        .addComponent(jBtn_vcsPesquisar)))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTxt_vcsCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTxt_vcsCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTxt_vcsCodigoActionPerformed

    private void jBtn_vcsIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_vcsIncluirActionPerformed
        util.habilitar(true, jTxt_vcsCodigo, jTxt_vcsNome,
       jPwf_vcsSenha,  jCbo_vcsNivel, jChbAtivo, jBtn_vcsCancelar, jBtn_vcsConfirmar);
        util.habilitar(false, jBtn_vcsIncluir, jBtn_vcsAlterar, jBtn_vcsExcluir, jBtn_vcsPesquisar);

    }//GEN-LAST:event_jBtn_vcsIncluirActionPerformed

    private void jBtn_vcsExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_vcsExcluirActionPerformed
        util.limparCampos(jTxt_vcsCodigo,jTxt_vcsNome,jChbAtivo, jPwf_vcsSenha);
        util.mensagem("Registro excluido bebê!");
    }//GEN-LAST:event_jBtn_vcsExcluirActionPerformed

    private void jBtn_vcsAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_vcsAlterarActionPerformed
        util.habilitar(true, jTxt_vcsCodigo, jTxt_vcsNome,
       jPwf_vcsSenha,  jCbo_vcsNivel, jChbAtivo, jBtn_vcsCancelar, jBtn_vcsConfirmar);
        util.habilitar(false, jBtn_vcsIncluir, jBtn_vcsAlterar, jBtn_vcsExcluir, jBtn_vcsPesquisar);
    }//GEN-LAST:event_jBtn_vcsAlterarActionPerformed

    private void jBtn_vcsConfirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_vcsConfirmarActionPerformed
        util.limparCampos(jTxt_vcsCodigo,jTxt_vcsNome,jChbAtivo, jPwf_vcsSenha);
        util.habilitar(false, jTxt_vcsCodigo, jTxt_vcsNome,
       jPwf_vcsSenha,  jCbo_vcsNivel, jChbAtivo, jBtn_vcsCancelar, jBtn_vcsConfirmar);
        util.habilitar(true, jBtn_vcsIncluir, jBtn_vcsAlterar, jBtn_vcsExcluir, jBtn_vcsPesquisar);
    }//GEN-LAST:event_jBtn_vcsConfirmarActionPerformed

    private void jBtn_vcsCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_vcsCancelarActionPerformed
        util.habilitar(false, jTxt_vcsCodigo, jTxt_vcsNome,
       jPwf_vcsSenha,  jCbo_vcsNivel, jChbAtivo, jBtn_vcsCancelar, jBtn_vcsConfirmar);
        util.habilitar(true, jBtn_vcsIncluir, jBtn_vcsAlterar, jBtn_vcsExcluir, jBtn_vcsPesquisar);
        util.perguntar("Tem certeza que deseja cancelar o registro mona?");
    }//GEN-LAST:event_jBtn_vcsCancelarActionPerformed

    private void jBtn_vcsPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_vcsPesquisarActionPerformed
        JDlgPesquisaVendedor jDlgPesquisaVendedor = new JDlgPesquisaVendedor(null, true); 
       
        jDlgPesquisaVendedor .setVisible(true);
    }//GEN-LAST:event_jBtn_vcsPesquisarActionPerformed

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
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JDlgVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JDlgVendedor dialog = new JDlgVendedor(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_vcsAlterar;
    private javax.swing.JButton jBtn_vcsCancelar;
    private javax.swing.JButton jBtn_vcsConfirmar;
    private javax.swing.JButton jBtn_vcsExcluir;
    private javax.swing.JButton jBtn_vcsIncluir;
    private javax.swing.JButton jBtn_vcsPesquisar;
    private javax.swing.JComboBox<String> jCbo_vcsNivel;
    private javax.swing.JCheckBox jChbAtivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPasswordField jPwf_vcsSenha;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTxt_vcsCodigo;
    private javax.swing.JTextField jTxt_vcsNome;
    // End of variables declaration//GEN-END:variables
}
