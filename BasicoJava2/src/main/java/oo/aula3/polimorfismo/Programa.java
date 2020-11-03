package oo.aula3.polimorfismo;

public class Programa {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Motocicleta moto = new Motocicleta();
        Veiculo generico = new Veiculo();

        generico.setValorVenal(5000.0);
        System.out.println("Imposto generico: " + generico.calculaValorVenal());

        carro.setModelo("Ford Ka");
        carro.setMarca("Ford");
        carro.setQtdPortas(4);
        carro.setValorVenal(5000.0);
        System.out.println("Imposto carro: " + carro.calculaValorVenal());
        carro.acelera();
        //carro.setCilindradas("125);   //Não existe

        moto.setModelo("Titan");
        moto.setMarca("Yamaha");
        moto.setCilindradas("125");
        moto.setValorVenal(5000.0);
        System.out.println("Imposto moto: " + moto.calculaValorVenal());
        moto.acelera();
        //moto.setQtdPortas(0);         //Não existe
    }
}
