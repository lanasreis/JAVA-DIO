package oo.exercicio3;

public class Funcionario {
    private String nome;
    private double salario;

    public String getNome(){
        return nome;
    }
    public double getSalario(){
        return salario;
    }

    public void setNome(final String nome){
        this.nome = nome;
    }
    public void setSalario(final double salario){
        this.salario = salario;
    }

    public double calculaImposto(){
        return salario * 0.01;
    }
}
