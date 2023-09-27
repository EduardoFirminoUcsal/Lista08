import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraServlet")
public class CalculadoraServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int numero1 = Integer.parseInt(request.getParameter("numero1"));
        int numero2 = Integer.parseInt(request.getParameter("numero2"));

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int multiplicacao = numero1 * numero2;
        double divisao = (double) numero1 / numero2;
        int resto = numero1 % numero2;

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Número 1: " + numero1 + "<br>");
        out.println("Número 2: " + numero2 + "<br>");
        out.println("Soma: " + soma + "<br>");
        out.println("Subtração: " + subtracao + "<br>");
        out.println("Multiplicação: " + multiplicacao + "<br>");
        out.println("Divisão: " + divisao + "<br>");
        out.println("Resto da divisão: " + resto);
        out.println("</body></html>");
    }
}
