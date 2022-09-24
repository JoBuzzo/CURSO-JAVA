package oo.composicao;

public class CarroTeste {
    public static void main(String[] args) {
        Carro c1 = new Carro();


        c1.ligar();


        System.out.println("Esta ligado? "+c1.estaLigado());
        System.out.println("Giros do motor depois de ligar: "+c1.motor.giros());

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        System.out.println("Giros do motor depois de acelerar: "+c1.motor.giros());

        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();
        c1.frear();


        System.out.println("Giros do motor depois de frear: "+c1.motor.giros());
        c1.desligar();
        System.out.println("Giros do motor depois de desligar: "+c1.motor.giros());

    }
}
