package br.com.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private static List<CarrinhoItem> carrinho = new ArrayList<>();
    private static double total;

    public static List<CarrinhoItem> getCarrinho() {
        return carrinho;
    }

    public static void adicionarItem(CarrinhoItem item) {

        for (CarrinhoItem existingItem : carrinho) {
            if (existingItem.getIdProduto() == item.getIdProduto()) {
                // Se o produto já estiver no carrinho, apenas atualizar a quantidade
                existingItem.setQuantidade(existingItem.getQuantidade() + item.getQuantidade());
                atualizarTotal(item.getQuantidade(), item.getPreco());
                return; // Sair do método após atualizar a quantidade
            }

        }
        System.out.println("Atualizar fora do foreach");
        atualizarTotal(item.getQuantidade(), item.getPreco());

        carrinho.add(item);
    }

//        private void atualizarTotal()
//        {
//            for (CarrinhoItem item : carrinho) {
//                if(item.getQuantidade() > 1)
//                {
//                    total += item.getPreco() * item.getQuantidade();
//                }
//                else {
//                    total += item.getPreco();
//                }
//            }
//        }

    private static void atualizarTotal(int qtd, double preco)
    {
        total += preco * qtd;
        System.out.println("Total Atualizado: " + total);
    }

    public static void logItens()
    {
        carrinho.forEach(c -> System.out.println("Itens carrinho, produtoId: " + c.getIdProduto() + " quantidade: " + c.getQuantidade() + " Preco:" + c.getPreco()));
        System.out.println("Preco Total: " + total);
    }

    public static void limparCarrinho()
    {
        carrinho.clear();
    }
}
