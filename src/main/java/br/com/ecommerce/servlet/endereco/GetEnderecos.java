package br.com.ecommerce.servlet.endereco;

import br.com.ecommerce.dao.EnderecoDao;
import br.com.ecommerce.dao.PedidoDao;
import br.com.ecommerce.dao.UserDao;
import br.com.ecommerce.model.Endereco;
import br.com.ecommerce.model.Pedido;
import br.com.ecommerce.model.User;
import br.com.ecommerce.model.UsuarioLogado;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/get-enderecos")
public class GetEnderecos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("Get-Enderecos Servelet");
        int userId = UsuarioLogado.getUserId();
        User usuario = new UserDao().getUserById(userId);
        req.setAttribute("usuario", usuario);

        List<Endereco> enderecos = new EnderecoDao().getEnderecosByUserId(userId);
        List<Pedido> pedidos = new PedidoDao().getPedidosByUserId(userId);

        req.setAttribute("enderecos", enderecos);
        req.setAttribute("pedidos", pedidos);
        req.getRequestDispatcher("usuario.jsp").forward(req, resp);

    }
}