package br.com.ecommerce.servlet.pedido;

import br.com.ecommerce.dao.EnderecoDao;
import br.com.ecommerce.dao.PedidoDao;
import br.com.ecommerce.dao.UserDao;
import br.com.ecommerce.model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/pedido")
public class PedidoServelet extends HttpServlet {

    PedidoDao pedidoDao = new PedidoDao();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Servelet GET Pedidos");
        int userId = 6;

        User usuario = new UserDao().getUserById(userId);
        req.setAttribute("usuario", usuario);

        List<Endereco> enderecos = new EnderecoDao().getEnderecosByUserId(userId);
        List<Pedido> pedidos = pedidoDao.getPedidosByUserId(userId);

        req.setAttribute("enderecos", enderecos);
        req.setAttribute("pedidos", pedidos);
        req.getRequestDispatcher("usuario.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servelet POST pedido");
        int idUsuario = 6;
        String estimativa = "15 dias";

        for (CarrinhoItem item : Carrinho.getCarrinhoItems()) {
            Pedido pedido = new Pedido(item.getImagem(), item.getProduto(), item.getQuantidade(), item.getPreco(), item.getSubTotal(), estimativa, idUsuario);
            pedidoDao.savePedido(pedido);
        }
        Carrinho.limparCarrinho();
        response.sendRedirect("/listar-produtos");

    }
}
