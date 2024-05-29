public class ExtraMeyoniBurger extends BurgerDecorator{

    private Burger burger;


    public ExtraMeyoniBurger(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+"  with extra meyonise";
    }

    @Override
    public double getCost() {
        return burger.getCost()+10;
    }
}
