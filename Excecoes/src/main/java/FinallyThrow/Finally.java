package FinallyThrow;

public class Finally {
    /*
        É um bloco de código que pode ou não ser utilizado junto ao try cath, este trecho de código sempre será executado independentemente se ocorrer erro ou não dentro do fluxo onde existe o try cath. Normalmente o finally é usado para liberar recursos ou para dar continuidade em um fluxo que deve ocorrer independente de erro

    public static void main(String[] args) {
        try {
            PreparedStatement stmt = con.prepareStatement(query);
            //...
        } catch (SQLException e){
            throw new AcessoADadosException("Problema na criação de Statement", e);
        }
        finally {
            stmt.close();
        }
    }*/
}
