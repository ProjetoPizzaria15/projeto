/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuario;

import Banco.Banco;
import Funcoes.LimitarCampos;

/**
 *
 * @author Usuario
 */
public class Usuario extends javax.swing.JFrame {

    Banco ba = new Banco();
    public Usuario() {
        initComponents();
        
                txt_loginFun1.setDocument(new LimitarCampos(15));
                txt_senhaFun1.setDocument(new LimitarCampos(15));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        txt_loginFun = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        txt_senhaFun = new javax.swing.JPasswordField();
        CriarAcesso = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        Caixa = new javax.swing.JCheckBox();
        Adm = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        internalUsuario = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        txt_loginFun1 = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        txt_senhaFun1 = new javax.swing.JPasswordField();
        CriarAcesso1 = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        Caixa1 = new javax.swing.JCheckBox();
        Adm1 = new javax.swing.JCheckBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuário e Senha"));
        jPanel4.setLayout(null);

        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel34.setText("Login:");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(10, 30, 50, 30);
        jPanel4.add(txt_loginFun);
        txt_loginFun.setBounds(70, 30, 140, 30);

        jLabel35.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel35.setText("Senha:");
        jPanel4.add(jLabel35);
        jLabel35.setBounds(10, 80, 50, 30);
        jPanel4.add(txt_senhaFun);
        txt_senhaFun.setBounds(70, 80, 140, 30);

        CriarAcesso.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/registro.png"))); // NOI18N
        CriarAcesso.setText("Criar Acesso");
        CriarAcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarAcessoActionPerformed(evt);
            }
        });
        jPanel4.add(CriarAcesso);
        CriarAcesso.setBounds(40, 220, 180, 40);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder("Permissões"));
        jPanel8.setLayout(null);

        Caixa.setText("Caixa");
        jPanel8.add(Caixa);
        Caixa.setBounds(30, 20, 130, 23);

        Adm.setText("Administração");
        jPanel8.add(Adm);
        Adm.setBounds(30, 50, 130, 23);

        jPanel4.add(jPanel8);
        jPanel8.setBounds(40, 120, 180, 90);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        internalUsuario.setClosable(true);
        internalUsuario.setVisible(true);
        internalUsuario.getContentPane().setLayout(null);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Usuário e Senha", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel5.setLayout(null);

        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel36.setText("Login:");
        jPanel5.add(jLabel36);
        jLabel36.setBounds(10, 30, 50, 30);
        jPanel5.add(txt_loginFun1);
        txt_loginFun1.setBounds(70, 30, 140, 30);

        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel37.setText("Senha:");
        jPanel5.add(jLabel37);
        jLabel37.setBounds(10, 80, 50, 30);
        jPanel5.add(txt_senhaFun1);
        txt_senhaFun1.setBounds(70, 80, 140, 30);

        CriarAcesso1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/registro.png"))); // NOI18N
        CriarAcesso1.setText("Criar Acesso");
        CriarAcesso1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CriarAcesso1ActionPerformed(evt);
            }
        });
        jPanel5.add(CriarAcesso1);
        CriarAcesso1.setBounds(270, 160, 180, 70);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Permissões", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 14))); // NOI18N
        jPanel9.setLayout(null);

        Caixa1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Caixa1.setText("Caixa");
        jPanel9.add(Caixa1);
        Caixa1.setBounds(30, 40, 130, 23);

        Adm1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Adm1.setText("Administração");
        jPanel9.add(Adm1);
        Adm1.setBounds(30, 70, 130, 25);

        jPanel5.add(jPanel9);
        jPanel9.setBounds(20, 130, 200, 120);

        internalUsuario.getContentPane().add(jPanel5);
        jPanel5.setBounds(10, 10, 640, 270);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        internalUsuario.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 290, 640, 120);

        jPanel1.add(internalUsuario);
        internalUsuario.setBounds(10, 0, 690, 480);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 490);

        setBounds(0, 0, 734, 531);
    }// </editor-fold>//GEN-END:initComponents

    private void CriarAcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarAcessoActionPerformed
        String loginFun,senhaFun, permissao = "";

        loginFun = txt_loginFun.getText();
        senhaFun = txt_senhaFun.getText();

        if (Caixa.isSelected()) {
            permissao += "1";
        } else {
            permissao += "0";
        }

        if (Adm.isSelected()) {
            permissao += "1";
        } else {
            permissao += "0";
        }

        if (ba.gravaLogin( loginFun, senhaFun, permissao)) {

            txt_loginFun.setText("");
            txt_senhaFun.setText("");

        }
    }//GEN-LAST:event_CriarAcessoActionPerformed

    private void CriarAcesso1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CriarAcesso1ActionPerformed
        String loginFun,senhaFun, permissao = "";

        loginFun = txt_loginFun1.getText();
        senhaFun = txt_senhaFun1.getText();

        if (Caixa.isSelected()) {
            permissao += "1";
        } else {
            permissao += "0";
        }

        if (Adm.isSelected()) {
            permissao += "1";
        } else {
            permissao += "0";
        }

        if (ba.gravaLogin( loginFun, senhaFun, permissao)) {

            txt_loginFun.setText("");
            txt_senhaFun.setText("");

        }
    }//GEN-LAST:event_CriarAcesso1ActionPerformed

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
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Usuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Usuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox Adm;
    private javax.swing.JCheckBox Adm1;
    private javax.swing.JCheckBox Caixa;
    private javax.swing.JCheckBox Caixa1;
    private javax.swing.JButton CriarAcesso;
    private javax.swing.JButton CriarAcesso1;
    public javax.swing.JInternalFrame internalUsuario;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txt_loginFun;
    private javax.swing.JTextField txt_loginFun1;
    private javax.swing.JPasswordField txt_senhaFun;
    private javax.swing.JPasswordField txt_senhaFun1;
    // End of variables declaration//GEN-END:variables
}
