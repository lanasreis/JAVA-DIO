package statics;

public class Programa {
    public static void main(String[] args){
        final Cachorro pitbull = new Cachorro();
        pitbull.zoologia = "Bípede";
        pitbull.especie = "Homenideo";

        final Cachorro viraLata = new Cachorro();

        System.out.println(viraLata.zoologia); //mantem original
        System.out.println(viraLata.especie); //muda como pitbull

        viraLata.especie = "lobus";

        System.out.println(pitbull.especie); //muda como viralata TODOS IGUAIS

        Cachorro.late();
    }
}
