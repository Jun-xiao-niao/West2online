package round2task1;

class BritishShortHairCat extends Cat{

    public BritishShortHairCat(String name, int age, String sex, double price) {
        super(name, age, sex, price);
        if (price != 300){
            System.out.println("The price should be \"200\", the price is automatically set to \"200\"");
            this.price = 300;
        }
        }

    @Override
    public String toString() {
        return "British Shorthair Cat  name: " + name +
                "\n                       age: " + age +
                "\n                       sex: " + sex +
                "\n                       price: " + price;
    }
}