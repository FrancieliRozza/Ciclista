import static org.junit.Assert.*;

import org.junit.Test;


public class CiclistaTest {
	
	
	@Test
	public void deveInterpretarValoresDeVelocidadeTempo () {
		double[] valoresInterpretados = Ciclista.interpretarValoresDeVelocidadeTempo("10.0 1.0");
		assertArrayEquals( new double[] {10.0,1.0},valoresInterpretados, 0);
	}
	
	@Test
	public void deveCalcularMediaDistanciaPorTempo () {
		double media = Ciclista.calcularVelocidadeMedia(10.0, 1.0);
		assertEquals( 10.0, media, 0);
	}
	
	@Test(expected = CiclistaException.class)
	public void deveLancarExecaoCasoValorDigitadoSeja0 () throws CiclistaException {
		Ciclista.validaValoresDeEntrada(0.0);
	}

}
