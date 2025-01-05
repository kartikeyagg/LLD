package SystemDesign.LLD.Decorator.Pizza;

public abstract class ToppingPizza extends BasePizza{
	
	protected BasePizza pizza;

	public ToppingPizza(BasePizza pizza) {
		this.pizza = pizza;
	}
	
	

}
