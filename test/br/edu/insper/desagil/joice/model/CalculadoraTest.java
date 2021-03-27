package br.edu.insper.desagil.joice.model;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	private static double DELTA = 0.05;
	private Calculadora calc;
	
	@Nested
	class CCC{
		
		@BeforeEach
		public void setUp() {
			calc = new CalculadoraCCC();
		}
		
		@Test
		void test_niobio() {
			assertEquals(8.57, calc.calcula(92.91, 0.143), DELTA);
		}
		
		@Test
		void test_tungstenio() {
			assertEquals(19.28, calc.calcula(183.84, 0.137), DELTA);
		}
		
		@Test
		void test_litio() {
			assertEquals(0.53, calc.calcula(6.94, 0.152), DELTA);
		}
	}
	
	@Nested
	class CFC{
		
		@BeforeEach
		public void setUp() {
			calc = new CalculadoraCFC();
		}
		
		@Test
		void test_cobre() {
			assertEquals(8.89, calc.calcula(63.55, 0.128), DELTA);
		}
		
		@Test
		void test_ouro() {
			assertEquals(19.36, calc.calcula(196.97, 0.144), DELTA);
		}
		
		@Test
		void test_prata() {
			assertEquals(10.60, calc.calcula(107.87, 0.144), DELTA);
		}
		
	}
	
}

