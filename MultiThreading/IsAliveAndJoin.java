class Task1 extends Thread{
    public void run(){
        try{
            System.out.println("Task 1 is Starting the task");
            Thread.sleep(5000);
            System.out.println("task 1: Task Completed"); 
        }catch(InterruptedException e){
            System.out.println("Interrupted Exception Occurred ");
        }
    }
}
class Task2 extends Thread{
    private Thread task1;
    public Task2(Thread task1){
        this.task1=task1;
    }
    public void run(){
        try{
            System.out.println("Task 2 : Checking if Task  is Alive ");
            task1.join();
            System.out.println("task 1 is completed Now Task 2 is running ");
            Thread.sleep(2000);
            System.out.println("Task 2 is completed ");
        }catch(InterruptedException e){
            System.out.println("Interrupted Excepotion Occurred  ");

        }
    }
}
public class IsAliveAndJoin {
    public static void main(String[] args){
        Task1 task1=new Task1();
        Task2 task2=new Task2(task1);
        task1.start();
        try{
            while(task1.isAlive()){
                System.out.println("Main Thread : waiting for task 1 to complete ");
                Thread.sleep(1000);
            }
            task2.start();
        }catch(InterruptedException e){
            System.out.println("Interruptrd Exception Occurred ");
        }
        try{
            task2.join();
            System.out.println("main Thread completed ");
        }catch(InterruptedException e){
            System.out.println("Inturrepted Exception Occurred ");
        }
    }
}
