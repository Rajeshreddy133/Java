class DaemonThread extends Thread{
    public void run(){
        try{
            while(true){
                System.out.println("Daemon Thread is Running ......");
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println("Interrupted Exception Occurred ");
        }
    }
}
class NormalThread extends Thread{
    public void run(){
       try{
            System.out.println("Normal Thread Is Running ...");
            Thread.sleep(5000);
            System.out.println("Normal Thread Finished ");
       }catch(InterruptedException e){
        System.out.println("Inturrepted Exception Occurred ");
       }
    }
}
public class DaemonThreadsExample {
    public static void main(String[] args){
        DaemonThread daemon=new DaemonThread();
        daemon.setDaemon(true);
        daemon.start();
        NormalThread normal=new NormalThread();
        normal.start();
        try{
            Thread.sleep(3000);
            System.out.println("Main Thread Completed ");
        }catch(InterruptedException e){
            System.out.println("Inturrepted Exception Occurred ");
        }
    }
}
