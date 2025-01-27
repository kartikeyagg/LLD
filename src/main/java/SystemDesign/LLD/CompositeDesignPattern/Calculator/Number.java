package SystemDesign.LLD.CompositeDesignPattern.Calculator;

public class Number implements ArithmeticExpression {
	
	private double num;

	public Number(double num) {
		super();
		this.num = num;
	}

	@Override
	public double evaluate() {
		// TODO Auto-generated method stub
		return num ;
	} 
	
	

}
