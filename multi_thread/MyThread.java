class JavaMultiThread implements Runnable {
    public void run () {
        System.out.println("Thread Run");
    }
}

class MyThread {
    public static void main(String[] args) {
        Thread t1 = new Thread(new JavaMultiThread ());
        t1.start();
    }
}

