package br.com.ecommerce.servlet.endereco;

import br.com.ecommerce.dao.EnderecoDao;
import br.com.ecommerce.model.UsuarioLogado;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/excluir-endereco")
public class ExcluirEndereco extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {

        System.out.println("Servelet Excluir Endereco");

        String id = req.getParameter("id");
        int enderecoId = Integer.parseInt(id);
        System.out.println("EnderecoId: " + enderecoId);

        new EnderecoDao().deleteEnderecoById((int)enderecoId);

        resp.sendRedirect("/get-enderecos" );

    }
}