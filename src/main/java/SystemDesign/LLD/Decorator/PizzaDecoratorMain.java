package SystemDesign.LLD.Decorator;

public class PizzaDecoratorMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BasePizza myPizza = new MushroomTopping( new ExtraCheese( new MushroomTopping( new Margherita() ) ) ) ;
		
		System.out.println( " the cost is : " + myPizza.cost() );

	} // 

}
