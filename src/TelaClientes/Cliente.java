/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TelaClientes;


import Banco.Banco;
import Banco.BancoCep;
import Funcoes.LimitarCampos;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Paulo
 */
public class Cliente extends javax.swing.JPanel {

    BancoCep bacep = new BancoCep();
    Banco ba = new Banco();
    
    
    public Cliente() {
        initComponents();
        
        
        txtCep.addFocusListener(new java.awt.event.FocusAdapter() {  
              public void focusLost(java.awt.event.FocusEvent evt) {  
                  txtCepFocusLostCep(evt);  
              }  
          });
        
        
        txtNome.setDocument(new LimitarCampos(50));
        txtCidade.setDocument(new LimitarCampos(50));
        txtBairro.setDocument(new LimitarCampos(50));
        txtEndereco.setDocument(new LimitarCampos(50));
        
        txtUf.setDocument(new LimitarCampos(2));
        txtNumero.setDocument(new LimitarCampos(5));
        
        
        
    }

    
    
    private void txtCepFocusLostCep(java.awt.event.FocusEvent evt) {  
        ResultSet rs;
   

        String cep = txtCep.getText();

        if("".equals(cep)){

        }

        
        else{
            
            
            rs = bacep.buscaCep(cep);
            try {

                if (bacep.buscaCep(cep) != null) {

                    txtEndereco.setText(rs.getString("desc_logradouro"));
                    txtCidade.setText(rs.getString("desc_cidade"));
                    txtUf.setText(rs.getString("flg_estado"));
                    txtBairro.setText(rs.getString("desc_bairro"));
                    
                }
                else{

                }
            } catch (SQLException ex) {
            }
        } 
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalCliente = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtTelefone = new javax.swing.JFormattedTextField();
        txtNome = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtComplemento = new javax.swing.JTextPane();
        txtEndereco = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        txtCep = new javax.swing.JFormattedTextField();
        aa = new javax.swing.JLabel();
        txtUf = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jToolBar1 = new javax.swing.JToolBar();
        Novo = new javax.swing.JButton();
        Gravar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gridCliente = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtPesquisa = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setLayout(null);

        internalCliente.setClosable(true);
        internalCliente.setVisible(true);
        internalCliente.getContentPane().setLayout(null);

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel3.setLayout(null);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel4.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Nome:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(20, 70, 70, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Telefone(*):");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(10, 20, 90, 30);

        try {
            txtTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(11)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtTelefone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefoneActionPerformed(evt);
            }
        });
        jPanel4.add(txtTelefone);
        txtTelefone.setBounds(100, 20, 110, 30);
        jPanel4.add(txtNome);
        txtNome.setBounds(100, 70, 420, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(10, 80, 660, 120);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Complemento:");
        jPanel6.add(jLabel4);
        jLabel4.setBounds(20, 180, 110, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Cep:");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(20, 10, 70, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Cidade:");
        jPanel6.add(jLabel7);
        jLabel7.setBounds(20, 50, 90, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Bairro");
        jPanel6.add(jLabel8);
        jLabel8.setBounds(20, 90, 90, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Logradouro(*):");
        jPanel6.add(jLabel6);
        jLabel6.setBounds(20, 130, 100, 30);

        jScrollPane1.setViewportView(txtComplemento);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(120, 180, 400, 90);
        jPanel6.add(txtEndereco);
        txtEndereco.setBounds(120, 130, 400, 30);
        jPanel6.add(txtBairro);
        txtBairro.setBounds(120, 90, 400, 30);
        jPanel6.add(txtCidade);
        txtCidade.setBounds(120, 50, 400, 30);

        try {
            txtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jPanel6.add(txtCep);
        txtCep.setBounds(120, 10, 110, 30);

        aa.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        aa.setText("UF:");
        jPanel6.add(aa);
        aa.setBounds(530, 50, 50, 30);

        txtUf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUfActionPerformed(evt);
            }
        });
        jPanel6.add(txtUf);
        txtUf.setBounds(570, 50, 60, 30);

        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        jPanel6.add(txtNumero);
        txtNumero.setBounds(570, 130, 60, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("N°(*):");
        jPanel6.add(jLabel5);
        jLabel5.setBounds(530, 130, 60, 30);

        jPanel3.add(jPanel6);
        jPanel6.setBounds(10, 220, 660, 290);

        jToolBar1.setRollover(true);

        Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/novo.png"))); // NOI18N
        Novo.setText("Limpar Campos");
        Novo.setFocusable(false);
        Novo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Novo.setMargin(new java.awt.Insets(2, 25, 2, 25));
        Novo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });
        jToolBar1.add(Novo);

