package oo.aula3.polimorfismo;

public class Motocicleta extends Veiculo {
    private String cilindradas;

    public void setCilindradas(final String cilindradas){
        this.cilindradas = cilindradas;
    }

    public double calculaValorVenal(){
        return this.getValorVenal() * 0.03;
    }
}
