package zengchao.concurrentdemo;

public class Tester {

    public static void main(String[] args) throws InterruptedException {
        ConcurrentTest concurrentTest = new ConcurrentTest();
        Thread t1 = new Thread(() -> {
            concurrentTest.add();
        });
        Thread t2 = new Thread(() -> {
            concurrentTest.add();
        });
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(concurrentTest.getCount());
    }
}
