package br.com.letscode.primeiroprojetoweb;

import br.com.letscode.primeiroprojetoweb.bo.ClienteBusinessObject;
import br.com.letscode.primeiroprojetoweb.dao.ClienteDAO;
import br.com.letscode.primeiroprojetoweb.model.Cliente;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.*;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

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

        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<body>");
        writer.println("<p> Teste GET servlet cliente: "+nome);
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

        ClienteBusinessObject businessObject = new ClienteBusinessObject(new ClienteDAO()); //Injeçao de Dependecia
        System.out.println("Nome: "+nome+", cpf: "+cpf+", idade "+idade+", email "+email);

        Cliente cliente = new Cliente(nome, cpf, email, Integer.parseInt(idade));
        Cliente clienteSalvo = businessObject.save(cliente);
        request.setAttribute("idClienteSalvo", clienteSalvo.getId());
        List<Cliente> clientes = businessObject.findAll();
        request.setAttribute("clientes", clientes);
        RequestDispatcher dispatcher = request.getRequestDispatcher("lista-clientes.jsp");
        dispatcher.forward(request,response);
    }

    @Override
    public void destroy(){
        System.out.println("Destruindo servlet");
    }

}
