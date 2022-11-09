package br.com.softblue.loucademia.application.config;

import java.util.Scanner;

class MediaPonderada {
	
	public static void main (String args[]){
         Scanner entrada = new Scanner(System.in);      

     float nota1, nota2, nota3, media;
     float peso1 = 2;
     float peso2 = 3;
     float peso3 = 5;
      
      
     System.out.println("Digite a primeira nota: ");
     nota1 = entrada.nextFloat();
      
  

     System.out.println("Digite a segunda nota: ");
     nota2 = entrada.nextFloat();
      
     System.out.println("Digite a terceira nota: ");
     nota3 = entrada.nextFloat();
      

     media = ((nota1* peso1) +(nota2* peso2) + (nota3 *peso3)) /10;

     System.out.printf("A media do aluno é: %10.2f", media);
      
 }
}