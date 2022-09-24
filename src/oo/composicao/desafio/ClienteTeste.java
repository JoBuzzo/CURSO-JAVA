package oo.composicao.desafio;

public class ClienteTeste {
    public static void main(String[] args) {

        Compra compra1 = new Compra();
        compra1.adicionarItem("Caneta", 5, 2);
        compra1.adicionarItem(new Produto("Notebook", 6000), 1);

        Compra compra2 = new Compra();
        compra2.adicionarItem("Caneta", 9.67, 1);
        compra2.adicionarItem(new Produto("Notebook", 6000), 1);

        Cliente cliente = new Cliente("Maria Julia Moraes");
        cliente.compras.add(compra1);
        cliente.adicionarCompra(compra2);

        System.out.println(cliente.obterValorTotal());
    }
}
