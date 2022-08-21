package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    @SuppressWarnings({"rawtypes", "unchecked" })
    public static void main(String[] args) {

    HashSet conjunto = new HashSet();

    conjunto.add(1.2);
    conjunto.add(true);
    conjunto.add("Teste");
    conjunto.add(1);
    conjunto.add('x');

        System.out.println("Tamanho e "+conjunto.size());

        conjunto.remove('x');
        System.out.println("Tamanho e "+conjunto.size());

        System.out.println("Contem:"+conjunto.contains('x'));
        System.out.println("Contem:"+conjunto.contains("Teste"));

        Set nums = new HashSet();

        nums.add(1);
        nums.add(2);
        nums.add(3);

        System.out.println("conjunto: "+nums);
        System.out.println("conjunto: "+conjunto);

        conjunto.addAll(nums); //União dos conjuntos
        //conjunto.retainAll(nums); //Pega só o que há em comum nos conjuntos
        System.out.println("Uniao dos conjuntos: "+conjunto);

        conjunto.clear();
        System.out.println("Clear: "+conjunto);

    }
}
