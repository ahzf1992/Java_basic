
package concurrent;
import java.util.concurrent.*;
public class test_synchonized {
    public synchronized void f1(int count){
        if(count-->0){
            System.out.println(Thread.currentThread()+"f1() calling f2() with count "+count);
            synchronized(this.getClass()) {
            	f2(count);
            };
        }
    }

    public void f2(int count){
        if (count-->0) {
            System.out.println(Thread.currentThread()+"f2() calling f1() with count "+count);
            f1(count);
        }
    }

    public static void main(String[] args) {
        test_synchonized multiLock=new test_synchonized();
        
        /*for(int i=0;i<10;i++) {
        	new Thread(new task(multiLock)).start();
        }*/
        /*ExecutorService cachedThreadPool = Executors.newCachedThreadPool();
        for(int i=0;i<10;i++)
        	cachedThreadPool.submit(new task(multiLock));
    	*/
       th1 t1 = new th1();
       t1.start();
    }
}
class th1 extends Thread{
	
	
}
class task implements Runnable{
	private test_synchonized te;
	public task(test_synchonized t) {this.te=t;};
	@Override
	public void run() {
		
		te.f1(10);
		
	}
	
	
	
	
}
