/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caixa;

import Banco.Banco;
import Banco.BancoFuncoes;
import TelaClientes.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JInternalFrame;

/**
 *
 * @author Usuario
 */
public class Caixa extends javax.swing.JFrame {

   Banco ba = new Banco();
    BancoFuncoes bf = new BancoFuncoes();
    
    JInternalFrame intCliente;
    
    public Caixa() {
        initComponents();
        
        carregaProduto();
        carregaSaborPizza2();
        carregaSaborPizza1();
        
        txtTelefone.addFocusListener(new java.awt.event.FocusAdapter() {  
              public void focusLost(java.awt.event.FocusEvent evt) {  
                  txtTelefoneFocusLost(evt);  
              }  
              
          });
        
        // ao mudar o valor do combo coloca o valor do produto no campo ao lado
        
         comboProduto.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
              
        String produto;
        
      produto = comboProduto.getSelectedItem().toString();
        
       ResultSet rs;
            
        
        rs = ba.buscaProdutoNome(produto);
            try {

                if (ba.buscaProdutoNome(produto) != null) {
                   

                     txtPreco.setText(rs.getString("valor"));

                }

                else{

              
                }
            } catch (SQLException ex) {
            }
        
       
        }
      }
    );
         
         //ao trocar o valor do combo coloca o valor do produto do campo ao lado
         
          comboSabor1.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
              
        String produto;
        
      produto = comboSabor1.getSelectedItem().toString();
        
       ResultSet rs;
            
        
        rs = ba.buscaProdutoNome(produto);
            try {

                if (ba.buscaProdutoNome(produto) != null) {
                   

                     txtValorPizza1.setText(rs.getString("valor"));
                     
                     float valor1 = Float.parseFloat(rs.getString("valor"));
                             
                     float valor2 = 0;
                             
                        valor2 =  Float.parseFloat(txtValorPizza2.getText());
                     
                     if(valor1 > valor2){
                         

                          String total = String.valueOf(valor1);
                          
                          txtValorTotalPizza.setText(total);
                         
                     }
                     
                     
                     else if(valor2 > valor1){
                         
                         String total = String.valueOf(valor2);
                         
                         txtValorTotalPizza.setText(total);
                         
                     }
                     
                }

                else{

              
                }
            } catch (SQLException ex) {
            }
        
       
        }
      }
    );
         
          
            //ao trocar o valor do combo coloca o valor do produto do campo ao lado
         
          comboSabor2.addActionListener(
      new ActionListener(){
        public void actionPerformed(ActionEvent e){
            
              
        String produto;
        
      produto = comboSabor2.getSelectedItem().toString();
        
       ResultSet rs;
            
        
        rs = ba.buscaProdutoNome(produto);
            try {

                if (ba.buscaProdutoNome(produto) != null) {
                   

                     txtValorPizza2.setText(rs.getString("valor"));

                     
                      float valor2 = Float.parseFloat(rs.getString("valor"));
                             
                     float valor1 = Float.parseFloat(txtValorPizza1.getText());
                     
                     if(valor1 > valor2){
                         

                          String total = String.valueOf(valor1);
                          
                          txtValorTotalPizza.setText(total);
                         
                     }
                     
                     
                     else if(valor2 > valor1){
                         
                         String total = String.valueOf(valor2);
                         
                         txtValorTotalPizza.setText(total);
                         
                     }
                }

                else{

              
                }
            } catch (SQLException ex) {
            }
        
       
        }
      }
    );
         
          
          
        
    }


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadioPartes = new javax.swing.ButtonGroup();
        internalProdutos = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCliente = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        txtEndereco = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtBairro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtPontoRef = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnAlterar = new javax.swing.JButton();
        txtTelefone = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridPedido = new javax.swing.JTable();
        btnRegistrarCliente = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtCodProduto = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        comboProduto = new javax.swing.JComboBox();
        txtPreco = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtQtde = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        btnIncluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        radio2Partes = new javax.swing.JRadioButton();
        radio3Partes = new javax.swing.JRadioButton();
        radio4Partes = new javax.swing.JRadioButton();
        jLabel11 = new javax.swing.JLabel();
        comboSabor1 = new javax.swing.JComboBox();
        comboSabor2 = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        txtValorPizza1 = new javax.swing.JTextField();
        txtValorTotalPizza = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtValorPizza2 = new javax.swing.JTextField();
        btnIncluir2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        internalProdutos.setClosable(true);
        internalProdutos.setTitle("PDV");
        internalProdutos.setVisible(true);
        internalProdutos.getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        jPanel1.setLayout(null);

        jLabel1.setText("Ciente: ");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(30, 70, 70, 30);

        txtCliente.setEditable(false);
        txtCliente.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtCliente);
        txtCliente.setBounds(30, 100, 470, 30);

        jLabel2.setText("Telefone");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 10, 60, 30);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/procurar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        jPanel1.add(btnBuscar);
        btnBuscar.setBounds(160, 40, 170, 30);

        txtEndereco.setEditable(false);
        txtEndereco.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtEndereco);
        txtEndereco.setBounds(30, 160, 470, 30);

        jLabel3.setText("Logradouro:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 130, 110, 30);

        txtBairro.setEditable(false);
        txtBairro.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtBairro);
        txtBairro.setBounds(30, 220, 470, 30);

        jLabel4.setText("Bairro:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 190, 100, 30);

        txtPontoRef.setEditable(false);
        txtPontoRef.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtPontoRef);
        txtPontoRef.setBounds(30, 280, 470, 30);

        jLabel5.setText("Ponto de Refêrencia:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 250, 130, 30);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/atualizar.png"))); // NOI18N
        btnAlterar.setText("Alterar Dados do Cliente");
        jPanel1.add(btnAlterar);
        btnAlterar.setBounds(30, 320, 260, 40);
        jPanel1.add(txtTelefone);
        txtTelefone.setBounds(30, 40, 110, 30);

        internalProdutos.getContentPane().add(jPanel1);
        jPanel1.setBounds(10, 50, 550, 370);

        gridPedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Descricao", "Qtde", "Preco", "Total"
            }
        ));
        jScrollPane1.setViewportView(gridPedido);

        internalProdutos.getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 420, 1170, 130);

        btnRegistrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/registro.png"))); // NOI18N
        btnRegistrarCliente.setText("Registrar Novo Cliente");
        btnRegistrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarClienteActionPerformed(evt);
            }
        });
        internalProdutos.getContentPane().add(btnRegistrarCliente);
        btnRegistrarCliente.setBounds(20, 0, 210, 41);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel2.setLayout(null);

        jLabel6.setText("Codigo Produto:");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(20, 10, 100, 30);
        jPanel2.add(txtCodProduto);
        txtCodProduto.setBounds(120, 10, 90, 30);

        jLabel7.setText("Preço:");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(180, 60, 40, 30);

        comboProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(comboProduto);
        comboProduto.setBounds(20, 90, 150, 30);

        txtPreco.setEditable(false);
        txtPreco.setBackground(new java.awt.Color(204, 204, 204));
        txtPreco.setText("0");
        jPanel2.add(txtPreco);
        txtPreco.setBounds(180, 90, 70, 30);

        jLabel8.setText("Pizza/Produto:");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(20, 60, 90, 30);

        txtQtde.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtQtdeFocusLost(evt);
            }
        });
        jPanel2.add(txtQtde);
        txtQtde.setBounds(260, 90, 80, 30);

        jLabel9.setText("Qtde:");
        jPanel2.add(jLabel9);
        jLabel9.setBounds(260, 64, 50, 20);

        txtTotal.setEditable(false);
        txtTotal.setBackground(new java.awt.Color(204, 204, 204));
        txtTotal.setText("0");
        jPanel2.add(txtTotal);
        txtTotal.setBounds(350, 90, 80, 30);

        jLabel10.setText("Total:");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(350, 60, 40, 30);

        btnIncluir.setText("Incluir no Pedido:");
        jPanel2.add(btnIncluir);
        btnIncluir.setBounds(440, 80, 150, 50);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Pizza Com 2 Sabores:"));
        jPanel3.setLayout(null);

        grupoRadioPartes.add(radio2Partes);
        radio2Partes.setText("2 Partes");
        jPanel3.add(radio2Partes);
        radio2Partes.setBounds(10, 40, 90, 23);

        grupoRadioPartes.add(radio3Partes);
        radio3Partes.setText("3 Partes");
        jPanel3.add(radio3Partes);
        radio3Partes.setBounds(10, 70, 90, 23);

        grupoRadioPartes.add(radio4Partes);
        radio4Partes.setText("4 Partes");
        jPanel3.add(radio4Partes);
        radio4Partes.setBounds(10, 100, 120, 23);

        jLabel11.setText("Sabor 1:");
        jPanel3.add(jLabel11);
        jLabel11.setBounds(150, 20, 60, 30);

        comboSabor1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(comboSabor1);
        comboSabor1.setBounds(200, 20, 150, 30);

        comboSabor2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel3.add(comboSabor2);
        comboSabor2.setBounds(200, 60, 150, 30);

        jLabel12.setText("Sabor 2:");
        jPanel3.add(jLabel12);
        jLabel12.setBounds(150, 60, 60, 30);

        txtValorPizza1.setEditable(false);
        txtValorPizza1.setBackground(new java.awt.Color(204, 204, 204));
        txtValorPizza1.setText("0");
        jPanel3.add(txtValorPizza1);
        txtValorPizza1.setBounds(360, 20, 70, 30);

        txtValorTotalPizza.setEditable(false);
        txtValorTotalPizza.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.add(txtValorTotalPizza);
        txtValorTotalPizza.setBounds(240, 120, 70, 30);

        jLabel13.setText("Valor da Pizza:");
        jPanel3.add(jLabel13);
        jLabel13.setBounds(240, 90, 80, 30);

        txtValorPizza2.setEditable(false);
        txtValorPizza2.setBackground(new java.awt.Color(204, 204, 204));
        txtValorPizza2.setText("0");
        jPanel3.add(txtValorPizza2);
        txtValorPizza2.setBounds(360, 60, 70, 30);

        btnIncluir2.setText("Incluir no Pedido: ");
        jPanel3.add(btnIncluir2);
        btnIncluir2.setBounds(350, 110, 150, 50);

        jPanel2.add(jPanel3);
        jPanel3.setBounds(20, 150, 520, 180);

        internalProdutos.getContentPane().add(jPanel2);
        jPanel2.setBounds(570, 20, 610, 340);

        jLabel14.setText("Observação: ");
        internalProdutos.getContentPane().add(jLabel14);
        jLabel14.setBounds(10, 690, 90, 30);
        internalProdutos.getContentPane().add(jTextField12);
        jTextField12.setBounds(10, 730, 410, 30);

        getContentPane().add(internalProdutos);
        internalProdutos.setBounds(0, 0, 1210, 590);

        setBounds(0, 0, 1232, 709);
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarClienteActionPerformed
        
      
        
    }//GEN-LAST:event_btnRegistrarClienteActionPerformed

    private void txtQtdeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtQtdeFocusLost
        int  qtde;
        float preco,aux;
        
        preco = Float.parseFloat(txtPreco.getText());
        qtde = Integer.parseInt(txtQtde.getText());
        
        aux = (preco * qtde);
        
        String total = String.valueOf(aux);
        
        txtTotal.setText(total);
    }//GEN-LAST:event_txtQtdeFocusLost

    
    private void txtTelefoneFocusLost(java.awt.event.FocusEvent evt) {  
        ResultSet rs;
   

        String telefone = txtTelefone.getText();

        if("".equals(telefone)){

        }

        
        else{
            
            
            rs = ba.buscaCliente(telefone);
            try {

                if (ba.buscaCliente(telefone) != null) {

                   txtCliente.setText(rs.getString("nome"));
                   txtEndereco.setText(rs.getString("endereco"));
                   txtBairro.setText(rs.getString("bairro"));
                   txtPontoRef.setText(rs.getString("complemento"));
                       
                   
                }
                else{

                }
            } catch (SQLException ex) {
            }
        } 
    }
    
   
    
    
     public void carregaProduto(){;
        String msg1 = "roduto recuperados";
        String msg2 = "Erro ao Recuperar Tipo Produto ";
        String vsql = "SELECT descricao FROM produtos order by descricao";
        String campoSql = "descricao";

        bf.carregaDadoUnico(vsql, msg1, msg2, comboProduto, campoSql);
    }
     
      public void carregaSaborPizza1(){;
         String msg1 = "Produto recuperados";
        String msg2 = "Erro ao Recuperar Tipo Produto ";
        String vsql = "SELECT descricao FROM produtos where tipoproduto ='Pizza' ";
        String campoSql = "descricao";
        bf.carregaDadoUnico(vsql, msg1, msg2, comboSabor1, campoSql);
    }
      
      public void carregaSaborPizza2(){;
        String msg1 = "Produto recuperados";
        String msg2 = "Erro ao Recuperar Tipo Produto ";
        String vsql = "SELECT descricao FROM produtos where tipoproduto ='Pizza' ";
        String campoSql = "descricao";

        bf.carregaDadoUnico(vsql, msg1, msg2, comboSabor2, campoSql);
    }
     
     
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
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Caixa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Caixa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnIncluir2;
    private javax.swing.JButton btnRegistrarCliente;
    private javax.swing.JComboBox comboProduto;
    private javax.swing.JComboBox comboSabor1;
    private javax.swing.JComboBox comboSabor2;
    private javax.swing.JTable gridPedido;
    private javax.swing.ButtonGroup grupoRadioPartes;
    public javax.swing.JInternalFrame internalProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JRadioButton radio2Partes;
    private javax.swing.JRadioButton radio3Partes;
    private javax.swing.JRadioButton radio4Partes;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtCodProduto;
    private javax.swing.JTextField txtEndereco;
    private javax.swing.JTextField txtPontoRef;
    private javax.swing.JTextField txtPreco;
    private javax.swing.JTextField txtQtde;
    private javax.swing.JTextField txtTelefone;
    private javax.swing.JTextField txtTotal;
    private javax.swing.JTextField txtValorPizza1;
    private javax.swing.JTextField txtValorPizza2;
    private javax.swing.JTextField txtValorTotalPizza;
    // End of variables declaration//GEN-END:variables
}
