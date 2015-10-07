/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Caixa;

import Banco.Banco;
import Banco.BancoFuncoes;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class gridPedidos extends javax.swing.JFrame {

    Banco ba = new Banco();
    BancoFuncoes bf = new BancoFuncoes();
    public gridPedidos() {
        initComponents();
        
        gridPedidos.setModel(  
      new DefaultTableModel(  
      new Object[] []{ },  
      new String[] {"N°Pedido", "Item", "Qtd", "Hora"}) {  
  
   public boolean isCellEditable(int row, int col) {  
           return false;  
   
   }}); 
        
        carregaTabelaPedidos();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE); 
        this.setLocationRelativeTo(null);  
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        gridPedidos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        gridPedidos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        gridPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gridPedidos);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 0, 1110, 560);

        setBounds(0, 0, 1139, 604);
    }// </editor-fold>//GEN-END:initComponents

   public void carregaTabelaPedidos(){

         String msg1 = "Itens recuperados com sucesso";
        String msg2 = "Erro ao Recuperar Pedidos";
        String vsql = "SELECT v.npedido, i.produto, i.qtde, v.hora\n" +
"FROM venda v\n" +
"JOIN itensPedido i\n" +
"ON i.npedido = v.npedido\n" +
"WHERE v.situacaoEntrega = 'Aberto' AND i.produto LIKE 'Pizza%' OR i.produto LIKE 'Meio%';" ;


        bf.tabelaPedidosAberto(vsql, msg1, msg2, gridPedidos);
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
            java.util.logging.Logger.getLogger(gridPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gridPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gridPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gridPedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gridPedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable gridPedidos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
