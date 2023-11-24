package br.com.ecommerce.servlet.endereco;

import br.com.ecommerce.dao.EnderecoDao;
import br.com.ecommerce.model.Endereco;
import br.com.ecommerce.model.UsuarioLogado;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/criar-endereco")
public class CriarEndereco extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("servelet criar endereco");
        int userId = UsuarioLogado.getUserId();


        EnderecoDao enderecoDao = new EnderecoDao();
        Endereco endereco = new Endereco();
        endereco.setBairro(request.getParameter("user-bairro"));
        endereco.setCep(request.getParameter("user-cep"));
        endereco.setRua(request.getParameter("user-rua"));
        endereco.setNumero(request.getParameter("user-numero"));
        endereco.setIdUsuario(userId);
        enderecoDao.createEndereco(endereco);

        response.sendRedirect("/get-enderecos");
    }
}
