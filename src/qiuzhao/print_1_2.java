package qiuzhao;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class print_1_2 {

	private static Integer i=1;
	private static Integer n=1;
	public static ReentrantLock lock = new ReentrantLock();
	public static Condition c1 = lock.newCondition();
	public static Condition c2 = lock.newCondition();
	public static Condition c3 = lock.newCondition();
	public static Condition c4 = lock.newCondition();
	public static Condition c5 = lock.newCondition();
	public static void main(String[] args) {
		
		new Thread(new task1(lock,c1,c2,1)).start();
		new Thread(new task1(lock,c2,c3,2)).start();
		new Thread(new task1(lock,c3,c4,3)).start();
		new Thread(new task1(lock,c4,c5,4)).start();
		new Thread(new task1(lock,c5,c1,5)).start();
		//while(true) 
		{
		lock.lock();
		c1.signal();
		lock.unlock();

	}
}
}
class task1 implements Runnable{

	private ReentrantLock lock;
	private Condition c_begin;
	private Condition c_end;
	private int i;
	task1(ReentrantLock lock,Condition c1,Condition c2,int i){
		this.lock=lock;
		this.c_begin=c1;
		this.c_end=c2;
		this.i=i;
	}
	@Override
	public void run() {
		while(true) {
		lock.lock();
		try {
			//System.out.println("thread:"+i+"  begin");
			c_begin.await();
			System.out.println(i);
			c_end.signal();
		}catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally
		{
			lock.unlock();
		}
		//System.out.println("thread:"+i+"  end");
	}
	
	
	
}
}

class task implements Runnable{

	private Integer i;
	private int j;
	private Integer n;
	task(Integer i,int j,Integer n){
		this.i=i;
		this.j=j;
		this.n=n;
	}
	@Override
	public void run() {
		
		while(true)
		if(n.equals(j)) {
			synchronized(n){
		if(n.equals(j)&n<6){
				//synchronized(i){
					System.out.println(j);
					//i.notifyAll();
					//try {
						//i.wait();
					//} catch (InterruptedException e) {
					//	e.printStackTrace();
					//}
				n++;
				}
		
		if(n.equals(6)) n=1;
		}
		
	}
}
}




