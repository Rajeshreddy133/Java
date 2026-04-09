class Buffer {
    private boolean isEmpty=true;
    public synchronized void produce() throws InterruptedException{
        while(!isEmpty){
            wait();
        }
        System.out.println("Produced Item ");
        isEmpty=false;
        notify();
    }
    public synchronized void consume() throws InterruptedException{
        while(isEmpty){
            wait();
        }
        System.out.println("Consumed Item ");
        isEmpty=true;
        notify();
    }
}
class Producer extends Thread{
    private Buffer buffer;
    public Producer(Buffer buffer){
        this.buffer=buffer;
    }
    public void run(){
        try{
            while(true){
                buffer.produce();
                Thread.sleep(1000);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
class Consumer extends Thread{
    private Buffer buffer;
    public Consumer(Buffer buffer){
        this.buffer=buffer;
    }
    public void run(){
        try{
            while(true){
                buffer.consume();
                Thread.sleep(1500);
            }
        }catch(InterruptedException e){
            System.out.println(e);
        }
    }
}
public class ProducerAndConsumer {
    public static void main(String[] args){
        Buffer buffer =new Buffer();
        Producer producer=new Producer(buffer);
        Consumer consumer=new Consumer(buffer);
        producer.start();
        consumer.start();
    }
}
