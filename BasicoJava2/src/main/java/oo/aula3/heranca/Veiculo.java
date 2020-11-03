package oo.aula3.heranca;

public class Veiculo {
    private String modelo;
    private String marca;

    public void setModelo(final String modelo){
        this.modelo = modelo;
    }
    public void setMarca(final String marca){
        this.marca = marca;
    }

    public void acelera(){
        System.out.println("Acelerando ...");
    }
}
