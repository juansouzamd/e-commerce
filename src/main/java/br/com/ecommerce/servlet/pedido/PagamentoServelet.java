package br.com.ecommerce.servlet.pedido;

import br.com.ecommerce.dao.EnderecoDao;
import br.com.ecommerce.model.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/pagamento")
public class PagamentoServelet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servelet POST pedido");

        if (!UsuarioLogado.isLogado()) {
            request.setAttribute("message", "Faça login para concluir a compra.");
            request.getRequestDispatcher("paginaLogin.jsp").forward(request, response);
        } else {

            if(Carrinho.isEmpty())
            {
                request.setAttribute("message", "Carrinho Vazio.");
                request.setAttribute("carrinhoItems", Carrinho.getCarrinhoItems());
                request.setAttribute("valorTotal", Carrinho.getTotal());
                request.getRequestDispatcher("/carrinho.jsp").forward(request, response);
            }
            else
            {
                List<Endereco> enderecos = new EnderecoDao().getEnderecosByUserId(UsuarioLogado.getUserId());

                if(enderecos.isEmpty()) {

                    request.setAttribute("message", "É necessario cadastrar um endereco concluir a compra.");
                    request.setAttribute("carrinhoItems", Carrinho.getCarrinhoItems());
                    request.setAttribute("valorTotal", Carrinho.getTotal());
                    request.getRequestDispatcher("/carrinho.jsp").forward(request, response);
                }
                else {
                    request.setAttribute("message", "");
                    request.setAttribute("enderecos", enderecos);
                    request.getRequestDispatcher("checkout.jsp").forward(request, response);
                }
            }


        }
    }
}
