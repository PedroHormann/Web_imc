/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ContatoBanco {
         public static void cadastrar(CalculadoraIMC ci) throws SQLException
    {
        try 
        {
            //passar os dados do BD
            Connection banco = conexao.conecta();
            //criar uma condição para o Java interagir com o SQL
            Statement stat = banco.createStatement();
            //criar a query de SQL(INSERT)
            String sql ="insert into usuario values(null,"+ci.getPeso1()+","+ci.getAltura1()+",'"+ci.getGenero()+"';";
            stat.execute(sql);
            stat.close();
            banco.close();
             } catch (SQLException erro1) {
            throw new SQLException("Erro ao inserir dados.\nCausa: "+erro1.getMessage());
        }
    }
      
}
