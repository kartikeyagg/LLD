package SystemDesign.LLD.CompositeDesignPattern.Calculator;

public class Expression implements ArithmeticExpression {
	
	private ExpType type; 
	private ArithmeticExpression leftExp ;
	private ArithmeticExpression rightExp ;
	
	public Expression(ExpType type, ArithmeticExpression leftExp, ArithmeticExpression rightExp) {
		super();
		this.type = type;
		this.leftExp = leftExp;
		this.rightExp = rightExp;
	}

	@Override
	public double evaluate() {
		// TODO Auto-generated method stub
		
		switch (type) {
		case Plus: {
			
			return leftExp.evaluate() + rightExp.evaluate() ;
		}
		
		case Minus:{
			return leftExp.evaluate() -  rightExp.evaluate() ;
		}
		
		case Multiply :{
			return leftExp.evaluate() * rightExp.evaluate() ;
		}
		
		case Divide:{
			return leftExp.evaluate() / rightExp.evaluate() ;
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + type);
		}
		
	}
	
	
	

}
