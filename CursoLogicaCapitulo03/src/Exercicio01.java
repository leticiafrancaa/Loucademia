import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {
	
	Scanner scanner = new Scanner (System.in);
	
	System.out.print("Digite um numer para que seja calculada a potência dele: ");
	int numeroPotencia = scanner.nextInt();
	
	int resultado = numeroPotencia * numeroPotencia;
	
	System.out.println("Resultado da potencia é: " +resultado);
}
}
