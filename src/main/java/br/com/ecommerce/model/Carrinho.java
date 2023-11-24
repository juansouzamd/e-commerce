package br.com.ecommerce.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    public static void setCarrinhoItems(List<CarrinhoItem> carrinhoItems) {
        Carrinho.carrinhoItems = carrinhoItems;
    }

    private static List<CarrinhoItem> carrinhoItems = new ArrayList<>();
    private static double total;

    public static double getTotal() {
        BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);

        // Obtém o número arredondado como double
        double numeroArredondado = bd.doubleValue();
        return numeroArredondado;
    }

    public static void setTotal(double total) {
        Carrinho.total = total;
    }
    public static List<CarrinhoItem> getCarrinhoItems() {
        return carrinhoItems;
    }

    public static void adicionarItem(CarrinhoItem item) {

        for (CarrinhoItem existingItem : carrinhoItems) {

            if (existingItem.getIdProduto() == item.getIdProduto()) {
                // Se o produto já estiver no carrinho, apenas atualizar a quantidade
                existingItem.setQuantidade(existingItem.getQuantidade() + item.getQuantidade());

                existingItem.setSubTotal(existingItem.getPreco() * existingItem.getQuantidade());

               atualizarTotal(item.getQuantidade(), item.getPreco());
                return;
            }

        }
        item.setSubTotal(item.getPreco() * item.getQuantidade());
        atualizarTotal(item.getQuantidade(), item.getPreco());

        carrinhoItems.add(item);
    }

    public static void removerItem(int id, double subTotal)
    {
        carrinhoItems.removeIf(item -> item.getIdProduto() == id);
        total -= subTotal;
    }
    private static void atualizarTotal(int qtd, double preco)
    {
        total += preco * qtd;
        System.out.println("Total Atualizado: " + total);
    }

    public static void logItens()
    {
        carrinhoItems.forEach(c -> System.out.println("Itens carrinho, produtoId: " + c.getIdProduto() + " quantidade: " + c.getQuantidade() + " Preco:" + c.getPreco()));
        System.out.println("Preco Total: " + total);
    }

    public static void limparCarrinho()
    {
        System.out.println("Limpando carrinho");
        total = 0;
        carrinhoItems.clear();
    }

    public static boolean isEmpty(){
        return carrinhoItems.isEmpty();
    }
}
