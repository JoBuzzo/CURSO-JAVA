package classe;

public class ValorVsReferencia {
    public static void main(String[] args) {
        double a = 2;
        double b = a; //attribution por valor

        a++;
        b--;

        //os valores mudam
        System.out.println(a + "___" + b);


        Data d1 = new Data(11, 10, 2003 );
        Data d2 = d1; // atribuição por referência

        d1.dia = 31;
        d2.mes = 15;

        //Os valores continuam os mesmos
        System.out.println(d1.obterFormaData());
        System.out.println(d2.obterFormaData());



        voltarDataParaValorPadrao(d1);
        System.out.println(d1.obterFormaData());
        System.out.println(d2.obterFormaData());


        //nao muda o valor!!
        int c = 5;
        alterarPrimitivo(c);
        System.out.println(c);
    }

    static void voltarDataParaValorPadrao(Data d){
        d.dia = 1;
        d.mes = 1;
        d.ano = 1970;
    }
    static void alterarPrimitivo(int a){
        a++;
    }
}
