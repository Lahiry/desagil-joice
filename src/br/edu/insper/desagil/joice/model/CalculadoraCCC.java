package br.edu.insper.desagil.joice.model;

public class CalculadoraCCC extends Calculadora{
	
	public CalculadoraCCC() {
		super("CCC");
	}

	@Override
	public double calcula(double peso, double raio) {
		
		Double raioCm = raio * Math.pow(10, -7);
		Double ma = 2.0 * peso;
		Double Na = 6.023 * Math.pow(10, 23);
		Double Vc = Math.pow((4.0 * raioCm / Math.sqrt(3)), 3);
		
		Double densidade = ma / (Na  * Vc);
		
		return densidade;
	}
	
}
