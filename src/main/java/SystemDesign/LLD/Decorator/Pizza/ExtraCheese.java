package SystemDesign.LLD.Decorator.Pizza;

public class ExtraCheese extends ToppingPizza {

	public ExtraCheese(BasePizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.pizza.cost() + 20;
	}

}
