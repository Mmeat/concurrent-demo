package zengchao.concurrentdemo;


public class ConcurrentTest {

    private long count = 0;

    public void add(){
        for (int i = 0; i < 100000; i++) {
            count ++ ;
        }
    }

    public long getCount() {
        return count;
    }
}
