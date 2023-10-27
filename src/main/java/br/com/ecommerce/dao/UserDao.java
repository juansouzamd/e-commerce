package br.com.ecommerce.dao;

import br.com.ecommerce.model.Usuario;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UserDao {
    Database database = new Database();

    public void createUser(Usuario usuario)
    {
        String SQL = "INSERT INTO tb_usuario (email, senha, cpf, telefone, data_nascimento, nome) VALUES (?, ?, ?, ?, ?, ?)";

        try {

            Connection connection = database.GetConnection();

            System.out.println("success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, usuario.getEmail());
            preparedStatement.setString(2, usuario.getSenha());
            preparedStatement.setString(3, usuario.getCpf());
            preparedStatement.setString(4, usuario.getTelefone());
            preparedStatement.setString(5, usuario.getDataNascimento());
            preparedStatement.setString(6, usuario.getNome());
            preparedStatement.execute();

            System.out.println("success in insert car");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");

        }
    }
}
