package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
    public static void main(String[] args) {
        Deque<String> livros = new ArrayDeque<>();

        livros.add("As cronicas de gelo e fogo");
        livros.push("Don Quixote");
        livros.push("O Hobbit");

        System.out.println(livros.peek());
        System.out.println(livros.element());

//        System.out.println(livros.pop())

        System.out.println("\nForeach");
        for (String livro: livros){
            System.out.println(livro);
        }
    }
}
