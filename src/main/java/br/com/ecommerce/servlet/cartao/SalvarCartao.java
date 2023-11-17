package br.com.ecommerce.servlet.cartao;

import br.com.ecommerce.dao.CartaoDao;
import br.com.ecommerce.model.Cartao;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/salvar-cartao")
public class SalvarCartao extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servelet salvar-cartao");
        int userId = Integer.parseInt("6");
        System.out.println("userId: " + userId);

        String mes = request.getParameter("mes");
        String ano = request.getParameter("ano");

        Cartao cartao = new Cartao();
        cartao.setNumero(request.getParameter("numero-cartao"));
        cartao.setTitular(request.getParameter("titular"));
        cartao.setVencimento(mes + "/" + ano);
        cartao.setIdUsuario(userId);

        CartaoDao dao = new CartaoDao();
        dao.createCartao(cartao);

        response.sendRedirect("/index.jsp?id=" + userId);
    }
}