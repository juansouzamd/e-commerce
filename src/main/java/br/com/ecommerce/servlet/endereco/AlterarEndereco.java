package br.com.ecommerce.servlet.endereco;

import br.com.ecommerce.dao.EnderecoDao;
import br.com.ecommerce.model.Endereco;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/alterar-endereco")
public class AlterarEndereco extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("Servelet Alterar endereco");

        EnderecoDao enderecoDao = new EnderecoDao();
        Endereco endereco = new Endereco();

        endereco.setId(request.getParameter("id"));
        endereco.setBairro(request.getParameter("user-bairro"));
        endereco.setCep(request.getParameter("user-cep"));
        endereco.setRua(request.getParameter("user-rua"));
        endereco.setNumero(request.getParameter("user-numero"));

        enderecoDao.updateEndereco(endereco);
        response.sendRedirect("/get-enderecos");
    }
}
