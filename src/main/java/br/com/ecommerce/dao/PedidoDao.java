package br.com.ecommerce.dao;

import br.com.ecommerce.model.Pedido;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class PedidoDao {
    Database database = new Database();

    public void savePedido(Pedido pedido)
    {
        String SQL = "INSERT INTO TB_PEDIDO (imagem, produto, quantidade, preco, total, estimativa_entrega, idUsuario) VALUES (?, ?, ?, ?, ?, ?, ?)";

        try {

            Connection connection = database.GetConnection();

            System.out.println("Success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);

            preparedStatement.setString(1, pedido.getImagem());
            preparedStatement.setString(2, pedido.getProduto());
            preparedStatement.setInt(3, pedido.getQuantidade());
            preparedStatement.setDouble(4, pedido.getPreco());
            preparedStatement.setDouble(5, pedido.getSubTotal());
            preparedStatement.setString(6, pedido.getEstimativaEntrega());
            preparedStatement.setInt(7, pedido.getIdUsuario());

            preparedStatement.execute();

            System.out.println("Success in insert Pedido");

            connection.close();

        } catch (Exception e) {

            System.out.println("fail in database connection");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Error: " + e.getCause());

        }
    }

    public List<Pedido> getPedidosByUserId(int userId) {

        String SQL = "SELECT * FROM TB_PEDIDO WHERE idUsuario = ?";

        try {

            Connection connection = database.GetConnection();

            System.out.println("Success in database connection");

            PreparedStatement preparedStatement = connection.prepareStatement(SQL);
            preparedStatement.setInt(1, userId);

            ResultSet resultSet = preparedStatement.executeQuery();

            List<Pedido> pedidos = new ArrayList<>();

            while (resultSet.next()) {

                int id = resultSet.getInt("id");
                String imagem = resultSet.getString("imagem");
                String produto = resultSet.getString("produto");
                int quantidade = resultSet.getInt("quantidade");
                double preco = resultSet.getDouble("preco");
                double total = resultSet.getDouble("total");
                String estimativaEntrega = resultSet.getString("estimativa_entrega");
                int idUsuario = resultSet.getInt("idUsuario");
                String endereco = "Rua tal";

                Pedido pedido = new Pedido(id, imagem, produto, quantidade, preco, total, estimativaEntrega, idUsuario, endereco);

                pedidos.add(pedido);

            }

            System.out.println("Success in select * TB_PEDIDO");

            connection.close();

            return pedidos;

        } catch (Exception e) {

            System.out.println("Fail in database connection");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Cause: " + e.getCause());

            return Collections.emptyList();

        }

    }
}
