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
        System.out.println("LoginUser doGet");
        req.getRequestDispatcher("paginaLogin.jsp").forward(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("LoginUser doPost");
        String email = req.getParameter("user-email");
        String password = req.getParameter("user-senha");
        System.out.println("Email: " + email);
        System.out.println("Senha: " + password);

        UserDao userDao = new UserDao();
        boolean isValidUser = userDao.verifyCredentials(email, password);

        if (isValidUser) {
            System.out.println("Usuario valido");
            User user = userDao.getUser(email,password);

            req.getSession().setAttribute("loggedUser", email);

            resp.sendRedirect("index.jsp?id=" + user.getId());
        } else {
            System.out.println("Usuario Invalido");

            req.setAttribute("message", "Invalid credentials!");

            req.getRequestDispatcher("paginaLogin.jsp").forward(req, resp);

        }

    }
}
