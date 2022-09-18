package StrategyDesignPattern;

public class DuckMainClass {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        duck.performQuack();
        duck.performFly();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();




    }
}
