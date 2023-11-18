package br.com.ecommerce.servlet.produto;


import br.com.ecommerce.dao.ProdutoDao;
import br.com.ecommerce.model.Produto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/listar-produtos")
public class ListarProdutos extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("ListarProdutos Servelet");

        List<Produto> produtos = new ProdutoDao().getProdutos();

        req.setAttribute("produtos", produtos);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
