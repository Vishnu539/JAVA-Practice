import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;

public class BlockingQueueDemo {
    public static void main(String[] args) {
        BlockingQueue<Integer> bq1 = new ArrayBlockingQueue<>(5);

        // Producer-Consumer problem
        Thread producer = new Thread(new Producer(bq1));
        Thread consumer = new Thread(new Consumer(bq1));

        producer.start();
        consumer.start();


        BlockingQueue<Integer> bq2 = new LinkedBlockingQueue<>();
        

    }
}

class Producer implements Runnable{
    private BlockingQueue<Integer> bq;
    private int value = 0;

    public Producer(BlockingQueue<Integer> queue){
        this.bq = queue;
    }

    @Override
    public void run() {
        while(true){
            try{
                System.out.println("Producer produced: " + value);
                bq.put(value++); // adds an element into the queue
                Thread.sleep(1000);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class Consumer implements Runnable{
    private BlockingQueue<Integer> bq;

    public Consumer(BlockingQueue<Integer> queue){
        this.bq = queue;
    }

    @Override
    public void run() {
        while(true){
            try{
                Integer value = bq.take(); // removes an element from the queue
                System.out.println("Consumer consumed: " + value);
                Thread.sleep(2000);
            } catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}