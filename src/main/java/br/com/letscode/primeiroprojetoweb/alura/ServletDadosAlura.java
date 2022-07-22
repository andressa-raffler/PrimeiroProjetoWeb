package br.com.letscode.primeiroprojetoweb.alura;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "ServletDadosAlura", value = "/servletDadosAlura")
public class ServletDadosAlura extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Cadastrando nova empresa");
        String nomeEntrada = request.getParameter("nome");
        String cargoEntrada = request.getParameter("cargo");
        PrintWriter out = response.getWriter();
        out.println("<html><body>Empresa "+nomeEntrada+" cadastrada com sucesso!</body></html>");
        out.println("<html><body>Cargo "+cargoEntrada+" está com vagas abertas </body></html>");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }


}
