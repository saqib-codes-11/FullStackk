package multithreading;


// Behavior of notify() method

class Notify1 extends Thread {
    public void run()
    {
        synchronized (this)
        {
            System.out.println(
                Thread.currentThread().getName()
                + "...starts");
            try {
                this.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                Thread.currentThread().getName()
                + "...notified");
        }
    }
}
class Notify2 extends Thread {
    Notify1 n1;
    
    Notify2(Notify1 n1){ 
      this.n1 = n1; 
    }
    
    public void run()
    {
        synchronized (this.n1)
        {
            System.out.println(
                Thread.currentThread().getName()
                + "...starts");
  
            try {
                this.n1.wait();
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(
                Thread.currentThread().getName()
                + "...notified");
        }
    }
}
class Notify3 extends Thread {
    Notify1 n1;
    Notify3(Notify1 n1) { this.n1 = n1; }
    public void run()
    {
        synchronized (this.n1)
        {
            System.out.println(
                Thread.currentThread().getName()
                + "...starts");
            this.n1.notify();
            System.out.println(
                Thread.currentThread().getName()
                + "...notified");
        }
    }
}
class MainClass {
    public static void main(String[] args)
        throws InterruptedException
    {
  
        Notify1 n1 = new Notify1();
        Notify2 n2 = new Notify2(n1);
        Notify3 n3 = new Notify3(n1);
        Thread t1 = new Thread(n1, "Thread-1");
        Thread t2 = new Thread(n2, "Thread-2");
        Thread t3 = new Thread(n3, "Thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}