package br.com.ecommerce.servlet;

import br.com.ecommerce.dao.UserDao;
import br.com.ecommerce.model.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/create-user")
public class CreateUser extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();

        String nome = request.getParameter("user-name");
        String email = request.getParameter("user-email");
        String senha = request.getParameter("user-senha");

        System.out.println(nome);

        Usuario user = new Usuario();
        user.setNome(nome);
        user.setEmail(email);
        user.setSenha(senha);

        userDao.createUser(user);
        request.getRequestDispatcher("paginaLogin.jsp").forward(request, response);

    }
}
