package round2task1;

import static round2task3.CheckMailbox.checkMailbox;
import static round2task3.Multithreading.multiThreading;

public class Test {
    public static void main(String[] args) {
        //该程序用Java11编写
        MyCatCafe myCatCafe = new MyCatCafe(1250); //可以更改金额,如果钱小于1250,必报错,因为接下来买4只猫要花1250元.

        myCatCafe.buyCat("Orange Cat", "ice cream", 1, "female"); //买个叫"甜筒"的橘猫
        myCatCafe.buyCat("Black Cat", "doughnut", 2, "female"); //买个叫"甜甜圈"的黑猫
        myCatCafe.buyCat("British Shorthair Cat", "coke", 3, "male"); //买个叫"可乐"的英短
        myCatCafe.buyCat("Rag Doll Cat", "cookie", 4, "female"); //买个叫"饼干"的布偶猫

        System.out.println("Print cat information");//打印被rua猫猫的信息
        myCatCafe.serveCustomer("Kirara", 3);//Kirara要rua三只猫

        System.out.println("\nPrint cat information");//打印被rua猫猫的信息
        myCatCafe.serveCustomer("Nanami", 5);//Nanami要rua五只猫

        System.out.println("\nPrint customers information");//打印今天的顾客信息
        myCatCafe.rest();


        //接下来测试多线程
        System.out.println("\nTesting multithreading:");
        int[] arr1 = new int[]{1, 3, 5, 7, 9};
        int[] arr2 = new int[]{2, 4, 6, 8, 10};

        multiThreading(arr1);

        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        multiThreading(arr2);


        //测试正则表达式之前，先让多线程运行完
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //测试正则表达式
        System.out.println("\n\nTesting regular expressions");
        System.out.println(checkMailbox("hd33322@nat123.com")); //ture
        System.out.println(checkMailbox("maksim.kim.82@d-link.ua")); //ture
        System.out.println(checkMailbox("vova_lazarev1969@jaagers.com")); //ture
        System.out.println(checkMailbox("b4-service.s@zhaopinmail.com")); //ture
        System.out.println(checkMailbox("west2online.com")); //false

    }
}
