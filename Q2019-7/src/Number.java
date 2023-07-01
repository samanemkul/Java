public class Number implements Runnable{
    @Override
    public void run() {
        for(int i=1;i<=20;i++){
            System.out.println(i);
            try{
                Thread.sleep(2000);
            }catch (InterruptedException e){
                throw new RuntimeException(e);
            }
        }
    }
}
