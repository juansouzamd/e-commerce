package br.com.ecommerce.dao;

import br.com.ecommerce.model.Endereco;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EnderecoDao {
    Database database = new Database();

    public void createEndereco(Endereco endereco) {

        String SQL = "INSERT INTO TB_ENDERECO  (rua, cep, bairro, numero, id_usuario) VALUES (?, ?, ?, ?, ?)";

        try {

            Connection connection = database.GetConnection();

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, endereco.getRua());
            preparedStatement.setString(2, endereco.getCep());
            preparedStatement.setString(3, endereco.getBairro());
            preparedStatement.setString(4, endereco.getNumero());
            preparedStatement.setInt(5, endereco.getIdUsuario());
            preparedStatement.execute();

            System.out.println("success in insert Endereco");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.getCause());

        }

    }

    public List<Endereco> GetEnderecos() {

        String SQL = "SELECT * FROM TB_ENDERECO";

        try {

            Connection connection = database.GetConnection();

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Endereco> enderecos = new ArrayList<>();

            while (resultSet.next()) {

                String id = resultSet.getString("id");
                String rua = resultSet.getString("rua");
                String cep = resultSet.getString("cep");
                String bairro = resultSet.getString("bairro");
                String numero = resultSet.getString("numero");
                int idUsuario = resultSet.getInt("id_Usuario");

                Endereco endereco = new Endereco(id, rua, cep, bairro, numero, idUsuario);

                enderecos.add(endereco);

            }

            System.out.println("success in select * TB_ENDERECO");

            connection.close();

            return enderecos;

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Erro: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());

            return Collections.emptyList();

        }

    }

    public List<Endereco> getEnderecosByUserId(int userId) {

        String SQL = "SELECT * FROM TB_ENDERECO WHERE id_usuario = ?";

        try {

            Connection connection = database.GetConnection();

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Endereco> enderecos = new ArrayList<>();

            while (resultSet.next()) {

                String id = resultSet.getString("id");
                String rua = resultSet.getString("rua");
                String cep = resultSet.getString("cep");
                String bairro = resultSet.getString("bairro");
                String numero = resultSet.getString("numero");
                int idUsuario = resultSet.getInt("id_Usuario");

                Endereco endereco = new Endereco(id, rua, cep, bairro, numero, idUsuario);

                enderecos.add(endereco);

            }

            System.out.println("success in select * TB_ENDERECO");

            connection.close();

            return enderecos;

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

    public void updateEndereco(Endereco endereco) {

        String SQL = "UPDATE TB_ENDERECO SET RUA = ?, CEP = ?, BAIRRO = ?, NUMERO = ? WHERE ID = ?";

        try {

            Connection connection = database.GetConnection();

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, endereco.getRua());
            preparedStatement.setString(2, endereco.getCep());
            preparedStatement.setString(3, endereco.getBairro());
            preparedStatement.setString(4,  endereco.getNumero());
            preparedStatement.setString(5, endereco.getId());

            preparedStatement.execute();

            System.out.println("success in update endereco");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());

        }

    }
}
