package round2task1;

class BlackCat extends Cat{

    public BlackCat(String name, int age, String sex, double price) {
        super(name, age, sex, price);
        if (price != 350){
            System.out.println("The price should be \"350\", the price is automatically set to \"350\"");
            this.price = 350;
        }
    }

    @Override
    public String toString() {
        return "Black Cat  name: " + name +
                "\n           age: " + age +
                "\n           sex: " + sex +
                "\n           price: " + price;
    }
}