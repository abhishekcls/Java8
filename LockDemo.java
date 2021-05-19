import java.util.concurrent.locks.*;

class Shopper2 extends Thread{
    static int balls,bats=0;

    private void addBall(){
        synchronized(this){
        balls++;
        }
    }
    private void addBat(){
        synchronized(this){
        bats++;
        addBall();
        }
    }
    public void run(){
        for(int i=1;i<=1000;i++){
            addBall();
            addBat();
        }
    }
}

public class LockDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread prethesh=new Shopper2();
        Thread rajasekhar=new Shopper2();
        prethesh.start();
        rajasekhar.start();

        prethesh.join();
        rajasekhar.join();

        System.out.println("balls "+Shopper2.balls);
        System.out.println("bats "+Shopper2.bats);
    }
}