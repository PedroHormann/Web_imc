/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;//Essa importação é a minha conexão com o BD.
import java.sql.DriverManager;//Essa importação serve como uma interface.
import java.sql.SQLException;//importação para o SQL
/**
 *
 * @author 182400138
 */
public class conexao {
      private static final String URL = "jdbc:mysql://localhost:3306/imc?useTime=true&serverTimezone=UTC";//Endereço url do BD.
    private static final String USUARIO = "root";//Usuário do BD.
    private static final String SENHA = "";//senha do BD.
    
    public static Connection conecta() throws SQLException//metodo de conexão chamado "conecta".O throws serve para dizer que vou usar uma importação,ou seja,a importação SQLException.
    {//abrimento das chaves do metodo.
        try 
        {//abrimento das chaves do try.
              return DriverManager.getConnection(URL,USUARIO,SENHA);//retorno.
        }//fechamento das chaves do try.
        catch (SQLException erro) //erro possivel
        {//abrimento das chaves do cacth.
            throw new SQLException("Erro! Conexão Falhou.\nCausa:"+erro.getMessage());//Mensagem de erro e sua causa.
        }//fechamento das chaves do cacth.
    }//fechamento das chaves do metodo.

}
