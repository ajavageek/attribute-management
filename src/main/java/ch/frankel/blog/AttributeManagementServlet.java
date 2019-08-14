package ch.frankel.blog;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/")
public class AttributeManagementServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Thing thing = new Thing();
        req.setAttribute("old", thing);
        req.getRequestDispatcher("/WEB-INF/page.jsp").forward(req, resp);
    }
}
