package round2task1;

import java.time.LocalDate;
import java.util.ArrayList;

class MyCatCafe implements CatCafe {

    //店铺余额
    private double money;
    //猫猫的列表和个数
    private ArrayList<Cat> catList = new ArrayList<>();
    public int catNumber = 0;
    //顾客的列表
    private ArrayList<Customer> customerList = new ArrayList<>();
    //今天rua猫总数，来计算利润
    private double todayRuaNumber = 0;

    public MyCatCafe(double money) {
        this.money = money;
    }

    @Override
    public void buyCat(String breed, String name, int age, String sex) {
        //因为有4种猫,接下来的代码很长.我曾想用"方法"去节省重复的代码,但发现一样很麻烦.
        if (breed.equals("Orange Cat")) {
            double price = 200;
            //检查钱够不够
            try {
                if (money < price) {
                    throw new InsufficientBalanceException();
                } else {
                    OrangeCat orangeCat = new OrangeCat(name, age, sex, price);
                    money -= price;
                    catList.add(orangeCat);
                    catNumber++;
                }
            } catch (InsufficientBalanceException e) {
                e.printStackTrace();
            }
        }

        if (breed.equals("Black Cat")) {
            double price = 350;
            try {
                if (money < price) {
                    throw new InsufficientBalanceException();
                } else {
                    BlackCat blackCat = new BlackCat(name, age, sex, price);
                    money -= price;
                    catList.add(blackCat);
                    catNumber++;
                }
            } catch (InsufficientBalanceException e) {
                e.printStackTrace();
            }
        }

        if (breed.equals("British Shorthair Cat")) {
            double price = 300;
            try {
                if (money < price) {
                    throw new InsufficientBalanceException();
                } else {
                    BritishShortHairCat britishShorthairCat = new BritishShortHairCat(name, age, sex, price);
                    money -= price;
                    catList.add(britishShorthairCat);
                    catNumber++;
                }
            } catch (InsufficientBalanceException e) {
                e.printStackTrace();
            }
        }

        if (breed.equals("Rag Doll Cat")) {
            double price = 400;
            try {
                if (money < price) {
                    throw new InsufficientBalanceException();
                } else {
                    RagDollCat ragDollCat = new RagDollCat(name, age, sex, price);
                    money -= price;
                    catList.add(ragDollCat);
                    catNumber++;
                }
            } catch (InsufficientBalanceException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void serveCustomer(String name, int customerRuaNumber) {
        try {
            if (catList.isEmpty()) {
                throw new CatNotFoundException();
            } else {
                Customer customer = new Customer(name, customerRuaNumber);
                customerList.add(customer);

                //顾客想rua几次，for就循环几次
                for (int i = 0; i < customerRuaNumber; i++) {
                    double x = Math.random() * catNumber; // x的范围是[0,已有的猫猫数)
                    int ruaWhichCat = (int) x; // n的范围是[0,已有的猫猫数)的整数
                    money += 15;
                    todayRuaNumber++;
                    System.out.println(catList.get(ruaWhichCat)); //打印被rua猫猫信息
                }
            }

        } catch (CatNotFoundException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void rest(LocalDate localDate) {
        for (Customer i : customerList) {
            //如果时间相同，就打印顾客信息
            if (i.getTime().equals(localDate)) {
                System.out.println(i);
            }
        }
        System.out.println("\nToday's profits: " + todayRuaNumber * 15); //打印今日利润，不考虑买猫的成本
        todayRuaNumber = 0;//打烊,今天rua猫总数清零
    }
}