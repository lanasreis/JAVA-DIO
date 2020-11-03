package oo.exercicio3;

public class Programa {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        Atendente atendente = new Atendente();
        Supervisor supervisor = new Supervisor();

        atendente.setNome("Alana");
        atendente.setSalario(2500.0);
        gerente.setNome("Adriano");
        gerente.setSalario(6700.0);
        supervisor.setNome("Denise");
        supervisor.setSalario(6700.0);

        System.out.println("Imposto (A): " + atendente.calculaImposto() +           " | (B): " + gerente.calculaImposto() + " | (C): " +                    supervisor.calculaImposto());
    }
}
