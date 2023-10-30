package br.com.ecommerce.servlet.user;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

public class LogoutUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getSession().invalidate();

        req.setAttribute("message", "Success on logout");

        req.getRequestDispatcher("login.jsp").forward(req, resp);

    }
}
