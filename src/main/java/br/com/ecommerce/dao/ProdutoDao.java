package br.com.ecommerce.dao;

import br.com.ecommerce.model.Produto;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProdutoDao {
    Database database = new Database();

    public List<Produto> getProdutos() {
        String SQL = "SELECT * FROM TB_PRODUTO";

        try {
            Connection connection = database.GetConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Produto> produtos = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                double preco = resultSet.getDouble("preco");
                String descricao = resultSet.getString("descricao");
                String genero = resultSet.getString("genero");
                String categoria = resultSet.getString("categoria");
                String marca = resultSet.getString("marca");
                String imagemPrincipal = resultSet.getString("imagem_principal");

                Produto produto = new Produto(id, nome, preco, descricao, genero, categoria, marca, imagemPrincipal);

                produtos.add(produto);
            }

            System.out.println("Success in SELECT TB_PRODUTO");

            connection.close();

            return produtos;

        } catch (Exception e) {
            System.out.println("Fail in database connection");
            System.out.println("Error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

    public List<Produto> getProdutosByCategoria(String categoriaValue) {
        String SQL = "SELECT * FROM TB_PRODUTO where categoria = ?;";

        try {
            Connection connection = database.GetConnection();

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setString(1, categoriaValue);
            ResultSet resultSet = preparedStatement.executeQuery();

            List<Produto> produtos = new ArrayList<>();

            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String nome = resultSet.getString("nome");
                double preco = resultSet.getDouble("preco");
                String descricao = resultSet.getString("descricao");
                String genero = resultSet.getString("genero");
                String categoria = resultSet.getString("categoria");
                String marca = resultSet.getString("marca");
                String imagemPrincipal = resultSet.getString("imagem_principal");

                Produto produto = new Produto(id, nome, preco, descricao, genero, categoria, marca, imagemPrincipal);

                produtos.add(produto);
            }

            System.out.println("Success in SELECT TB_PRODUTO");

            connection.close();

            return produtos;
        } catch (Exception e) {
            System.out.println("Fail in database connection");
            System.out.println("Error: " + e.getMessage());
            return Collections.emptyList();
        }
    }

}
