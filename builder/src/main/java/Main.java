public class Main {
    public static void main(String[] args) {
        Pizza pizza = new Pizza.Builder(35)
                .withDough("pan")
                .withSauce("tomatoAndBasel")
                .withCheese("mozzarella")
                .withTopping("tomato")
                .withOtherTopping("mushrooms")
                .bake();
        System.out.println(pizza.toString());
    }
}
