import java.util.Scanner;


public class Ciclista {
	
	public static void main(String[] args) throws CiclistaException{
		Scanner entrada = new Scanner(System.in);
		
		while (true) {
			System.out.println("Digite a distancia percorrida em Km e o tempo gasto em horas");
			String valoresEntrada = entrada.nextLine();
			double[] valoresInterpretados = interpretarValoresDeVelocidadeTempo(valoresEntrada);//esse metodo recebe como parametro valores de entrada que é o valor que o usuario digitou e armazena em uma variavel valoresInterpretados que recebe esse valor
			validaValoresDeEntrada(valoresInterpretados[1]);
			double media = calcularVelocidadeMedia(valoresInterpretados[0], valoresInterpretados[1]);
			System.out.println("Velocidade média " + media);
		}
	}
	
	
	public static double[] interpretarValoresDeVelocidadeTempo(String valoresEntrada) {
		
		String valoresSeparados[] = valoresEntrada.split(" ");
		double distancia = Double.parseDouble(valoresSeparados[0]);
		double tempo = Double.parseDouble(valoresSeparados[1]);
		double[] valoresInterpretados = {distancia,tempo};
		
		return valoresInterpretados;
	}
	
	
	public static double calcularVelocidadeMedia (double distancia, double tempo){
		
		double media = (distancia / tempo);
		
		return media;
	}
	
	public static void validaValoresDeEntrada (double tempo) throws CiclistaException{
		
		if(tempo == 0){
			throw new CiclistaException("O tempo não pode ser igual a 0");
		}
		
	}


}
