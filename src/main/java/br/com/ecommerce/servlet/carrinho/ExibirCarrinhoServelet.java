package br.com.ecommerce.servlet.carrinho;

import br.com.ecommerce.model.Carrinho;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/exibir-carrinho")
public class ExibirCarrinhoServelet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servelet GET carrinho");

        req.setAttribute("carrinhoItems", Carrinho.getCarrinhoItems());
        req.setAttribute("valorTotal", Carrinho.getTotal());

        req.getRequestDispatcher("carrinho.jsp").forward(req, resp);
    }
}
