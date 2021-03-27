package br.edu.insper.desagil.joice.model;

public class CalculadoraCFC extends Calculadora {
	
	public CalculadoraCFC() {
		super("CFC");
	}

	@Override
	public double calcula(double peso, double raio) {
		
		Double raioCm = raio * Math.pow(10, -7);
		Double ma = 2.0 * peso;
		Double Na = 6.023 * Math.pow(10, 23);
		Double Vc = 8 * Math.pow(raioCm, 3) * Math.sqrt(2);
		
		Double densidade = ma / (Na  * Vc);
		
		return densidade;
		
	}
}
