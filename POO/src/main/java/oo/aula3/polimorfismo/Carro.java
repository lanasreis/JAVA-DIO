package oo.aula3.polimorfismo;

public class Carro extends Veiculo{
    private int qtdPortas;

    public void setQtdPortas(final int qtdPortas){
        this.qtdPortas = qtdPortas;
    }

    public double calculaValorVenal(){
        return this.getValorVenal() * 0.07;
    }
}
