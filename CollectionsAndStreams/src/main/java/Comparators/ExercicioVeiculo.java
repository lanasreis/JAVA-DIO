package Comparators;

public class ExercicioVeiculo implements Comparable<ExercicioVeiculo> {
    private String modelo;
    private String marca;
    private Integer ano;
    private Double valorTabelaFipe;

    public ExercicioVeiculo(String modelo, String marca, Integer ano, Double valorTabelaFipe){
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.valorTabelaFipe = valorTabelaFipe;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getMarca(){
        return this.marca;
    }

    public Integer getAno(){
        return this.ano;
    }

    public Double getValorTabelaFipe(){
        return valorTabelaFipe;
    }

    @Override
    public String toString(){
        return this.getModelo() + " - " + this.getMarca() + " / " + this.getAno()  + "( " + this.getValorTabelaFipe() + " )";
    }

    @Override
    public int compareTo(ExercicioVeiculo o) {
        return this.getAno() - o.getAno();
    }
}
