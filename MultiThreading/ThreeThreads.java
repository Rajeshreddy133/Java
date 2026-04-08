
class GoodMorning extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("Good Morning");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted Exceptioon Occurred");
        }
    }
}
class HelloThread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("Hello ...");
                Thread.sleep(2000);
            }
        }catch(InterruptedException e){
            System.out.println("InterruptedException Occurred ");
        }
    }
}
class WelcomeThread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("Welcome ");
                Thread.sleep(3000);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted Exception Occurred  ");
        }
    }
}
public class ThreeThreads{
    public static void main(String[] args){
        GoodMorning gm=new GoodMorning();
        HelloThread ht=new HelloThread();
        WelcomeThread wt=new WelcomeThread();
        gm.start();
        ht.start();
        wt.start();
    }
}
