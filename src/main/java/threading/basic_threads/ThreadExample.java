package threading.basic_threads;

public class ThreadExample {
    public static class ExampleThread implements Runnable{

        @Override
        public void run() {
            System.out.println("Hi, I'm working on a particular thread.");
        }
    }

    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + " " + Thread.currentThread().getId());

//        Thread myThread = new Thread(new ExampleThread());

//        System.out.println(myThread.getId());
//        System.out.println(myThread.getName());


        for (int i =0; i < 10; i++){
            try {
                System.out.println(i);
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
