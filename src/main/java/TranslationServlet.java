import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@javax.servlet.annotation.WebServlet(name = "TranslationServlet", urlPatterns = {"/translate"})
public class TranslationServlet extends javax.servlet.http.HttpServlet {
    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("hello", "xin chào");
        dictionary.put("how", "Thế nào");
        dictionary.put("book", "Quyển vở");
        dictionary.put("computer", "Máy tính");
        String search = request.getParameter("txtSearch");

        PrintWriter printWriter = response.getWriter();
        String result = dictionary.get(search);
        if (result != null) {
            printWriter.println("<h1>Word: " + search + "</h1>");
            printWriter.println("<h1>Result: " + result + "</h1>");
        } else {
            printWriter.println("<h1>Not found</h1>");
        }
    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
