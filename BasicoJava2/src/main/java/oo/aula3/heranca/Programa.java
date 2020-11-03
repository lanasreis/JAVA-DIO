package oo.aula3.heranca;

public class Programa {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Motocicleta moto = new Motocicleta();

        carro.setModelo("Ford Ka");
        carro.setMarca("Ford");
        carro.setQtdPortas(4);
        carro.acelera();
        //carro.setCilindradas("125);   //Não existe

        moto.setModelo("Titan");
        moto.setMarca("Yamaha");
        moto.setCilindradas("125");
        moto.acelera();
        //moto.setQtdPortas(0);         //Não existe
    }
}
