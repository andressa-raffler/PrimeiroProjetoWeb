package br.com.letscode.primeiroprojetoweb;


import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/aula-alura") //Mapeia para uma URL
public class AluraServlet extends HttpServlet {


    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<body>");
        out.println("Servlet da Alura");
        out.println("</body>");
        out.println("</html>");

        System.out.println("o servlet AULA-ALURA foi chamado");
    }
}
