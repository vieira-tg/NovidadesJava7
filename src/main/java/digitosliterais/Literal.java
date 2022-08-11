package digitosliterais;

public class Literal {
	public static void main(String[] args) {
	
		Long numeroPopulacaoSp = 11_000_000l;
		Long numeroPopulacaoRj = 12_000_000l;
		Long diferencaPopulcao = numeroPopulacaoRj - numeroPopulacaoSp;
		
		System.out.println("Diferença de população entre RJ e SP: " + diferencaPopulcao );
	}
}
