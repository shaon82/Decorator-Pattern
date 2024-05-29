public class Main {
    public static void main(String[] args) {

        Burger burger = new ZingerBurger();
        System.out.println(burger.getDescription()+" , "+burger.getCost());

        burger = new ExtraCheesBurger(burger);
        System.out.println(burger.getDescription()+" , "+burger.getCost());


        burger = new ExtraMeyoniBurger(burger);
        System.out.println(burger.getDescription()+" , "+burger.getCost());

    }
}