        Gravar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        Gravar.setText("Registrar");
        Gravar.setFocusable(false);
        Gravar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Gravar.setMargin(new java.awt.Insets(2, 25, 2, 25));
        Gravar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Gravar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GravarActionPerformed(evt);
            }
        });
        jToolBar1.add(Gravar);

        Alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atualizar.png"))); // NOI18N
        Alterar.setText("Alterar");
        Alterar.setFocusable(false);
        Alterar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Alterar.setMargin(new java.awt.Insets(2, 25, 2, 25));
        Alterar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AlterarActionPerformed(evt);
            }
        });
        jToolBar1.add(Alterar);

        Excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        Excluir.setText("Excluir");
        Excluir.setFocusable(false);
        Excluir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Excluir.setMargin(new java.awt.Insets(2, 25, 2, 25));
        Excluir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirActionPerformed(evt);
            }
        });
        jToolBar1.add(Excluir);

        Pesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/procurar.png"))); // NOI18N
        Pesquisar.setText("Pesquisar");
        Pesquisar.setFocusable(false);
        Pesquisar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pesquisar.setMargin(new java.awt.Insets(2, 25, 2, 25));
        Pesquisar.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Pesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PesquisarActionPerformed(evt);
            }
        });
        jToolBar1.add(Pesquisar);

        jPanel3.add(jToolBar1);
        jToolBar1.setBounds(0, 0, 860, 70);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 0, 860, 570);

        jTabbedPane1.addTab("Registrar Cliente", jPanel1);

        jPanel2.setLayout(null);

        gridCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Telefone", "Nome", "UF", "Cidade", "Bairro", "Logradouro", "Numero", "Cep", "Complemento"
            }
        ));
        gridCliente.setToolTipText("");
        jScrollPane2.setViewportView(gridCliente);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(20, 90, 800, 420);

        jLabel9.setText("Telefone:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(180, 30, 90, 40);
        jPanel2.add(txtPesquisa);
        txtPesquisa.setBounds(300, 30, 190, 40);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(530, 40, 73, 23);

        jTabbedPane1.addTab("Pesquisar Cliente", jPanel2);

        internalCliente.getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 1150, 750);

        add(internalCliente);
        internalCliente.setBounds(40, 30, 880, 630);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtUfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUfActionPerformed

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed

       

        txtTelefone.setText("");
        txtNome.setText("");
        txtCep.setText("");
        txtCidade.setText("");
        txtBairro.setText("");
        txtEndereco.setText("");
        txtComplemento.setText("");
        txtUf.setText("");
        txtNumero.setText("");
     
    }//GEN-LAST:event_NovoActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed
        /*
        String txtTelefone, txtNome, txtCidade, txtBairro, txtEndereco, txtComplemento,txtUf,txtNumero;

        
        
        nomeFantasia = nome_fantasiaFor.getText();
        cnpjFor = txt_cnpjFor2.getText();
        endeFor = txt_endeFor.getText();
        cidadeFor = txt_cidadeFor.getText();
        nomeContato = nome_contatoFor.getText();
        emailFor = txt_emailFor.getText();
        bairroFor = txt_bairroFor.getText();
        telFor = txt_telFor.getText();
        cepFor = txt_cepFor.getText();
        estadualFor = txt_estadualFor.getText();
        celFor = txt_celFor.getText();
        numFor = txt_numFor.getText();
        tel2For = txt_tel2For.getText();
        siteFor = txt_siteFor.getText();

        if("  .   .   /    -  ".equals(cnpjFor)){

            JOptionPane.showMessageDialog(null,"Preecha  o campo CNPJ");
            txt_cnpjFor2.requestFocus();
        }
        else{

            ba.atualizaFornecedor(nomeFantasia, endeFor, cidadeFor, nomeContato, emailFor, bairroFor,cnpjFor, cepFor, telFor, celFor, estadualFor, numFor, tel2For, siteFor);

        }
    */
    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed

        //String nomeFantasia = nome_fantasiaFor.getText();

        

            String telefone =txtTelefone.getText();

            if("(11)    -    ".equals(telefone)){

                JOptionPane.showMessageDialog(null,"Preencha o campo telefone para realizar uma exclusão");
                txtTelefone.requestFocus();

            }

            else{
                if (ba.excluiCliente(telefone)) {
                    JOptionPane.showMessageDialog(null, "Excluido com sucesso");
                    
                       txtTelefone.setText("");
                        txtNome.setText("");
                        txtCep.setText("");
                        txtCidade.setText("");
                        txtBairro.setText("");
                        txtEndereco.setText("");
                        txtComplemento.setText("");
                         txtUf.setText("");
                         txtNumero.setText("");
                }
                else {
                    JOptionPane.showMessageDialog(null, "Não encontrado");
                }
            }
        

       
    }//GEN-LAST:event_ExcluirActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
        ResultSet rs;

         String telefone =txtTelefone.getText();

        

            if("(11)    -    ".equals(telefone)){

        
                JOptionPane.showMessageDialog(null,"Preencha o campo telefone para realizar uma busca");
                txtTelefone.requestFocus();
            }

            else{
               
                rs = ba.buscaCliente(telefone);
                try {

                    if (ba.buscaCliente(telefone) != null) {
                        txtTelefone.setText(rs.getString("telefone"));
                        txtNome.setText(rs.getString("nome"));
                        txtCep.setText(rs.getString("cep"));
                        txtCidade.setText(rs.getString("cidade"));
                        txtBairro.setText(rs.getString("bairro"));
                        txtEndereco.setText(rs.getString("endereco"));
                        txtComplemento.setText(rs.getString("complemento"));
                        txtUf.setText(rs.getString("uf"));
                        txtNumero.setText(rs.getString("numero"));
                        

                        txtTelefone.setText(txtTelefone.getText());

                    }
                    else{

                        
                    }
                } catch (SQLException ex) {
                }
            }

        
      
        

        

        

      
        


    }//GEN-LAST:event_PesquisarActionPerformed

    private void GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarActionPerformed

        /*SE A PESSOA FOR FISICA FAZ A INSERÇÃO NO BANCO É O MESMO CODIGO DE BAIXO*/
 
        
        
        
        String telefone, nome, cep, cidade, bairro, uf, numero,endereco , complemento;   
        
        telefone = txtTelefone.getText();
        nome = txtNome.getText();
        cep = txtCep.getText();
        cidade = txtCidade.getText();
        bairro = txtBairro.getText();
        uf = txtUf.getText();
        numero = txtNumero.getText();
        endereco = txtEndereco.getText();
        complemento = txtComplemento.getText();
        
        
        if("".equals(telefone) || "".equals(endereco) || "".equals(numero) ){
            
            JOptionPane.showMessageDialog(null," Preenche os campos obrigatorios (*)");
            
        
        
        }
        
        else{ 
            ba.gravarCliente(telefone, nome, cep, cidade, bairro , uf, numero, endereco, complemento);

                txtTelefone.setText("");
                txtNome.setText("");
                txtCep.setText("");
                txtCidade.setText("");
                txtUf.setText("");
                txtNumero.setText("");
                txtEndereco.setText("");
                txtComplemento.setText("");
                txtBairro.setText("");
             
            
        
       
        }
        
        

    }//GEN-LAST:event_GravarActionPerformed

    private void txtTelefoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefoneActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Gravar;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JLabel aa;
    private javax.swing.JTable gridCliente;
    public javax.swing.JInternalFrame internalCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JFormattedTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextPane txtComplemento;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtPesquisa;
    private javax.swing.JFormattedTextField txtTelefone;
    private javax.swing.JTextField txtUf;
    // End of variables declaration//GEN-END:variables
}
