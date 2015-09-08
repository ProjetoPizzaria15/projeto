
package Produtos;
import Banco.Banco;
import Banco.BancoFuncoes;
import BancoObjeto.ObjetoCategoriaProduto;
import BancoObjeto.ObjetoCliente;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.alfredlibrary.validadores.CPF;
/**
 *
 * @author Usuario
 */
public class Produtos extends javax.swing.JFrame {

    Banco ba = new Banco();
    BancoFuncoes bf = new BancoFuncoes();
    
    private String DataRegistro;
    
    public Produtos() {
        
        initComponents();
        carregaTipoPruduto();
        dataHoje();
        EscondeCampos();
        txtValor.setVisible(false);
        labelValor.setVisible(false);

            
      gridCategoriaProduto.setModel(  
      new DefaultTableModel(  
      new Object[] []{ },  
      new String[] {"Nome Categoria" }) {  
  
   public boolean isCellEditable(int row, int col) {  
           return false;  
   
   }});  
    }
private String combo;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRadio = new javax.swing.ButtonGroup();
        internalProduto = new javax.swing.JInternalFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        Gravar = new javax.swing.JButton();
        Pesquisar = new javax.swing.JButton();
        jButton19 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        txtCategoriaProduto = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        gridCategoriaProduto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        radioAcabado = new javax.swing.JRadioButton();
        radioPrima = new javax.swing.JRadioButton();
        jPanel7 = new javax.swing.JPanel();
        txtValor = new javax.swing.JTextField();
        labelValor = new javax.swing.JLabel();
        checkVenda = new javax.swing.JCheckBox();
        jPanel8 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        comboTipoProduto = new javax.swing.JComboBox();
        txtDescricao = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtIngredientes = new javax.swing.JTextArea();
        jPanel9 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        comboMedida = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        comboEstocavel = new javax.swing.JComboBox();
        LabelQtdeMin = new javax.swing.JLabel();
        txtQtdeMin = new javax.swing.JTextField();
        TxtQtdeEstoque = new javax.swing.JTextField();
        LabelQtdeEstoque = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jToolBar2 = new javax.swing.JToolBar();
        Novo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JToolBar.Separator();
        Gravar1 = new javax.swing.JButton();
        jSeparator7 = new javax.swing.JToolBar.Separator();
        Alterar = new javax.swing.JButton();
        jSeparator10 = new javax.swing.JToolBar.Separator();
        Excluir = new javax.swing.JButton();
        jSeparator16 = new javax.swing.JToolBar.Separator();
        Pesquisar1 = new javax.swing.JButton();
        jSeparator14 = new javax.swing.JToolBar.Separator();
        txtDataRegistro = new com.toedter.calendar.JDateChooser();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        internalProduto.setClosable(true);
        internalProduto.setVisible(true);
        internalProduto.getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jToolBar1.setFloatable(false);

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

