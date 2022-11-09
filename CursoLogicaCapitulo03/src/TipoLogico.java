
public class TipoLogico {
	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeira);
		
		Boolean variavelfalsa = false;
		System.out.println("Variável falsa: " + variavelfalsa);
		
		System.out.println("--------------------------------------------------------------");
		
		Integer idade = 17;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Pode tirar carteira.");
			
		} else {
			System.out.println("Não! Não pode tirar carteira.");
		}
		
		//System.out.println("Pode tirar a carteira? " + podeTirarCarteira);
	}
}
