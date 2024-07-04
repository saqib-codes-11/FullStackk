package multithreading;
// Java program to illustrate the
// behavior of notifyAll() method
  
class NotifyAll1 extends Thread {
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
class NotifyAll2 extends Thread {
    NotifyAll1 na1;
    
    NotifyAll2(NotifyAll1 na1){ 
      this.na1 = na1; 
    }
    
    public void run()
    {
        synchronized (this.na1)
        {
            System.out.println(
                Thread.currentThread().getName()
                + "...starts");
  
            try {
                this.na1.wait();
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
class NotifyAll3 extends Thread {
    NotifyAll1 na1;
    NotifyAll3(NotifyAll1 na1) { this.na1 = na1; }
    public void run()
    {
        synchronized (this.na1)
        {
            System.out.println(
                Thread.currentThread().getName()
                + "...starts");
  
            this.na1.notifyAll();
            System.out.println(
                Thread.currentThread().getName()
                + "...notified");
        }
    }
}
class WaitNotifyAllTest {
    public static void main(String[] args)
        throws InterruptedException
    {
  
        NotifyAll1 na1 = new NotifyAll1();
        NotifyAll2 na2 = new NotifyAll2(na1);
        NotifyAll3 na3 = new NotifyAll3(na1);
        Thread t1 = new Thread(na1, "Thread-1");
        Thread t2 = new Thread(na2, "Thread-2");
        Thread t3 = new Thread(na3, "Thread-3");
        t1.start();
        t2.start();
        Thread.sleep(100);
        t3.start();
    }
}