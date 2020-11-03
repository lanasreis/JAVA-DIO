package oo.exercicio2;

public class Carro {
    private String marca;
    private String modelo;
    private Integer ano;
    private String variante;

    public Carro(final String marca, final String modelo, final Integer ano){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void setVariante(final String variante){
        this.variante = variante;
    }


}
