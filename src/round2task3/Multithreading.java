package round2task3;

public class Multithreading {

    public static void multiThreading(int[] s) {
        Thread t = new Thread() {
            public void run() {
                for (int i = 0; i < s.length; i++) {
                    System.out.print(s[i]+"  ");
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                }
            }
        };
        t.start();
    }
}
