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
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());

        }
    }

    public User getUser(String email, String password) {

        User user = new User();
        String SQL = "SELECT * FROM TB_USUARIO WHERE Email = ? AND Senha = ?";

        try {

            Connection connection = database.GetConnection();


            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("success in select user");

            while (resultSet.next()) {
                user.setSenha(resultSet.getString("senha"));
                user.setTelefone(resultSet.getString("telefone"));
                user.setId(resultSet.getInt("id"));
                user.setCpf(resultSet.getString("cpf"));
                user.setEmail(resultSet.getString("email"));
                user.setDataNascimento(resultSet.getString("data_nascimento"));
            }

            connection.close();

            return user;

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return user;
    }

    public boolean verifyCredentials(String email, String password) {
        Boolean isValid = false;
        String SQL = "SELECT * FROM TB_USUARIO WHERE Email = ?";

        try {

            Connection connection = database.GetConnection();


            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, email);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("success in select user");

            while (resultSet.next()) {

                String passwordFromTable = resultSet.getString("senha");
                System.out.println("Senha banco: " + passwordFromTable);
                System.out.println("Senha usuario: " + password);

                if (passwordFromTable.equals(password)) {
                    isValid = true;
                    System.out.println("Caiu no if");
                }

            }

            connection.close();

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());
        }
        return isValid;
    }

    public User getUserById(int id) {

        User user = new User();
        String SQL = "SELECT * FROM TB_USUARIO WHERE Id = ?";

        try {

            Connection connection = database.GetConnection();


            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();

            System.out.println("success in select user");

            while (resultSet.next()) {

                user.setSenha(resultSet.getString("senha"));
                user.setTelefone(resultSet.getString("telefone"));
                user.setId(resultSet.getInt("id"));
                user.setCpf(resultSet.getString("cpf"));
                user.setEmail(resultSet.getString("email"));
                user.setDataNascimento(resultSet.getString("data_nascimento"));
                user.setNome(resultSet.getString("nome"));
            }

            connection.close();

            return user;

        } catch (Exception e) {

            System.out.println("Error: " + e.getMessage());

        }

        return user;
    }


}
