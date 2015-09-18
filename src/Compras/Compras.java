/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compras;

import Banco.Banco;
import Banco.BancoFuncoes;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import static org.alfredlibrary.validadores.CNPJ.isValido;
import org.alfredlibrary.validadores.CPF;

/**
 *
 * @author Usuario
 */
public class Compras extends javax.swing.JFrame {

    Banco ba = new Banco();
    BancoFuncoes bf = new BancoFuncoes();
    public Compras() {
        initComponents();
        carregaTipoPruduto();
        carregaFornecedorCombo();
        
         
        // DETECTA QUANDO O COMBOBOX É ALTERADO
        
        comboTipoProduto.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
              
        String tipoproduto;
        
      tipoproduto = comboTipoProduto.getSelectedItem().toString();
        
        String msg1 = "Produtos recuperados";
        String msg2 = "Erro ao Recuperar Produtos";
        String vsql = "SELECT descricao FROM produtos WHERE tipoproduto ='"+tipoproduto+"';";
        String campoSql = "descricao";

        bf.carregaDadoUnico(vsql, msg1, msg2, comboProduto, campoSql);
            
            
        
        }
      }
    );
    
        
       
     
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        internalCompras = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        comboNomeFor = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelCnpj = new javax.swing.JLabel();
        comboFormaPagto = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        comboCondicaoPagto = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtParcela = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboTipoPedido = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        txtValorTotal = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtValorDesc = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtValotNf = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        labelCpf = new javax.swing.JLabel();
        cpfFor = new javax.swing.JTextField();
        cnpjFor = new javax.swing.JTextField();
        jToolBar1 = new javax.swing.JToolBar();
        Novo = new javax.swing.JButton();
        Gravar = new javax.swing.JButton();
        Alterar = new javax.swing.JButton();
        Excluir = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        comboTipoProduto = new javax.swing.JComboBox();
        comboProduto = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtUnidMedida = new javax.swing.JTextField();
        txtRefProduto = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        txtQtde = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtValorUnit = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtValorDescItens = new javax.swing.JTextField();
        txtValorNfItens = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        internalCompras.setClosable(true);
        internalCompras.setTitle("Compras");
        internalCompras.setVisible(true);
        internalCompras.getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedido"));
        jPanel3.setLayout(null);

        comboNomeFor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboNomeFor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboNomeForFocusLost(evt);
            }
        });
        jPanel3.add(comboNomeFor);
        comboNomeFor.setBounds(80, 30, 400, 30);

        jLabel1.setText("Fornecedor:");
        jPanel3.add(jLabel1);
        jLabel1.setBounds(10, 30, 100, 30);

        jLabel2.setText("Valor NF:");
        jPanel3.add(jLabel2);
        jLabel2.setBounds(390, 140, 90, 30);

        labelCnpj.setText("CNPJ Fornecedor:");
        jPanel3.add(labelCnpj);
        labelCnpj.setBounds(10, 70, 100, 30);

        comboFormaPagto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(comboFormaPagto);
        comboFormaPagto.setBounds(160, 100, 160, 30);

        jLabel4.setText("Forma de Pagto:");
        jPanel3.add(jLabel4);
        jLabel4.setBounds(160, 70, 100, 30);

        comboCondicaoPagto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(comboCondicaoPagto);
        comboCondicaoPagto.setBounds(350, 100, 150, 30);

        jLabel5.setText("Condição Pagto:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(350, 70, 100, 30);
        jPanel3.add(txtParcela);
        txtParcela.setBounds(530, 100, 70, 30);

        jLabel6.setText("Parcelas:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(530, 70, 100, 30);

        comboTipoPedido.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(comboTipoPedido);
        comboTipoPedido.setBounds(20, 170, 120, 30);

        jLabel7.setText("Observação:");
        jPanel3.add(jLabel7);
        jLabel7.setBounds(10, 210, 90, 30);
        jPanel3.add(txtValorTotal);
        txtValorTotal.setBounds(180, 170, 70, 30);

        jLabel8.setText("Valor Total:");
        jPanel3.add(jLabel8);
        jLabel8.setBounds(180, 140, 90, 30);
        jPanel3.add(txtValorDesc);
        txtValorDesc.setBounds(280, 170, 70, 30);

        jLabel9.setText("Valor Desc:");
        jPanel3.add(jLabel9);
        jLabel9.setBounds(280, 140, 90, 30);
        jPanel3.add(txtValotNf);
        txtValotNf.setBounds(390, 170, 100, 30);

        txtObservacao.setColumns(20);
        txtObservacao.setRows(5);
        jScrollPane1.setViewportView(txtObservacao);

        jPanel3.add(jScrollPane1);
        jScrollPane1.setBounds(90, 210, 600, 80);

        jLabel10.setText("Tipo Pedido:");
        jPanel3.add(jLabel10);
        jLabel10.setBounds(20, 140, 90, 30);

        labelCpf.setText("CPF:");
        jPanel3.add(labelCpf);
        labelCpf.setBounds(10, 70, 80, 30);

        cpfFor.setEditable(false);
        jPanel3.add(cpfFor);
        cpfFor.setBounds(10, 100, 120, 30);
        jPanel3.add(cnpjFor);
        cnpjFor.setBounds(550, 30, 140, 30);

        jPanel1.add(jPanel3);
        jPanel3.setBounds(0, 80, 760, 300);

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

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(0, 0, 770, 70);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Itens"));
        jPanel4.setLayout(null);

        jLabel11.setText("Valor NF:");
        jPanel4.add(jLabel11);
        jLabel11.setBounds(440, 100, 90, 30);

        comboTipoProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboTipoProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoProdutoItemStateChanged(evt);
            }
        });
        comboTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoProdutoActionPerformed(evt);
            }
        });
        jPanel4.add(comboTipoProduto);
        comboTipoProduto.setBounds(20, 60, 150, 30);

        comboProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboProduto.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboProdutoItemStateChanged(evt);
            }
        });
        comboProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                comboProdutoFocusLost(evt);
            }
        });
        comboProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProdutoActionPerformed(evt);
            }
        });
        jPanel4.add(comboProduto);
        comboProduto.setBounds(210, 60, 200, 30);

        jLabel12.setText("Tipo Produto:");
        jPanel4.add(jLabel12);
        jLabel12.setBounds(20, 30, 90, 30);

        jLabel13.setText("Produto: ");
        jPanel4.add(jLabel13);
        jLabel13.setBounds(210, 30, 90, 30);

        txtUnidMedida.setEditable(false);
        jPanel4.add(txtUnidMedida);
        txtUnidMedida.setBounds(470, 60, 70, 30);
        jPanel4.add(txtRefProduto);
        txtRefProduto.setBounds(20, 130, 110, 30);

        jLabel14.setText("Unid Medida:");
        jPanel4.add(jLabel14);
        jLabel14.setBounds(470, 30, 90, 30);

        jLabel15.setText("Ref. Produto: ");
        jPanel4.add(jLabel15);
        jLabel15.setBounds(20, 100, 90, 30);
        jPanel4.add(txtQtde);
        txtQtde.setBounds(160, 130, 70, 30);

        jLabel16.setText("Qtde: ");
        jPanel4.add(jLabel16);
        jLabel16.setBounds(160, 100, 90, 30);
        jPanel4.add(txtValorUnit);
        txtValorUnit.setBounds(250, 130, 70, 30);

        jLabel17.setText("Valor Unit:");
        jPanel4.add(jLabel17);
        jLabel17.setBounds(250, 100, 90, 30);

        jLabel18.setText("Valor Desc:");
        jPanel4.add(jLabel18);
        jLabel18.setBounds(350, 100, 90, 30);
        jPanel4.add(txtValorDescItens);
        txtValorDescItens.setBounds(350, 130, 70, 30);
        jPanel4.add(txtValorNfItens);
        txtValorNfItens.setBounds(440, 130, 70, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 380, 760, 200);

        jTabbedPane1.addTab("Registro de Compras", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 765, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab2", jPanel2);

        internalCompras.getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 770, 620);

        getContentPane().add(internalCompras);
        internalCompras.setBounds(0, 0, 790, 650);

        setBounds(0, 0, 815, 709);
    }// </editor-fold>//GEN-END:initComponents

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed


    }//GEN-LAST:event_NovoActionPerformed

    private void GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarActionPerformed

  

    }//GEN-LAST:event_GravarActionPerformed

    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed

       

    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed

       
    }//GEN-LAST:event_ExcluirActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
     
    }//GEN-LAST:event_PesquisarActionPerformed

    private void comboTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoProdutoActionPerformed
       
    }//GEN-LAST:event_comboTipoProdutoActionPerformed

    private void comboTipoProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoProdutoItemStateChanged
    
    }//GEN-LAST:event_comboTipoProdutoItemStateChanged

    private void comboProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProdutoActionPerformed

  
        
    }//GEN-LAST:event_comboProdutoActionPerformed

    private void comboProdutoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboProdutoItemStateChanged
 
    }//GEN-LAST:event_comboProdutoItemStateChanged

    private void comboProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboProdutoFocusLost

        ResultSet rs;
           String produto = comboProduto.getSelectedItem().toString();
           



        if("".equals(produto)){

        }

        
        else{
            
            
            rs = ba.buscaUnidadeMedida(produto);
            try {

                if (ba.buscaUnidadeMedida(produto) != null) {

                    txtUnidMedida.setText(rs.getString("unidmedida"));
                   
                }
                else{

                }
            } catch (SQLException ex) {
            }
        } 
        
        
    }//GEN-LAST:event_comboProdutoFocusLost

    private void comboNomeForFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_comboNomeForFocusLost
        
        
        ResultSet rs;
           String nome = comboNomeFor.getSelectedItem().toString();
           



        if("".equals(nome)){

        }   
        
        else{
            
            
            rs = ba.buscaFornecedorComprasCPF(nome);
            try {

                if (ba.buscaFornecedorComprasCPF(nome) != null) {

                    String cpf = rs.getString("cpfFor");
                    
                    
                  
                    if(CPF.isValido(cpf) == true){
                        
                        cpfFor.setText(rs.getString("cpfFor"));
                        
                        cnpjFor.setVisible(false);
                        labelCnpj.setVisible(false);
                        
                        cpfFor.setVisible(true);
                        labelCpf.setVisible(true);
                    }
                }
                    
                    else if(ba.buscaFornecedorCompraCNPJ(nome) != null){

                        
                          String cnpj = rs.getString("cnpjFor");

                          
                         if(isValido(cnpj) == true){
                         
                         cnpjFor.setText(rs.getString("cnpjFor"));
                             
                        cnpjFor.setVisible(true);
                        labelCnpj.setVisible(true);
                        
                        cpfFor.setVisible(false);
                        labelCpf.setVisible(false);
                        
                             
                         
                         }
                            
                    
                        
                    }
                    
                    
                
                else{

                }
            } catch (SQLException ex) {
            }
        } 
        
        
    }//GEN-LAST:event_comboNomeForFocusLost

     public void carregaTipoPruduto(){;
        String msg1 = "Tipo Produto recuperados";
        String msg2 = "Erro ao Recuperar Tipo Produto ";
        String vsql = "SELECT categoria FROM categoriaProduto order by categoria";
        String campoSql = "categoria";

        bf.carregaDadoUnico(vsql, msg1, msg2, comboTipoProduto, campoSql);
    }
     
      
    public void carregaFornecedorCombo(){
        String msg1 = "Fornecedores recuperados";
        String msg2 = "Erro ao Recuperar Fornecedores";
        String vsql = "SELECT nomeFantasia FROM fornecedor order by nomeFantasia";
        String campoSql = "nomeFantasia";

        bf.carregaDadoUnico(vsql, msg1, msg2, comboNomeFor, campoSql);
    }
    
    public void carregaProduto(){
        
        
        String tipoproduto;
        
      tipoproduto = comboTipoProduto.getSelectedItem().toString();
        
        String msg1 = "Produtos recuperados";
        String msg2 = "Erro ao Recuperar Produtos";
        String vsql = "SELECT descricao FROM produtos WHERE tipoproduto ='"+tipoproduto+"';";
        String campoSql = "descricao";

        bf.carregaDadoUnico(vsql, msg1, msg2, comboProduto, campoSql);
    }
    
    
 
   
    
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
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Compras.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Compras().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Gravar;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JTextField cnpjFor;
    private javax.swing.JComboBox comboCondicaoPagto;
    private javax.swing.JComboBox comboFormaPagto;
    private javax.swing.JComboBox comboNomeFor;
    private javax.swing.JComboBox comboProduto;
    private javax.swing.JComboBox comboTipoPedido;
    private javax.swing.JComboBox comboTipoProduto;
    private javax.swing.JTextField cpfFor;
    public javax.swing.JInternalFrame internalCompras;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel labelCnpj;
    private javax.swing.JLabel labelCpf;
    private javax.swing.JTextArea txtObservacao;
    private javax.swing.JTextField txtParcela;
    private javax.swing.JTextField txtQtde;
    private javax.swing.JTextField txtRefProduto;
    private javax.swing.JTextField txtUnidMedida;
    private javax.swing.JTextField txtValorDesc;
    private javax.swing.JTextField txtValorDescItens;
    private javax.swing.JTextField txtValorNfItens;
    private javax.swing.JTextField txtValorTotal;
    private javax.swing.JTextField txtValorUnit;
    private javax.swing.JTextField txtValotNf;
    // End of variables declaration//GEN-END:variables
}
