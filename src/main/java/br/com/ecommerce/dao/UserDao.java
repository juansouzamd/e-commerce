package br.com.ecommerce.dao;

import br.com.ecommerce.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDao {
    Database database = new Database();

    public void createUser(User user)
    {
        String SQL = "INSERT INTO tb_usuario (email, senha, cpf, telefone, data_nascimento, nome) VALUES (?, ?, ?, ?, ?, ?)";

        try {

            Connection connection = database.GetConnection();

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, user.getEmail());
            preparedStatement.setString(2, user.getSenha());
            preparedStatement.setString(3, user.getCpf());
            preparedStatement.setString(4, user.getTelefone());
            preparedStatement.setString(5, user.getDataNascimento());
            preparedStatement.setString(6, user.getNome());
            preparedStatement.execute();

            System.out.println("success in insert car");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }

    public boolean verifyCredentials(User user) {

        String SQL = "SELECT * FROM TB_USUARIO WHERE Email = ?";

        try {

            Connection connection = database.GetConnection();


            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, user.getEmail());
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("success in select user");

            while (resultSet.next()) {

                String password = resultSet.getString("senha");

                if (password.equals(user.getSenha())) {

                    return true;

                }

            }

            connection.close();

            return false;

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

            return false;

        }

    }
}
