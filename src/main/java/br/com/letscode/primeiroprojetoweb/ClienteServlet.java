package br.com.letscode.primeiroprojetoweb;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/cliente-servlet")
public class ClienteServlet extends HttpServlet {

    @Override
    public void init(){
        System.out.println("Iniciando Servlet");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("Chamando Método Get");
        response.setContentType("text/html");

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("CPF");
        String email = request.getParameter("email");
        String idade = request.getParameter("idade");



        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<p> Teste GET servlet cliente: "+nome+", cpf: "+cpf+ "</p>");
        writer.println("</body>");
        writer.println("</html>");

    }


    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("Chamando Método Post");

        String nome = request.getParameter("nome");
        String cpf = request.getParameter("cpf");
        String email = request.getParameter("email");
        String idade = request.getParameter("idade");

        System.out.println("Nome: "+nome+", cpf: "+cpf+", idade "+idade+", email "+email);

        RequestDispatcher requestDispatcher = request.getRequestDispatcher("sucesso-cadastro.jsp");
        requestDispatcher.forward(request,response);
    }

    @Override
    public void destroy(){
        System.out.println("Destruindo servlet");
    }


}
