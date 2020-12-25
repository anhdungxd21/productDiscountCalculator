import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name="DiscountServlet", urlPatterns = "/discount")
public class DiscountServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        float price = Float.parseFloat(req.getParameter("price"));
        float discount = Float.parseFloat(req.getParameter("discount"));
        float finalPrice = price/100 *(100-discount);
        PrintWriter writer = resp.getWriter();
        writer.println("<html>");
        writer.println("<h1> Price after discount "+finalPrice+"</h1?>");
        writer.println("</html>");
    }
}
