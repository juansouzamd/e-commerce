package br.com.ecommerce.servlet.user;

import br.com.ecommerce.dao.UserDao;
import br.com.ecommerce.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/login")
public class LoginUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.getRequestDispatcher("paginaLogin.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String email = req.getParameter("user-email");
        String password = req.getParameter("user-senha");

        User user = new User(email, password);

        boolean isValidUser = new UserDao().verifyCredentials(user);

        if (isValidUser) {

            req.getSession().setAttribute("loggedUser", email);

            resp.sendRedirect(req.getContextPath() + "/");

        } else {

            req.setAttribute("message", "Invalid credentials!");

            req.getRequestDispatcher("index.jsp").forward(req, resp);

        }

    }
}
