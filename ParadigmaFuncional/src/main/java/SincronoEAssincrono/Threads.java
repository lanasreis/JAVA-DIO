package SincronoEAssincrono;


public class Threads {
    /*
        Thread é um pequeno programa que trabalha como um subsistema, sendo uma forma de um processo se autodividir em duas ou mais tarefas.
        Essas tarefas míltiplas podem ser executadas simultam=neamente para rodar mais rápido do que um programa em um único bloco ou praticamente juntas
    */
    public static void main(String[] args) {
//        BarraDeCarregamento3 barraDeCarregamento3 = new BarraDeCarregamento3();
//        BarraDeCarregamento2 barraDeCarregamento2 = new BarraDeCarregamento2();
//
//        barraDeCarregamento2.start();
//        barraDeCarregamento3.start();
//
//        Thread thread = new Thread(new BarraDeCarregamento());
//        Thread thread1 = new Thread(new GeraPDF());

//        thread.run();
//        thread1.run();
//        System.out.println("Nome da thread: " + thread1.getName());
//        System.out.println("Nome da thread: " + thread.getName());

        GeraPDF2 geraPDF2 = new GeraPDF2();
        Barra2DeCarregamento barra2DeCarregamento = new Barra2DeCarregamento(geraPDF2);

        geraPDF2.start();
        barra2DeCarregamento.start();
    }
}

class GeraPDF implements Runnable{
    @Override
    public void run(){
        System.out.println("GerarPDF");
    }
}

class BarraDeCarregamento implements Runnable{
    @Override
    public void run(){
        System.out.println("Loading...");
    }
}

class GeraPDF2 extends Thread{
    @Override
    public void run(){
        try {
            System.out.println("Iniciar Geração de PDF:");
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("GerarPDF2");
    }
}

class Barra2DeCarregamento extends Thread{
    private Thread geraPDF2;

    public Barra2DeCarregamento(Thread geraPDF2){
        this.geraPDF2 = geraPDF2;
    }

    @Override
    public void run(){
        while (true){
            try {
                Thread.sleep(500);
                if (!geraPDF2.isAlive()){
                    break;
                }
                System.out.println("Loading2...");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}


class BarraDeCarregamento2 extends Thread{
    @Override
    public void run(){
        super.run();

        try {
            Thread.sleep(8000);
            System.out.println("Rodei Barra 2 após 5000 milissegundos: " + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}

class BarraDeCarregamento3 extends Thread{
    @Override
    public void run(){
        super.run();

        try {
            Thread.sleep(1000);
            System.out.println("Rodei Barra 3 após 1000 milissegundos: " + this.getName());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
