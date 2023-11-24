package br.com.ecommerce.servlet.produto;

import br.com.ecommerce.dao.EnderecoDao;
import br.com.ecommerce.dao.ProdutoDao;
import br.com.ecommerce.dao.UserDao;
import br.com.ecommerce.model.Endereco;
import br.com.ecommerce.model.Produto;
import br.com.ecommerce.model.ProdutoItem;
import br.com.ecommerce.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/produto-item")
public class GetProduto extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        System.out.println("GetProduto Servelet");

        String productName = req.getParameter("produto");

        List<ProdutoItem> produtoItems = new ProdutoDao().getProdutoItemByProductName(productName);
        req.setAttribute("produtoItems", produtoItems);
        req.setAttribute("produto", produtoItems.get(1));
        req.getRequestDispatcher("produto.jsp").forward(req, resp);

    }
}
