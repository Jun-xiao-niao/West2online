package round2task1;

class OrangeCat extends Cat {

    private boolean isFat = false;//买的橘猫必不肥,肥的橘猫是被顾客喂出来的,我们之后可以用set方法来更改变量.

    public OrangeCat(String name, int age, String sex, double price) {
        super(name, age, sex, price);
        if (price != 200) {
            System.out.println("The price should be \"200\", the price is automatically set to \"200\"");
            this.price = 200;
        }
    }

    @Override
    public String toString() {
        return "Orange Cat  name: " + name +
                "\n            age: " + age +
                "\n            sex: " + sex +
                "\n            price: " + price +
                "\n            isFat: " + isFat;

    }

    public void setIsFat(boolean isFat) {
        this.isFat = isFat;
    }

    public boolean getIsFat() {
        return isFat;
    }

}