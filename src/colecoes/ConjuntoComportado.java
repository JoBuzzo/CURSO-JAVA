package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {

        Set<String> nickname = new HashSet<>();
        nickname.add("EuRenato");
        nickname.add("Rianceronte");
        nickname.add("Lulu");
        nickname.add("Biel");

        System.out.println("Nicknames: ");
        for(String candidato: nickname){
            System.out.println(candidato);
        }

        System.out.println(" ");
        SortedSet<String> nomes = new TreeSet<>();
        nomes.add("Renato");
        nomes.add("Rian");
        nomes.add("Luis");
        nomes.add("Gabriel");

        System.out.println("Nomes reais:");
        for(String nome: nomes){
            System.out.println(nome);
        }
    }
}
