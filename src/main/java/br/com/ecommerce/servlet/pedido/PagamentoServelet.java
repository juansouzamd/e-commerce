package br.com.ecommerce.servlet.pedido;

import br.com.ecommerce.model.Carrinho;
import br.com.ecommerce.model.CarrinhoItem;
import br.com.ecommerce.model.Pedido;
import br.com.ecommerce.model.UsuarioLogado;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/pagamento")
public class PagamentoServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servelet POST pedido");

        if (!UsuarioLogado.isLogado()) {
            request.setAttribute("message", "Faça login para concluir a compra.");
            request.getRequestDispatcher("paginaLogin.jsp").forward(request, response);
        } else {
            response.sendRedirect("/checkout.jsp");
        }
    }
}
