package classe;

public class ProdutoTeste {
    public static void main(String[] args){
        Produto p1 = new Produto("Camisinha", 10.99);

        var p2 = new Produto();
        p2.nome = "Gel lubrificante";
        p2.preco = 30.50;

        Produto.desconto = 0.50;

        double precoFinal1 = p1.precoComDesconto();
        double precoFinal2 = p2.precoComDesconto();
        double mediaCarrinho = (precoFinal1 + precoFinal2) / 2;

        System.out.println("Produto: "+p1.nome+"\nPreco: "+p1.preco+"\nPreco final: "+precoFinal1);
        System.out.println(" ");
        System.out.println("Produto: "+p2.nome+"\nPreco: "+p2.preco+"\nPreco final: "+precoFinal2);
        System.out.println(" ");

        System.out.printf("Media do carrinho = R$%.2f", mediaCarrinho);

    }
}
