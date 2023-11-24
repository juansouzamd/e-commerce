package br.com.ecommerce.servlet.carrinho;

import br.com.ecommerce.model.Carrinho;
import br.com.ecommerce.model.CarrinhoItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/carrinho")
public class CarrinhoComprasServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servelet GET carrinho");

        Carrinho.getCarrinho().forEach(c -> System.out.println("Itens carrinho: " + c.getIdProduto() + " quantidade: " + c.getQuantidade()));

        response.sendRedirect(request.getContextPath() + "/index.jsp/listar-produtos");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servelet POST carrinho");

        String quantidade = request.getParameter("quantidade");
        String produtoId = request.getParameter("produtoId");
        String produtoItem = request.getParameter("produto");
        String preco = request.getParameter("preco");
        if(!produtoId.isEmpty())
        {
            System.out.println("Produto is not empty");

            int id = Integer.parseInt(produtoId);
            int qtd = 1;
            double valorPreco = Double.parseDouble(preco);

            if(!quantidade.isEmpty())
            {
                System.out.println("quantidade is not empty");
                qtd = Integer.parseInt(quantidade);
            }

            CarrinhoItem item = new CarrinhoItem(id, qtd, valorPreco);
            Carrinho.adicionarItem(item);

            Carrinho.logItens();
            System.out.println();
        }


        response.sendRedirect("/listar-produtos");

    }
}
