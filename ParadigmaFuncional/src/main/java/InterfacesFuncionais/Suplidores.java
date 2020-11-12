package InterfacesFuncionais;

import java.util.function.Supplier;

public class Suplidores {
    /*
        Não recebe parâmetro, retorna de acordo com
    */
    public static void main(String[] args) {
        Supplier<Pessoa> instanciaPessoa = Pessoa::new;//() -> new Pessoa();
        System.out.println(instanciaPessoa.get());
    }
}

class Pessoa{
    private String nome;
    private Integer idade;

    public Pessoa(){
        nome = "Alana";
        idade = 23;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s, Idade: %d", nome, idade);
    }
}
