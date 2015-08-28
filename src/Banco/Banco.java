/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco;

import Fornecedor.Fornecedor;
import TelaClientes.Cliente;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Banco {

    Connection con;
    Statement stmt;
    ResultSet rs;
    private int codi;
    private String nom;

    public int getCodi() {
        return codi;
    }

    public void setCodi(int codi) {
        this.codi = codi;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }


    public void conecta() {
        try {
            String serverName = "localhost";
            String mydatabase = "pizzaria15";
            String username = "root";
            String password = "root"; //MUDAR SENHA
            String driverName = "com.mysql.jdbc.Driver"; 
            Class.forName(driverName);
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            con = DriverManager.getConnection(url, username, password);
            stmt = (Statement) con.createStatement();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver não encontrado!");

        } catch (SQLException e) {
            System.out.println("Erro ao conectar o Banco de Dados");
        }
    }

    public boolean valida(int codigo, String login) {
        conecta();
        String sql;

        try {
//Cria comando SQl para inserir na tabela
            sql = "SELECT codigo, login FROM usuario WHERE login='" + login + "'";
            rs = stmt.executeQuery(sql);

            if (rs.first()) {

                return false;

            } else {

                return true;

            }

        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }

    }

   
    public void gravaExpressao(String infixa, String npr, String resultado, int codigo) {
        String sql;
        conecta();

//Captura os dados digitados

        try {
//Cria comando SQl para inserir na tabela
            sql = "INSERT INTO calcnpr(infixa, npr, resultado, codigo) VALUES ('" + infixa + "', '" + npr + "','" + resultado + "'," + codigo + ")";
//Executa o comando sql
//            JOptionPane.showMessageDialog(null, sql);
            stmt.executeUpdate(sql);
            //Exibe mensagem
            JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
        }
    }

    public String abreUsuarios() {
        String sql;
        conecta();
        try {
            sql = "SELECT MAX(codigo) FROM usuario";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
//            rs.previous();

            return rs.getString("MAX(codigo)");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());
            return null;
        }

    }

    public void atualizaFornecedor(String nomeFantasia,String endeFor,String cidadeFor,String nomeContato,String emailFor,String bairroFor,String cnpjFor,String cepFor,String telFor,String celFor,String estadualFor,String numFor,String tel2For,String siteFor) {
        String sql;
        conecta();

        try {

            sql = "UPDATE fornecedor SET" +
                      " nomeFantasia='"+nomeFantasia+"'," +
                      " endeFor='"+endeFor+"'," +
                      " cidadeFor='"+cidadeFor+"'," +
  
                      " nomeContato='"+nomeContato+"'," +
                      " emailFor='"+emailFor+"'," +
                      " bairroFor='"+bairroFor+"'," +
                      " cepFor='"+cepFor+"'," +
                      " telFor='"+telFor+"'," +
                     
                      " celFor='"+celFor+"'," +
                      " WHERE cnpjFor='"+cnpjFor+"'";

            stmt.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "Usuário Atualizado com sucesso");



        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());

        }

    }

    public boolean verificaSenha(int codigo, String senha) {
        String sql;
        conecta();

        try {
            sql = "SELECT senha FROM usuario WHERE codigo=" + codigo + ";";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("senha").equals(senha)) {
                return true;
            } else {
                return false;
            }


        } catch (SQLException e) {

            return false;
        }

    }
    
     public ResultSet buscaCliente(String telefone) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM clientes WHERE telefone='" + telefone + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("telefone") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
      public ResultSet buscaFuncionario(String cpf) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM funcionario WHERE cpfFun='" + cpf + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("cpfFun") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
    /* REALIZA A BUSCA DO FORNECEDOR POR MEIO DO CPF  */
    
    public ResultSet buscaFornecedorCPF(String cpf) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM fornecedor WHERE cpfFor='" + cpf + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("cpfFor") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }

      /* REALIZA A BUSCA DO FORNECEDOR POR MEIO DO CNPJ  */
    
    public ResultSet buscaFornecedorCNPJ(String cnpj) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM fornecedor WHERE cnpjFor='" + cnpj + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("cnpjFor") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
    
    public ResultSet buscaContaPagar(String notaFiscal) {
        String sql;
        conecta();

        try {
            sql = "SELECT * FROM ContasPagar WHERE notaFiscal='" + notaFiscal + "';";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            if (rs.getString("notaFiscal") != null) {
                return rs;
            } else {
                return null;
            }

        } catch (SQLException e) {

            return null;
        }

    }
    
    
    public boolean excluiCliente(String telefone) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM clientes WHERE telefone= '" + telefone + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
    
    public boolean excluiUsuario(String cpf) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM funcionario WHERE cpfFun= '" + cpf + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }

    public boolean excluiFornecedorCPF(String cpf) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM fornecedor WHERE cpfFor= '" + cpf + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
    
     public boolean excluiFornecedorCNPJ(String cnpjFor) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM fornecedor WHERE cnpjFor= '" + cnpjFor + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }

    public boolean login(String login, String senha) {
        String sql;
        conecta();


        try {

            sql = "UPDATE usuario SET logado='n'";
            System.out.println(sql);
            stmt.executeUpdate(sql);

            sql = "SELECT * FROM usuario WHERE login='" + login + "'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();



            if (rs.getString("senha").equals(senha)) {
                sql = "UPDATE usuario SET logado='s' WHERE login='" + login + "'";
                System.out.println(sql);
                stmt.executeUpdate(sql);

                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            return false;
        }

    }

    public boolean getPermissao(int i) {
        String sql;
        conecta();

        try {

            sql = "SELECT * FROM usuario WHERE logado='s'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();

            if ("1".equals(rs.getString("permissao").substring(i - 1, i))) {
                return true;
            } else {
                return false;
            }

        } catch (SQLException e) {

            return false;
        }

    }
    
    public void logado(){
        
        String sql;
        conecta();

        try {

            sql = "SELECT * FROM usuario WHERE logado='s'";
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();

           nom=rs.getString("nome");
           codi=Integer.parseInt(rs.getString("codigo"));

        } catch (SQLException e) {
           
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
        }
    }
    
    
    

    public String historico(int codigo) {
        String sql;
        conecta();
        String infixa;
        String npr;
        String resultado;
        String tudo = "";


        try {
            sql = "SELECT * FROM calcnpr WHERE codigo=" + codigo;
            System.out.println(sql);
            rs = stmt.executeQuery(sql);
            rs.first();
            rs.previous();


            while (rs.next()) {

                infixa = rs.getString("infixa");
                npr = rs.getString("npr");
                resultado = rs.getString("resultado");
                tudo += "Infixa= " + infixa + "\n";
                tudo += "NPR= " + npr + "\n";
                tudo += "resultado= " + resultado + "\n";
                tudo += "----------------------\n";

            }

            return tudo;

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());
            return null;
        }

    }
    
    
    public void apagaHistorico(){
         String sql;
        conecta();
        
        try {
            sql = "DELETE FROM calcnpr where codigo=" + codi;
            System.out.println(sql);
             stmt.executeUpdate(sql);
            rs.first();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso");
          

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao executar o comando SQL:" + e.toString());
           
        }

        
    }


    //

    public boolean gravarCliente(String telefone,String nome,String cep,String cidade,String bairro ,String uf,String numero,String endereco,String complemento) {
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO clientes(telefone, nome, cep, cidade, bairro, uf,numero, endereco, complemento) VALUES ('"; // nome das variaveis do BD
                sql += telefone + "', '" + nome + "','" + cep + "' , '"+ cidade +"' , '"+ bairro +"' , '"+ uf +"' ,'" + numero + "', '" + endereco + "','" + complemento +"')";
                
           

                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;
 
            }
        
    

           catch (SQLException e) {
               
                if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Numero de telefone já registrado" );
            
            }
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }
    
    }
    
    public boolean gravaFuncionario(String nomeFun,String nasciFun,String endeFun,String compleFun,String bairroFun ,String cidadeFun,String setorFun,String sexoFun,String rgFun,String cpfFun,String cepFun,String numFun,String telFun,String celFun, String ufFun) {
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO funcionario(nomeFun, rgFun, cpfFun, cepFun, numFun, telFun,celFun, nasciFun, endeFun,compleFun, bairroFun, setorFun, cidadeFun, sexoFun,ufFun) VALUES ('"; // nome das variaveis do BD
                sql += nomeFun + "', '" + rgFun + "','" + cpfFun + "' , '"+ cepFun +"' , '"+ numFun +"' , '"+ telFun +"' ,'" + celFun + "', '" + nasciFun + "','" + endeFun + "','" + compleFun + "','" + bairroFun + "','" + setorFun +"','" + cidadeFun +"','" + sexoFun +"','" + ufFun +"')";
                
                /*sql = "INSERT INTO usuario(login, senha, permissao) VALUES ('"; // nome das variaveis do BD
                sql += loginFun + "', '"+ senhaFun +"' , '"+ permissao +"')";*/

                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;
 
            }
        
    

           catch (SQLException e) {
               
               if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Funcionario já registrado" );
               }       
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
               
        }
    
    }
    

     public boolean gravaLogin(String loginFun,String senhaFun, String permissao) {
        conecta();
        String sql;


//Captura os dados digitados

        try {
              
          
            
                sql = "INSERT INTO usuario(login, senha, permissao) VALUES ('"; // nome das variaveis do BD
                sql += loginFun + "', '" + senhaFun + "','" + permissao + "')";
                
                /*sql = "INSERT INTO usuario(login, senha, permissao) VALUES ('"; // nome das variaveis do BD
                sql += loginFun + "', '"+ senhaFun +"' , '"+ permissao +"')";*/

                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;
 
            }
        
    

           catch (SQLException e) {
                if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"Funcionario já registrado" );
               }    
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }
    
    }
    
    public boolean gravaFornecedor(String nomeFantasia,String endeFor,String cidadeFor,String nomeContato,String emailFor,String bairroFor,String cnpjFor,String cepFor,String telFor,String celFor,String estadualFor,String numFor,String tel2For,String siteFor, String tipoPessoa, String cpfFor) {
     conecta();
        String sql;


//Captura os dados digitados

        
        try {


                sql = "INSERT INTO fornecedor(nomeFantasia, endeFor, cidadeFor, nomeContato, emailFor, bairroFor, cnpjFor, telFor,cepFor, celFor,estadualFor,numFor,tel2For,siteFor,tipopessoa, cpfFor) VALUES ('"; // nome das variaveis do BD
                sql += nomeFantasia + "', '" + endeFor + "','" + cidadeFor + "' , '" + nomeContato +"' , '"+ emailFor +"' , '"+ bairroFor +"' ,'" + cnpjFor + "', '" + telFor + "','" + cepFor + "','" + celFor + "','" +estadualFor+ "','" +numFor+ "','" +tel2For+ "','" +siteFor+ "','" +tipoPessoa+ "','" +cpfFor+ "')";


          
                
                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;



        } catch (SQLException e) {
            if(e instanceof com.mysql.jdbc.exceptions.jdbc4.MySQLIntegrityConstraintViolationException){
            
                JOptionPane.showMessageDialog(null,"CPF ou CNPJ já registrado" );
            
            }
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }

    }
    
    public boolean gravaContaPagar(String notaFiscal,String descricao,String recebimento,String emissao,String vencimento,String valor,String juros,String multa) {
     conecta();
        String sql;


//Captura os dados digitados

        try {




                sql = "INSERT INTO ContasPagar(notaFiscal, descricao, dataRecebimento, dataEmissao, dataVencimento, valor, juros, multa) VALUES ('"; // nome das variaveis do BD
                sql += notaFiscal + "', '" + descricao + "','" + recebimento + "' , '" + emissao +"' , '"+ vencimento +"' , '"+ valor +"' ,'" + juros + "', '" + multa + "')";


                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;



        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }

    }
    
    
    public boolean gravaProdutos(String descProduto,String codigoProduto,String compleProduto,String categoriaProduto,String fornecedorProduto,String unidadeProduto,String marcaProduto,String quantidade,String minimoEstoque,String maximoEstoque,String precoCompra,String quantAtacado,String descontoAtacado,String margemLucro,String impostos,String desconto) {
     conecta();
        String sql;


//Captura os dados digitados

        try {




                sql = "INSERT INTO Produtos(descProduto, codigoProduto, compleProduto, categoriaProduto, fornecedorProduto, unidadeProduto, marcaProduto, quantidade, minimoEstoque, maximoEstoque,precoCompra, quantAtacado, descontoAtacado, margemLucro, impostos, desconto) VALUES ('"; // nome das variaveis do BD
                sql += descProduto + "', '" + codigoProduto + "','" + compleProduto + "' , '" + categoriaProduto +"' , '"+ fornecedorProduto +"' , '"+ unidadeProduto +"' ,'" + marcaProduto + "', '" + quantidade + "' , '" + minimoEstoque + "' , '" + maximoEstoque + "' , '" + precoCompra +"' , '" + quantAtacado + "' , '" + descontoAtacado + "' , '" + margemLucro + "' , '" + impostos + "' , '" + desconto + "' )";


                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;



        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }

    }
   
    public boolean excluiProduto(String codigoProduto) {
        String sql;
        conecta();

        try {
            sql = "DELETE FROM Produtos WHERE codigoProduto= '" + codigoProduto + "';";
            System.out.println(sql);
            stmt.executeUpdate(sql);
            
            return true;

        } catch (SQLException e) {

            return false;
        }

    }
    
    public boolean gravaCategoria(String Categoria,String Marca,String Unidade) {
     conecta();
        String sql;


//Captura os dados digitados

        try {




                sql = "INSERT INTO Categoria(Categoria, Marca, Unidade) VALUES ('"; // nome das variaveis do BD
                sql += Categoria + "', '" + Marca + "','" + Unidade + "')";


                stmt.executeUpdate(sql);

                JOptionPane.showMessageDialog(null, "Dados inseridos com sucesso!");
                return true;



        } catch (SQLException e) {
            System.out.println("Erro ao executar o comando SQL:" + e.toString());
            return false;
        }

    }
    

}