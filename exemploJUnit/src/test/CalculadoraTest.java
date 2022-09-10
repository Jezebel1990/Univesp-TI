package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Calculadora;


public class CalculadoraTest {

	@Test
public void testAdicao() {
		float PassaValor1 =1;
		float PassaValor2 =2;
		float RetornoEsperado = 3; 
		float RetornoObtido = Calculadora.adicao(PassaValor1, PassaValor2);
		assertEquals(RetornoEsperado,RetornoObtido,0);
	}

	@Test
	public void testAdicao2() {
	float PassaValor1 = 0;
	float PassaValor2 = 0;
	float RetornoEsperado = 0;
	float RetornoObtido = Calculadora.adicao(PassaValor1, PassaValor2);
	assertEquals(RetornoEsperado,RetornoObtido,0);
}
	
	@Test
	public void testAdicao3() {
	float PassaValor1 = -10;
	float PassaValor2 = -20;
	float RetornoEsperado = -30;
	float RetornoObtido = Calculadora.adicao(PassaValor1, PassaValor2);
	assertEquals(RetornoEsperado,RetornoObtido,0);
}
	
	@Test
public	void testSubtracao() {
		float PassaValor1 = 25;
		float PassaValor2 = 5;
		float RetornoEsperado = 20;
		float RetornoObtido = Calculadora.subtracao(PassaValor1, PassaValor2);
		assertEquals(RetornoEsperado,RetornoObtido,0);
	}

	@Test
public	void testSubtracao2() {
		float PassaValor1 = -15;
		float PassaValor2 = 5;
		float RetornoEsperado = -20;
		float RetornoObtido = Calculadora.subtracao(PassaValor1, PassaValor2);
		assertEquals(RetornoEsperado,RetornoObtido,0);
	}
	
	
	@Test
public	void testMultiplicacao() {
		float PassaValor1 =3;
		float PassaValor2 =5;
		float RetornoEsperado =15;
		float RetornoObtido = Calculadora.multiplicacao(PassaValor1, PassaValor2);
	    assertEquals(RetornoEsperado,RetornoObtido,0);
	}
	
	@Test
	public	void testMultiplicacao2() {
			float PassaValor1 =10;
			float PassaValor2 =0;
			float RetornoEsperado =0;
			float RetornoObtido = Calculadora.multiplicacao(PassaValor1, PassaValor2);
		    assertEquals(RetornoEsperado,RetornoObtido,0);
		}

	@Test
public void testDivisao() {
		float PassaValor1 = 100;
		float PassaValor2 = 2;
		float RetornoEsperado = 50;
		float RetornoObtido = Calculadora.divisao(PassaValor1, PassaValor2);
		assertEquals(RetornoEsperado,RetornoObtido,0);
	}

	@Test
	public void testDivisao2() {
			float PassaValor1 = 75;
			float PassaValor2 = 3;
			float RetornoEsperado = 25;
			float RetornoObtido = Calculadora.divisao(PassaValor1, PassaValor2);
			assertEquals(RetornoEsperado,RetornoObtido,0);
		}
	
}
