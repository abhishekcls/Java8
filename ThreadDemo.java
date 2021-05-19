public class ThreadDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(Thread.currentThread().getName());
        Runnable r = () -> {
            {
                System.out.println("Hello " + Thread.currentThread().getName());
                try {
                    for (int i = 1; i <= 5; i++) {
                        Thread.sleep(100);
                        System.out.println(i);
                    }
                } catch (InterruptedException ex) {
                }
            }
        };

        Thread t1 = new Thread(r);
        t1.setName("Rajeev");
        t1.start();

        Thread t2 = new Thread(r);
        t2.setName("Sahil");
        t1.join();
        t2.start();
        
    }
}

// Task
// Thread -> Runnable
// Lambda