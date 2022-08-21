package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<Integer, String> usuarios = new HashMap<>();
        usuarios.put(1, "Jobson");
        usuarios.put(2, "Robson");
        usuarios.put(3, "Fobson");
        usuarios.put(4, "Tobson");

        System.out.println(usuarios.size());

        //System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());

        System.out.println(usuarios.values());

        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(2));
        System.out.println(usuarios.remove(3));
        System.out.println(usuarios.containsValue("Robson"));

        System.out.println(usuarios.get(2));

        for(int id: usuarios.keySet()){
            System.out.println(id);
        }
        for(String valor: usuarios.values()){
            System.out.println(valor);
        }

        for (Map.Entry<Integer, String> registro: usuarios.entrySet()){
            System.out.print(registro.getKey()+" => ");
            System.out.println(registro.getValue());
        }
    }
}
