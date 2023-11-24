package br.com.ecommerce.servlet.user;

import br.com.ecommerce.model.UsuarioLogado;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/logout")
public class LogoutUser extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        UsuarioLogado.desconectarUsuario();
        req.getRequestDispatcher("/listar-produtos").forward(req, resp);

    }
}
