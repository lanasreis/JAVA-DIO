package oo.exercicio1;

public class Carro {
    public String nomeCar;
    public String marcaCar;
    private String placa;
    public Integer capacidadeDoCarro = 0;
    public Integer qtdPessoas = 0;

    public Carro (final String nomeCar, final String marcaCar, final String placa, final Integer capacidadeDoCarro){
        this.nomeCar = nomeCar;
        this.marcaCar = marcaCar;
        this.placa = placa;
        this.capacidadeDoCarro = capacidadeDoCarro;
    }

    public Integer adicionarPessoas(final Integer qtd){
        if ((qtdPessoas + qtd) <= capacidadeDoCarro){
            this.qtdPessoas += qtd;
            return 1;
        }
        else{
            return 0;
        }
    }

    public void removerPessoas(final Integer qtd){
        this.qtdPessoas -= qtd;
        if(this.qtdPessoas < 0){
            this.qtdPessoas = 0;
        }
    }

    public Integer qtdDePessoa(){
        return qtdPessoas;
    }



}
