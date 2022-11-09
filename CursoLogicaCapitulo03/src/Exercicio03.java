import java.util.Scanner;

public class Exercicio03 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite a nota do aluno: ");
		int nota = scanner.nextInt();
		
		Boolean notaAluno = nota >= 70;
		
		if(notaAluno){
			System.out.println("Você passou!");
		} else {
			System.out.println("Você não passou!");
		}
	}
}
