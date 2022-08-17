package classe;

public class DataTeste {
    public static void main(String[] args){
        Data d1 = new Data();

        Data d2 = new Data(31, 10, 2003);

        System.out.println(d1.obterFormaData());
        System.out.println(d2.obterFormaData());


    }
}
