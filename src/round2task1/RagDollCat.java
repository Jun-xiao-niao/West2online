package round2task1;

class RagDollCat extends Cat {

    public RagDollCat(String name, int age, String sex, double price) {
        super(name, age, sex, price);
        if (price != 400) {
            System.out.println("The price should be \"400\", the price is automatically set to \"400\"");
            this.price = 400;
        }
    }

    @Override
    public String toString() {
        return "Rag Doll Cat  name: " + name +
                "\n              age: " + age +
                "\n              sex: " + sex +
                "\n              price: " + price;
    }
}