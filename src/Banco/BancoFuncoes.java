package Banco;


import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.*;
import javax.swing.table.TableColumn;


public class BancoFuncoes {

    String somaRecebidos, somaAReceber;
    
    BancoFuncoes banco;
    
    conectaBanco cb = new conectaBanco();

    public void setSomaRecebidos(String d){
        somaRecebidos = d;
    }
    public String getSomaRecebidos(){
        return somaRecebidos;
    }

    public void setSomaAReceber(String n){
        somaAReceber = n;
    }
    public String getSomaAReceber(){
        return somaAReceber;
    }

//-------------------------------------------------Função Universal---------------------------------------------

    public BancoFuncoes
           carregaDadoUnico(String vsql, String msg1, String msg2, final JComboBox caixaTexto, String campoSql){

            Connection connection = null;

       try {
            Class.forName(cb.JDBC_DRIVER()).newInstance();
            connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

            Statement s = (Statement) connection.createStatement();

              ResultSet rs = s.executeQuery(vsql);

                   caixaTexto.removeAllItems();

                   caixaTexto.addItem("");

                while (rs.next()){
                    caixaTexto.addItem(rs.getString(campoSql));
                   }

            System.out.println("Conectado ao banco com sucesso");

             s.close();
             connection.close();

             System.out.println(msg1);
             System.out.println(vsql);
             return banco;

       }catch(SQLException ex){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println("SQLException: " + ex.getMessage());
          System.out.println("SQLState: " + ex.getSQLState());
          System.out.println("Error: " + ex.getErrorCode());
          System.out.println(vsql);
          return null;
        }
        catch(Exception e){
          JOptionPane.showMessageDialog(null, msg2);
          System.out.println(vsql);
          System.out.println("Dados não filtrados" + e);
          return null;
        }

   }
           
            public BancoFuncoes
           tabelaClientes(String sql, String msg1, String msg2, final JTable gridCliente){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridCliente.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String telefone = rs.getString("telefone");
                        String nome = rs.getString("nome");
                        String uf = rs.getString("uf");
                        String cidade = rs.getString("cidade");
                        String bairro = rs.getString("bairro");
                        String logradouro = rs.getString("endereco");
                        String numero = rs.getString("numero");
                        String cep = rs.getString("cep");
                        String complemento = rs.getString("complemento");
                        dtm.addRow(new Object[]{telefone, nome, uf, cidade, bairro, logradouro, numero, cep, complemento});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
                 public BancoFuncoes
           tabelaFuncionario(String sql, String msg1, String msg2, final JTable gridFuncionario){

               
               
          Connection connection = null;

   try {

        Class.forName(cb.JDBC_DRIVER()).newInstance();
        connection = (Connection) DriverManager.getConnection(cb.DB_URL(), cb.DB_USER(), cb.DB_PASS());

        Statement s = (Statement) connection.createStatement();

          ResultSet rs = s.executeQuery(sql);

          javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel)gridFuncionario.getModel();
                   int i = dtm.getRowCount();
                   for(int a = 0; a < i; a++)
                   {
                   dtm.removeRow(0);
                   }

                   while (rs.next()){
                       String Nome = rs.getString("nomeFun");
                        String Sexo = rs.getString("sexoFun");
                        String CPF = rs.getString("cpfFun");
                        String RG = rs.getString("rgFun");
                        String Data_Nascimento = rs.getString("nasciFun");
                        String UF = rs.getString("ufFun");
                        String Cidade = rs.getString("cidadeFun");
                        String Endereco = rs.getString("endeFun");
                        String Bairro = rs.getString("bairroFun");
                        String Cep = rs.getString("cepFun");
                        String Numero = rs.getString("numFun");
                        String Complemento = rs.getString("compleFun");
                        String Telefone = rs.getString("telFun");
                        String Ceular = rs.getString("celFun");
                        String Setor = rs.getString("setorFun");
             
                        dtm.addRow(new Object[]{Nome ,Sexo ,CPF,RG ,Data_Nascimento , UF,Cidade ,Endereco ,Bairro ,Cep , Numero, Complemento,Telefone ,Ceular , Setor});
                   }


//        System.out.println("Fornecedores Recuperados com sucesso");

         s.close();
         connection.close();

         System.out.println(msg1);
         System.out.println(sql);
         return banco;

   }catch(SQLException ex){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println("SQLException: " + ex.getMessage());
      System.out.println("SQLState: " + ex.getSQLState());
      System.out.println("Error: " + ex.getErrorCode());
      System.out.println(sql);
      return null;
    }
    catch(Exception e){
      JOptionPane.showMessageDialog(null, msg2);
      System.out.println(sql);
      System.out.println("Problemas ao tentar conectar com o banco de dados: " + e);
      return null;
    }

 }
           
           
}