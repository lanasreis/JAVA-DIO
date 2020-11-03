package oo.aula3.polimorfismo;

public class Veiculo {
    private String modelo;
    private String marca;
    private double valorVenal;

    public void setModelo(final String modelo){
        this.modelo = modelo;
    }
    public void setMarca(final String marca){
        this.marca = marca;
    }

    public void acelera(){
        System.out.println("Acelerando ...");
    }

    public void setValorVenal(final double valorVenal){
        this.valorVenal = valorVenal;
    }
    public double getValorVenal(){
        return valorVenal;
    }
    public double calculaValorVenal(){
        return valorVenal * 0.01;
    }
}
