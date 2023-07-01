import java.util.Vector;

public class Multi extends Thread{
    @Override
    public synchronized void run() {
        for(int i=0;i<5;i++){
            System.out.println("Sama");
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
class process2 extends Thread{
    @Override
    public  void run() {
        for(int i=0;i<5;i++){
            System.out.println("Lubhoo");
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){
                throw new  RuntimeException(e);
            }
        }
    }
}

