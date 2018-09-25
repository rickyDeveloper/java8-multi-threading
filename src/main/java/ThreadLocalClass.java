package main.java;

/**
 * Created by vikasnaiyar on 25/09/18.
 */
public class ThreadLocalClass implements  Runnable{

    private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>() {
        public Integer initialValue() {
            return 1;
        }
    };


    public static void main(String[] args) {

        ThreadLocalClass t1 = new ThreadLocalClass();

       // ThreadLocalClass t2 = new ThreadLocalClass();

        (new Thread(t1)).start();
        (new Thread(t1)).start();

    }


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        threadLocal.set((int) (Math.random() * 100D));

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }

        System.out.println(threadLocal.get());
    }
}
