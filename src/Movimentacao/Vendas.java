package Movimentacao;

import Banco.BancoFuncoes;
import Movimentacao.DemonstrativoVenda;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;

public class Vendas extends javax.swing.JFrame {

    private String npedido;
    
    public Vendas() {
        initComponents();

     
        
         gridVenda.setModel(  
      new DefaultTableModel(  
      new Object[] []{ },  
      new String[] {"Npedido","Tipo Pedido", "Data", "Total", }) {  
  
   public boolean isCellEditable(int row, int col) {  
           return false;  
   
   }}); 
         
           
        
        carregaTabela();
        
        
         
    }

    String codigo, barras, produto, categoria, fornecedor, referencia, vendaInicial, vendaFinal;

        BancoFuncoes bf = new BancoFuncoes();

    public void setCodigo(String d){
        codigo = d;
    }
    public String getCodigo(){
        return codigo = txCodigo.getText();
    }
    
    public void setVendaInicial(String n){
        vendaInicial = n;
    }
    public String getVendaInicial(){
        if (jdcVendaIncial.getDate()!=null){
          return vendaInicial = new SimpleDateFormat("yyyy-MM-dd").format(jdcVendaIncial.getDate());
        }else{
          return null;
        }
    }
    
    public void setVendaFinal(String n){
        vendaFinal = n;
    }
    public String getVendaFinal(){
        if (jdcVendaFinal.getDate()!=null){
          return vendaFinal = new SimpleDateFormat("yyyy-MM-dd").format(jdcVendaFinal.getDate());
        }else{
          return null;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        internalMovimentacao = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        bnPesquisa = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txCodigo = new javax.swing.JTextField();
        jdcVendaIncial = new com.toedter.calendar.JDateChooser();
        jdcVendaFinal = new com.toedter.calendar.JDateChooser();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        gridVenda = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        internalMovimentacao.setClosable(true);
        internalMovimentacao.setIconifiable(true);
        internalMovimentacao.setTitle("Vendas Efetuadas");
        internalMovimentacao.setToolTipText("");
        internalMovimentacao.setVisible(true);
        internalMovimentacao.getContentPane().setLayout(null);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar"));
        jPanel1.setLayout(null);

        bnPesquisa.setText("Pesquisar");
        bnPesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnPesquisaActionPerformed(evt);
            }
        });
        jPanel1.add(bnPesquisa);
        bnPesquisa.setBounds(570, 60, 110, 30);

        jLabel2.setText("À:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(370, 60, 30, 30);
        jPanel1.add(txCodigo);
        txCodigo.setBounds(20, 60, 110, 30);
        jPanel1.add(jdcVendaIncial);
        jdcVendaIncial.setBounds(220, 60, 140, 30);
        jPanel1.add(jdcVendaFinal);
        jdcVendaFinal.setBounds(400, 60, 130, 30);

        jLabel3.setText("N° Pedido:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 30, 110, 30);

        jLabel4.setText("Período da Venda:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 30, 110, 30);

        jLabel5.setText("De:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(190, 60, 30, 30);

        internalMovimentacao.getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 10, 790, 120);

        gridVenda.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        gridVenda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gridVendaMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(gridVenda);

        internalMovimentacao.getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 140, 780, 310);

        getContentPane().add(internalMovimentacao);
        internalMovimentacao.setBounds(10, 10, 810, 530);

        setBounds(0, 0, 849, 586);
    }// </editor-fold>//GEN-END:initComponents

    private void bnPesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnPesquisaActionPerformed
     
    }//GEN-LAST:event_bnPesquisaActionPerformed

    private void gridVendaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gridVendaMouseClicked
         if (evt.getClickCount() == 2) {  

             
             Object obj = (gridVenda.getValueAt(gridVenda.getSelectedRow(), 0));  //coluna 0  
             String npedido = obj.toString();
             
             DemonstrativoVenda demovenda = new DemonstrativoVenda();

              demovenda.setVisible(true);   
              
               demovenda.carregaTabela1(npedido);
               demovenda.carregaTabela2(npedido);
            
             
             
         }
    }//GEN-LAST:event_gridVendaMouseClicked

    public void carregaTabela(){
        String msg1 = "Vendas recuperadas com sucesso";
        String msg2 = "Erro ao Recuperar vendas";
        String vsql = "SELECT npedido,tipopedido, data, total " +
                      "FROM venda";

        bf.tabelaVendas(vsql, msg1, msg2, gridVenda);
    }


        
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Vendas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>


        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Vendas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnPesquisa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTable gridVenda;
    public javax.swing.JInternalFrame internalMovimentacao;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    public com.toedter.calendar.JDateChooser jdcVendaFinal;
    public com.toedter.calendar.JDateChooser jdcVendaIncial;
    private javax.swing.JTextField txCodigo;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the npedido
     */
    public String getNpedido() {
        return npedido;
    }

    /**
     * @param npedido the npedido to set
     */
    public void setNpedido(String npedido) {
        this.npedido = npedido;
    }
}
