class MultiThread implements Runnable {
  private Thread t;
  private String threadName;

  MultiThread(String name) {
    threadName = name;
    System.out.println("Creating " + threadName);
  }

  public void run() {
    System.out.println("Running " + threadName);
    try {
      for (int i = 4; i > 0; i--) {
        System.out.println("Thread: " + threadName + ", " + i);

        Thread.sleep(500);
      }
    } catch (InterruptedException e) {
      System.out.println("Thread " + threadName + " interrupted.");
    }

    System.out.println("Thread " + threadName + " exiting.");
  }

  public void start() {
    System.out.println("Starting " + threadName);
    if (t == null) {
      t = new Thread(this, threadName);
      t.start();
    }
  }
}

class SwastikThread {
  public static void main(String[] args) {
    MultiThread t1 = new MultiThread("Madhav");
    t1.start();

    MultiThread t2 = new MultiThread("Suman");
    t2.start();
  }
}