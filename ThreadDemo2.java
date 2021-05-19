import java.util.concurrent.locks.ReentrantLock;
class Shopping extends Thread{
    static int balls,bats=0;

    static ReentrantLock demo=new ReentrantLock();
    private void addBall(){
        demo.lock();
        System.out.println("Lock count "+demo.getHoldCount());
        balls++;
        demo.unlock();
    }
    private void addBat(){
        demo.lock();
        bats++;
        addBall();
        demo.unlock();
    }
    public void run(){
        for(int i=1;i<=1000;i++){
            addBall();
            addBat();
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) throws InterruptedException {
        Thread roopal=new Shopping();
        Thread anita=new Shopping();

        roopal.start();
        anita.start();

        roopal.join();
        anita.join();

        System.out.println("Balls "+Shopping.balls);
        System.out.println("Bats "+Shopping.bats);
    }
}
