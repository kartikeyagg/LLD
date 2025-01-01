package SystemDesign.LLD.Decorator;

public class MushroomTopping extends ToppingPizza{

	public MushroomTopping(BasePizza pizza) {
		super(pizza);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return this.pizza.cost() + 15;
	}

}
