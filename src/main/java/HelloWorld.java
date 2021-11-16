import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class HelloWorld extends HttpServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        PrintWriter out=response.getWriter();
        out.print("HelloWorld");
        request.setAttribute("name","usha");
//        request.getRequestDispatcher("/second").forward(request,response);
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}
