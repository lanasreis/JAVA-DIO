package oo.exercicio3;

public class Supervisor extends Funcionario{
    public String subordinados[];

    public double calculaImposto(){
        return this.getSalario() * 0.05;
    }
}
