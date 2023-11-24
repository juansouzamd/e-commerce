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
            List<Endereco> enderecos = new EnderecoDao().getEnderecosByUserId(UsuarioLogado.getUserId());

            request.setAttribute("enderecos", enderecos);
            System.out.println("Endereco 1: " + enderecos.get(1).getRua() );

            request.setAttribute("Teste", "tTESTAMDP = TESTADP");
            request.getRequestDispatcher("checkout.jsp").forward(request, response);
        }
    }
}
