package br.com.ecommerce.servlet.user;

import br.com.ecommerce.dao.UserDao;
import br.com.ecommerce.model.User;

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
        try {
            System.out.println("servelet create user");

            UserDao userDao = new UserDao();
            User user = new User();

            user.setNome(request.getParameter("user-name"));
            user.setEmail(request.getParameter("user-email"));
            user.setSenha(request.getParameter("user-senha"));
            user.setCpf(request.getParameter("user-cpf"));
            user.setDataNascimento(request.getParameter("user-cpf"));
            user.setTelefone(request.getParameter("user-data_nasc"));

            userDao.createUser(user);

            request.setAttribute("message", "");
            request.getRequestDispatcher("paginaLogin.jsp").forward(request, response);
        }
        catch (Exception ex)
        {
            request.setAttribute("message", "Não foi possivel criar o usuario!");
            request.getRequestDispatcher("paginaLogin.jsp").forward(request, response);

        }
    }
}
