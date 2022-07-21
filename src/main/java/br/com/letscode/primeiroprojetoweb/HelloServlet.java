package br.com.letscode.primeiroprojetoweb;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet(value = "/minha-servlet") //Servlet devolve a requisition
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";

    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter(); //Response gera o HTML, conforme linha 16
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");

    }

    public void destroy() {

    }
}