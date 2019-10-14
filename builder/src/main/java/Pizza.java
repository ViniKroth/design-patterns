public class Pizza {

    private int size;
    private String cheese;
    private String topping;
    private String secondTopping;
    private String dough;
    private String sauce;

    public static class Builder {

        private int size;
        private String cheese;
        private String topping;
        private String secondTopping;
        private String dough;
        private String sauce;

        public Builder(int size) {
            this.size = size;
        }

        public Builder withCheese(String cheese) {
            this.cheese = cheese;
            return this;
        }

        public Builder withTopping(String topping) {
            this.topping = topping;
            return this;
        }

        public Builder withOtherTopping(String otherTopping) {
            this.secondTopping = otherTopping;
            return this;
        }

        public Builder withDough(String dough) {
            this.dough = dough;
            return this;
        }

        public Builder withSauce(String sauce) {
            this.sauce = sauce;
            return this;
        }

        public Pizza bake() {
            Pizza pizza = new Pizza();
            pizza.size = this.size;
            pizza.cheese = this.cheese;
            pizza.dough = this.dough;
            pizza.sauce = this.sauce;
            pizza.secondTopping = this.secondTopping;
            pizza.topping = this.topping;
            return pizza;
        }
    }

    private Pizza() {
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "size=" + size +
                ", cheese='" + cheese + '\'' +
                ", topping='" + topping + '\'' +
                ", secondTopping='" + secondTopping + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                '}';
    }
}
