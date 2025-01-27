package SystemDesign.LLD.CompositeDesignPattern.Calculator;

public class CalculatorLauncher {
	
	
	public static void main(String[] args) {
		
		
		Number num1 = new Number(40 ) ;
		
		Number num2 =  new Number(90) ;
		
		Number num3 =  new Number(3) ;
		
		Expression exp2 =  new Expression(ExpType.Divide, num2, num3) ; 
		
		Expression exp1  = new Expression(ExpType.Plus, num1, exp2) ;
		
		System.out.println(exp1.evaluate());
		
		
	}
	
	
}
