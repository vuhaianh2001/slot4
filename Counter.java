package My;

public class Counter {
    int value;
    public  void count(){
        value = 0;
        while (value < 10) {
            System.out.println("Count: " + (value));
 pause(300);
        }
    }
    public void countdown(){
        value = 10;
        while (value >= 0) {
            System.out.println("Countdown:" + (value--));
            pause(200);
        }
    }
    private void pause(long time){
        try{
            Thread.sleep(time);

        }catch (InterruptedException e){}
    }
}
