public class ExtraCheesBurger extends BurgerDecorator{

    private Burger burger;


    public ExtraCheesBurger(Burger burger){
        this.burger = burger;
    }

    @Override
    public String getDescription() {
        return burger.getDescription()+"  with extra cheese";
    }

    @Override
    public double getCost() {
        return burger.getCost()+30;
    }
}
