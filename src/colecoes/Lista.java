package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();


        lista.add(new Usuario("Pedro"));
        lista.add(new Usuario("João"));
        lista.add(new Usuario("Laiza"));
        lista.add(new Usuario("Heitor"));
        lista.add(new Usuario("Rosimeire"));
        lista.add(new Usuario("Wander"));

        for (Usuario u: lista){
            System.out.println(u.nome);
        }


        System.out.println("\n"+lista.get(1)); //acessar pelo indice
    }
}
