package threading.thread_interrupt;

public class MessageLooper implements Runnable{


    @Override
    public void run() {
        String[] tmnt = {"Michelangelo", "Raphael", "Leonardo", "Donatello"};

        for (String turtle : tmnt) {
            try {
                Thread.sleep(2000);
                System.out.println(Thread.currentThread().getName() + " " + turtle);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
