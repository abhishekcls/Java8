import java.util.concurrent.locks.ReentrantLock;

class Shopper extends Thread{
    static int balls,bats=0;
    static ReentrantLock demo=new ReentrantLock();

    private void addBall(){
        demo.lock();
        //System.out.println("Lock count "+demo.getHoldCount());
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

public class ReentrantLockDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread prethesh=new Shopper();
        Thread rajasekhar=new Shopper();
        prethesh.start();
        rajasekhar.start();

        prethesh.join();
        rajasekhar.join();

        System.out.println("balls "+Shopper.balls);
        System.out.println("bats "+Shopper.bats);
    }
}