package br.com.ecommerce.servlet.carrinho;

import br.com.ecommerce.model.Carrinho;
import br.com.ecommerce.model.CarrinhoItem;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/carrinho")
public class CarrinhoComprasServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servelet GET carrinho");

        String quantidade = request.getParameter("quantidade");
        String produtoId = request.getParameter("produtoId");
        String produtoItem = request.getParameter("produto");
        String preco = request.getParameter("preco");
        String imagem = request.getParameter("imagem");
        System.out.println("Quantidade: " + quantidade);
        if(!produtoId.isEmpty())
        {
            int id = Integer.parseInt(produtoId);
            int qtd = 1;
            double valorPreco = Double.parseDouble(preco);

            if(!quantidade.isEmpty())
            {
                qtd = Integer.parseInt(quantidade);
            }

            CarrinhoItem item = new CarrinhoItem(id, qtd, valorPreco, produtoItem, imagem);
            Carrinho.adicionarItem(item);

        }

        response.sendRedirect("/exibir-carrinho");

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servelet POST carrinho");

        String quantidade = request.getParameter("quantidade");
        String produtoId = request.getParameter("produtoId");
        String produtoItem = request.getParameter("produto");
        String preco = request.getParameter("preco");
        String imagem = request.getParameter("imagem");
        System.out.println("Quantidade: " + quantidade);
        if(!produtoId.isEmpty())
        {
            int id = Integer.parseInt(produtoId);
            int qtd = 1;
            double valorPreco = Double.parseDouble(preco);

            if(!quantidade.isEmpty())
            {
                qtd = Integer.parseInt(quantidade);
            }

            CarrinhoItem item = new CarrinhoItem(id, qtd, valorPreco, produtoItem, imagem);
            Carrinho.adicionarItem(item);

        }

        response.sendRedirect("/listar-produtos");

    }
}
