package br.com.ecommerce.dao;

import br.com.ecommerce.model.Cartao;
import br.com.ecommerce.model.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CartaoDao {
    Database database = new Database();

    public void createCartao(Cartao cartao) {

        String SQL = "INSERT INTO TB_CARTAO (numero, titular, vencimento, id_usuario) VALUES (?, ?, ?, ?)";

        try {

            Connection connection = database.GetConnection();

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cartao.getNumero());
            preparedStatement.setString(2, cartao.getTitular());
            preparedStatement.setString(3, cartao.getVencimento());
            preparedStatement.setInt(4, cartao.getIdUsuario());
            preparedStatement.execute();

            System.out.println("success in insert Cartao");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.getCause());

        }

    }

    public List<Cartao> GetCartoesByUserId(int userId) {

        String SQL = "SELECT * FROM TB_CARTAO Where id_usuario = ?";

        try {

            Connection connection = database.GetConnection();

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Cartao> cartoes = new ArrayList<>();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String numero = resultSet.getString("numero");
                String titular = resultSet.getString("titular");
                String vencimento = resultSet.getString("vencimento");
                int idUsuario = resultSet.getInt("id_usuario");

                Cartao cartao = new Cartao(id, numero, titular, vencimento, idUsuario);

                cartoes.add(cartao);

            }

            System.out.println("success in select * TB_ENDERECO");

            connection.close();

            return cartoes;

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());

            return Collections.emptyList();

        }

    }

    public void deleteEnderecoById(int id) {

        String SQL = "DELETE TB_ENDERECO WHERE ID = ?";

        try {

            Connection connection = database.GetConnection();

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, id);
            preparedStatement.execute();

            System.out.println("success on delete endereco with id: " + id);

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }

    }

    public void updateCartao(Cartao cartao) {

        String SQL = "UPDATE TB_CARTAO SET NUMERO = ?, TITULAR = ?, VENCIMENTO = ? WHERE ID = ?";

        try {
            Connection connection = database.GetConnection();
            System.out.println("Success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, cartao.getNumero());
            preparedStatement.setString(2, cartao.getTitular());
            preparedStatement.setString(3, cartao.getVencimento());
            preparedStatement.setInt(4, cartao.getId());

            preparedStatement.executeUpdate();

            System.out.println("Success in updating cartao");

            connection.close();

        } catch (Exception e) {
            System.out.println("Fail in database connection");
            System.out.println("Error: " + e.getMessage());
        }

    }
}
