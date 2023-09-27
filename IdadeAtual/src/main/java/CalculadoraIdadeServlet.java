import java.io.IOException;
import java.io.PrintWriter;
import java.time.Year;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CalculadoraIdadeServlet")
public class CalculadoraIdadeServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int anoNascimento = Integer.parseInt(request.getParameter("anoNascimento"));
        boolean fezAniversario = Boolean.parseBoolean(request.getParameter("fezAniversario"));

        int anoAtual = Year.now().getValue();
        int idade = anoAtual - anoNascimento;
        if (!fezAniversario) {
            idade--;
        }

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("Ano de Nascimento: " + anoNascimento + "<br>");
        out.println("Já fez aniversário este ano: " + (fezAniversario ? "Sim" : "Não") + "<br>");
        out.println("Idade: " + idade);
        out.println("</body></html>");
    }
}
