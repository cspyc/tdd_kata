package cn.practice.code.multithread;

/**
 * @author pi
 */
public class MyFirstThread extends Thread {
    private String name;

    public MyFirstThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(name + "...i = " + i + "...ThreadName = "
                    + Thread.currentThread().getName());
        }
    }
}
