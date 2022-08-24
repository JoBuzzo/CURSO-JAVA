package oo.composicao;

public class CompraTeste {
    public static void main(String[] args) {
        Compra compra1 = new Compra();
        compra1.cliente = "João";
        compra1.adicionarItem("Caneta", 4, 7.45);
        compra1.adicionarItem("Borracha", 1, 2.50);
        compra1.adicionarItem(new Item("Caderno", 2, 20.00));

        System.out.println(compra1.itens.size());
        System.out.println(compra1.obterValorTotal());
    }
}
