<%-- 
    Document   : resultado
    Created on : 19 de jun. de 2024, 16:13:08
    Author     : 182400138
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page  import="Modelo.CalculadoraIMC"%>
<%@page  import="Modelo.ContatoBanco"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>RESULTADO</title>
        <link rel="stylesheet" href="CSS/estilo.css"/>
    </head>

    
    <body>
        <table>
            <tr>              
             <div class="centro">
            <%
                try
                {
                ContatoBanco cb = new ContatoBanco();
              //criar um objeto da classe Calculadora.
              CalculadoraIMC calc = new CalculadoraIMC();
              //passar os valores digitados do index.html para Calculadora.java.
              calc.setPeso1(request.getParameter("peso"));
              calc.setAltura1(request.getParameter("altura"));
              //passar a escolha da opereção 
              calc.setGenero(request.getParameter("genero"));
              //mostrar o resultado
              out.print("RESULTADO: "+ calc.Calcular());
              ContatoBanco.cadastrar(calc);
            }
            catch(Exception erro)
            {
             throw  new RuntimeException("Erro ao inserir dados no JSP." + erro.getMessage());
            }
            %>
        
            <button>
                <a href="index.html"> 
                    VOLTAR
                </a>
            </button>
                <img src="img/tabela_imc_mobile-removebg-preview.png" alt="alt"/>
                    <div/>
        </tr>
        </table>

          
    </body>
</html>
