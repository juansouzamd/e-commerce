package br.com.ecommerce.servlet.carrinho;

import br.com.ecommerce.model.Carrinho;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delete-item-carrinho")
public class DeleteItemCarrinhoServelet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servelet POST delete-item-carrinho");

        String idProduto = request.getParameter("produtoId");
        String subTotalParam = request.getParameter("subTotal");

        if (!idProduto.isEmpty()) {
            int id = Integer.parseInt(idProduto);
            double subTotal = Double.parseDouble(subTotalParam);
            Carrinho.removerItem(id,subTotal);
        }

        response.sendRedirect("/exibir-carrinho");
    }
}