        jButton19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/delete.png"))); // NOI18N
        jButton19.setText("Excluir");
        jButton19.setFocusable(false);
        jButton19.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jButton19.setMargin(new java.awt.Insets(2, 25, 2, 25));
        jButton19.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jButton19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton19ActionPerformed(evt);
            }
        });
        jToolBar1.add(jButton19);

        jPanel1.add(jToolBar1);
        jToolBar1.setBounds(0, 0, 720, 70);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));
        jPanel4.setLayout(null);
        jPanel4.add(txtCategoriaProduto);
        txtCategoriaProduto.setBounds(70, 40, 140, 30);

        jLabel1.setText("Categoria:");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(10, 40, 70, 30);

        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 70, 250, 100);

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros Categoria"));
        jPanel5.setLayout(null);

        gridCategoriaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(gridCategoriaProduto);

        jPanel5.add(jScrollPane1);
        jScrollPane1.setBounds(10, 20, 740, 280);

        jPanel1.add(jPanel5);
        jPanel5.setBounds(10, 180, 760, 310);

        jTabbedPane1.addTab("Registrar Categoria", jPanel1);

        jPanel2.setLayout(null);

        jPanel6.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel6.setLayout(null);

        grupoRadio.add(radioAcabado);
        radioAcabado.setText("Produto Acabado");
        radioAcabado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioAcabadoActionPerformed(evt);
            }
        });
        jPanel6.add(radioAcabado);
        radioAcabado.setBounds(10, 30, 130, 23);

        grupoRadio.add(radioPrima);
        radioPrima.setText("Materia Prima");
        radioPrima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioPrimaActionPerformed(evt);
            }
        });
        jPanel6.add(radioPrima);
        radioPrima.setBounds(140, 30, 110, 23);

        jPanel2.add(jPanel6);
        jPanel6.setBounds(10, 360, 260, 80);

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel7.setLayout(null);
        jPanel7.add(txtValor);
        txtValor.setBounds(80, 40, 80, 30);

        labelValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        labelValor.setText("Valor:");
        jPanel7.add(labelValor);
        labelValor.setBounds(30, 40, 40, 30);

        checkVenda.setText("Produto de Venda:");
        checkVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkVendaActionPerformed(evt);
            }
        });
        jPanel7.add(checkVenda);
        checkVenda.setBounds(50, 10, 130, 23);

        jPanel2.add(jPanel7);
        jPanel7.setBounds(280, 360, 230, 80);

        jPanel8.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel8.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Ingredientes: ");
        jPanel8.add(jLabel4);
        jLabel4.setBounds(10, 100, 80, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Descrição: ");
        jPanel8.add(jLabel2);
        jLabel2.setBounds(20, 50, 68, 30);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Tipo Produto: ");
        jPanel8.add(jLabel3);
        jLabel3.setBounds(20, 10, 80, 30);

        comboTipoProduto.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Selecione um tipo de produto" }));
        comboTipoProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoProdutoActionPerformed(evt);
            }
        });
        jPanel8.add(comboTipoProduto);
        comboTipoProduto.setBounds(100, 10, 190, 30);
        jPanel8.add(txtDescricao);
        txtDescricao.setBounds(100, 50, 540, 30);

        txtIngredientes.setColumns(20);
        txtIngredientes.setRows(5);
        jScrollPane2.setViewportView(txtIngredientes);

        jPanel8.add(jScrollPane2);
        jScrollPane2.setBounds(100, 90, 540, 60);

        jPanel2.add(jPanel8);
        jPanel8.setBounds(10, 90, 690, 160);

        jPanel9.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jPanel9.setLayout(null);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Unid. Medida: ");
        jPanel9.add(jLabel5);
        jLabel5.setBounds(30, 10, 100, 30);

        comboMedida.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "UN", "KG", "CX", "DZ", "GR", "LT" }));
        comboMedida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboMedidaActionPerformed(evt);
            }
        });
        jPanel9.add(comboMedida);
        comboMedida.setBounds(130, 10, 70, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Estocavél:");
        jPanel9.add(jLabel6);
        jLabel6.setBounds(240, 10, 55, 30);

        comboEstocavel.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "SIM", "NAO" }));
        comboEstocavel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboEstocavelActionPerformed(evt);
            }
        });
        jPanel9.add(comboEstocavel);
        comboEstocavel.setBounds(310, 10, 70, 30);

        LabelQtdeMin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelQtdeMin.setText("Qtde. Minima Estoque:");
        jPanel9.add(LabelQtdeMin);
        LabelQtdeMin.setBounds(410, 10, 140, 30);
        jPanel9.add(txtQtdeMin);
        txtQtdeMin.setBounds(560, 10, 90, 30);

        TxtQtdeEstoque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtQtdeEstoqueActionPerformed(evt);
            }
        });
        jPanel9.add(TxtQtdeEstoque);
        TxtQtdeEstoque.setBounds(560, 50, 90, 30);

        LabelQtdeEstoque.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LabelQtdeEstoque.setText("Qtde Estoque:");
        jPanel9.add(LabelQtdeEstoque);
        LabelQtdeEstoque.setBounds(450, 50, 100, 30);

        jPanel2.add(jPanel9);
        jPanel9.setBounds(10, 260, 690, 90);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Data Registro: ");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(520, 390, 90, 30);

        jToolBar2.setFloatable(false);
        jToolBar2.setRollover(true);

        Novo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/novo.png"))); // NOI18N
        Novo.setText("Novo");
        Novo.setFocusable(false);
        Novo.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Novo.setMargin(new java.awt.Insets(2, 25, 2, 25));
        Novo.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NovoActionPerformed(evt);
            }
        });
        jToolBar2.add(Novo);
        jToolBar2.add(jSeparator1);

        Gravar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/salvar.png"))); // NOI18N
        Gravar1.setText("Gravar");
        Gravar1.setFocusable(false);
        Gravar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Gravar1.setMargin(new java.awt.Insets(2, 25, 2, 25));
        Gravar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Gravar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Gravar1ActionPerformed(evt);
            }
        });
        jToolBar2.add(Gravar1);
        jToolBar2.add(jSeparator7);

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
        jToolBar2.add(Alterar);
        jToolBar2.add(jSeparator10);

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
        jToolBar2.add(Excluir);
        jToolBar2.add(jSeparator16);

        Pesquisar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/procurar.png"))); // NOI18N
        Pesquisar1.setText("Pesquisar");
        Pesquisar1.setFocusable(false);
        Pesquisar1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        Pesquisar1.setMargin(new java.awt.Insets(2, 25, 2, 25));
        Pesquisar1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        Pesquisar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Pesquisar1ActionPerformed(evt);
            }
        });
        jToolBar2.add(Pesquisar1);
        jToolBar2.add(jSeparator14);

        jPanel2.add(jToolBar2);
        jToolBar2.setBounds(0, 0, 780, 80);

        txtDataRegistro.setEnabled(false);
        jPanel2.add(txtDataRegistro);
        txtDataRegistro.setBounds(610, 390, 130, 30);

        jTabbedPane1.addTab("Registrar Produto", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 785, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("tab3", jPanel3);

        internalProduto.getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 0, 790, 580);

        getContentPane().add(internalProduto);
        internalProduto.setBounds(10, 0, 780, 530);

        setBounds(0, 0, 826, 591);
    }// </editor-fold>//GEN-END:initComponents

    private void GravarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GravarActionPerformed
   
        /*SE A PESSOA FOR FISICA FAZ A INSERÇÃO NO BANCO É O MESMO CODIGO DE BAIXO*/

        String categoria;

        categoria = txtCategoriaProduto.getText();
  

        if("".equals(txtCategoriaProduto) ){

            JOptionPane.showMessageDialog(null," Preenche o campo categoria");

        }

        else{
            ba.gravarCategoriaProduto(categoria);

            txtCategoriaProduto.setText("");
     
        }

    }//GEN-LAST:event_GravarActionPerformed

    private void PesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PesquisarActionPerformed
     DefaultTableModel modelo = (DefaultTableModel)gridCategoriaProduto.getModel();
       
    gridCategoriaProduto.removeAll();
    
    while(modelo.getRowCount() > 0){
        modelo.removeRow(0);
    }
    
    ObjetoCategoriaProduto categoriapesquisada = new ObjetoCategoriaProduto();
         String  categoria = txtCategoriaProduto.getText();
  
    
     if(txtCategoriaProduto.equals("")){
        
         
     }

       else{
            categoriapesquisada = ba.buscaCategoriaProdutoTabela(String.valueOf(categoria));
            if(categoriapesquisada != null){
                modelo.addRow(new Object[]{categoriapesquisada.getCategoria()});
            }
            else{
                JOptionPane.showMessageDialog(null, "Nenhuma categoria encontrado !!!");
            }
        }
    
    
    gridCategoriaProduto.repaint();
    
    txtCategoriaProduto.setText(null);
    
    

    }//GEN-LAST:event_PesquisarActionPerformed

    private void jButton19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton19ActionPerformed
      
  //String nomeFantasia = nome_fantasiaFor.getText();

        String categoria =txtCategoriaProduto.getText();

        if(txtCategoriaProduto.equals("")){

            JOptionPane.showMessageDialog(null,"Preencha o campo categoria para realizar uma exclusão");

            txtCategoriaProduto.requestFocus();

        }

        else{
            if (ba.excluiCategoriaProduto(categoria)) {
                JOptionPane.showMessageDialog(null, "Excluido com sucesso");

                txtCategoriaProduto.setText("");
              

            }
            else {
                JOptionPane.showMessageDialog(null, "Não encontrado");
            }
        }
        
        
       
    }//GEN-LAST:event_jButton19ActionPerformed

     public void dataHoje(){
        Date now = new Date();
        DateFormat df = DateFormat.getDateInstance();
        txtDataRegistro.setDate(now);
   }
    
     
    public void EscondeCampos(){
        
            LabelQtdeMin.setVisible(false);
            LabelQtdeEstoque.setVisible(false);
            txtQtdeMin.setVisible(false);
            TxtQtdeEstoque.setVisible(false);
        
    } 
    private void comboTipoProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoProdutoActionPerformed

    private void comboMedidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboMedidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboMedidaActionPerformed

    private void comboEstocavelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboEstocavelActionPerformed
        
        String estocavel = comboEstocavel.getSelectedItem().toString();
        
        if(estocavel.equals("SIM")){
            
            LabelQtdeMin.setVisible(true);
            LabelQtdeEstoque.setVisible(true);
            txtQtdeMin.setVisible(true);
            TxtQtdeEstoque.setVisible(true);
        }
        else {
            
            LabelQtdeMin.setVisible(false);
            LabelQtdeEstoque.setVisible(false);
            txtQtdeMin.setVisible(false);
            TxtQtdeEstoque.setVisible(false);
        }
        
        
    }//GEN-LAST:event_comboEstocavelActionPerformed

    private void radioAcabadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioAcabadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioAcabadoActionPerformed

    private void radioPrimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioPrimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_radioPrimaActionPerformed

    private void NovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NovoActionPerformed

    }//GEN-LAST:event_NovoActionPerformed

    private void Gravar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Gravar1ActionPerformed

        String tipoProduto, descricao, ingredientes, comboMed, comboEst, minimoestoque,produtoacbprima = "", qtdeestoque, valor, dataregistro;
        
        
      tipoProduto = comboTipoProduto.getSelectedItem().toString();
      descricao = txtDescricao.getText();
      ingredientes = txtIngredientes.getText();
      comboMed = comboMedida.getSelectedItem().toString();
      comboEst = comboEstocavel.getSelectedItem().toString();
      minimoestoque = txtQtdeMin.getText();
      qtdeestoque = TxtQtdeEstoque.getText();    
      valor = txtValor.getText();   
     
      
      if(radioAcabado.isSelected()){
          
          
         produtoacbprima += "Produto Acabado";
          
      }
      
      else if(radioPrima.isSelected()){
          
           produtoacbprima += "Materia Prima Prima";
          
      }
      
        if (descricao.equals("")){
         
             JOptionPane.showMessageDialog(null, "Preencha a descrição");
             
             
         }
        
             else {
             
             ba.gravaProduto(tipoProduto, descricao, ingredientes, comboMed, comboEst , minimoestoque, produtoacbprima, qtdeestoque, valor);


                    limpacampos();
        }
      

      
      
    }//GEN-LAST:event_Gravar1ActionPerformed

    
    public void limpacampos(){
        
        txtDescricao.setText("");
            txtIngredientes.setText("");
            txtQtdeMin.setText("");
            TxtQtdeEstoque.setText("");
            txtValor.setText("");
        
    }
    private void AlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AlterarActionPerformed

    }//GEN-LAST:event_AlterarActionPerformed

    private void ExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExcluirActionPerformed

    private void Pesquisar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Pesquisar1ActionPerformed
     
    }//GEN-LAST:event_Pesquisar1ActionPerformed

    private void checkVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkVendaActionPerformed
        
        
        if(checkVenda.isSelected()){
            
            txtValor.setVisible(true);
            labelValor.setVisible(true);
        }
        
        else{
            
            txtValor.setVisible(false);
            labelValor.setVisible(false);
        }
        
    }//GEN-LAST:event_checkVendaActionPerformed

    private void TxtQtdeEstoqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtQtdeEstoqueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtQtdeEstoqueActionPerformed

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
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Produtos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Produtos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Alterar;
    private javax.swing.JButton Excluir;
    private javax.swing.JButton Gravar;
    private javax.swing.JButton Gravar1;
    private javax.swing.JLabel LabelQtdeEstoque;
    private javax.swing.JLabel LabelQtdeMin;
    private javax.swing.JButton Novo;
    private javax.swing.JButton Pesquisar;
    private javax.swing.JButton Pesquisar1;
    private javax.swing.JTextField TxtQtdeEstoque;
    private javax.swing.JCheckBox checkVenda;
    private javax.swing.JComboBox comboEstocavel;
    private javax.swing.JComboBox comboMedida;
    private javax.swing.JComboBox comboTipoProduto;
    private javax.swing.JTable gridCategoriaProduto;
    private javax.swing.ButtonGroup grupoRadio;
    public javax.swing.JInternalFrame internalProduto;
    private javax.swing.JButton jButton19;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar.Separator jSeparator1;
    private javax.swing.JToolBar.Separator jSeparator10;
    private javax.swing.JToolBar.Separator jSeparator14;
    private javax.swing.JToolBar.Separator jSeparator16;
    private javax.swing.JToolBar.Separator jSeparator7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JToolBar jToolBar2;
    private javax.swing.JLabel labelValor;
    private javax.swing.JRadioButton radioAcabado;
    private javax.swing.JRadioButton radioPrima;
    private javax.swing.JTextField txtCategoriaProduto;
    private com.toedter.calendar.JDateChooser txtDataRegistro;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextArea txtIngredientes;
    private javax.swing.JTextField txtQtdeMin;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the combo
     */
    public String getCombo() {
        return combo = (String) comboTipoProduto.getSelectedItem();
    }

    /**
     * @param combo the combo to set
     */
    public void setCombo(String combo) {
        this.combo = combo;
    }
    
    public void carregaTipoPruduto(){
        String msg1 = "Tipo Produto recuperados";
        String msg2 = "Erro ao Recuperar Fornecedores";
        String vsql = "SELECT categoria FROM categoriaProduto order by categoria";
        String campoSql = "categoria";

        bf.carregaDadoUnico(vsql, msg1, msg2, comboTipoProduto, campoSql);
    }

    /**
     * @return the DataRegistro
     */
    public String getDataRegistro() {
        return DataRegistro;
    }

    /**
     * @param DataRegistro the DataRegistro to set
     */
    public void setDataRegistro(String DataRegistro) {
        this.DataRegistro = DataRegistro;
    }
}
