import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o valor do produto: ");
		Double valorProduto = scanner.nextDouble();
		
		System.out.print("Digite a quantidade do produto: ");
		Double quantidadeProduto = scanner.nextDouble();
		
		Double subTotal = valorProduto * quantidadeProduto;
		
		Double desconto = 0.0;
		
		if(quantidadeProduto > 10) {
			desconto = 10.0;
		}
		
		Double valorAposDesconto = subTotal * desconto /100;
		Double valorTotal = subTotal - desconto;
				
		System.out.println("O valor cobrado será: " + valorTotal);
	}
	
}
