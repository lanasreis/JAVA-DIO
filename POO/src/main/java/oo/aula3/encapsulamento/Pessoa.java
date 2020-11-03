package oo.aula3.encapsulamento;

import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
     private String nome;
     private LocalDate dataNascimento;

     public Pessoa(String nome, int dia, int mes, int ano){
          this.nome = nome;
          this.dataNascimento = LocalDate.of(ano, mes, dia);
     }

     public int calculaIdade(){
          return Period.between(dataNascimento, LocalDate.now()).getYears();
     }

     public String getNome(){
          return nome;
     }

     public LocalDate getDataNascimento(){
          return dataNascimento;
     }

     public void setNome(final String nome){
          this.nome = nome;
     }

}
