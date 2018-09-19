package java基础;
import java.util.HashSet;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
public class 多线程 {

	public 多线程() {
		
	}

	public static void main(String[] args) {
		Thread t1 = new Thread();
		ExecutorService e1 = Executors.newCachedThreadPool();
		//线程池使用Executors的静态方法创建，newCachedThreadPool不需指定线程池大小，线程池容量最小为0，最大为整形最大值个。
		//构造方法new ThreadPoolExecutor(0, Integer.MAX_VALUE,60L, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
		//如果有空闲线程可用，线程会被重复利用，每过60秒空闲线程会被回收，线程底层采用SynchronousQueue<Runnable>队列结构
		//该线程池伸缩性比较大，适用于执行时间短的大量并发任务
		//线程池统一由：public class ThreadPoolExecutor extends AbstractExecutorService构造
		//ThreadPoolExecutor内部包含一个任务队列BlockingQueue<Runnable> workQueue
		//执行线程被抽象成：private final HashSet<Worker> workers = new HashSet<Worker>();
		//线程构造函数：private final class Worker extends AbstractQueuedSynchronizer implements Runnable
		//worker采用AQS实现线程安全同步，AQS底层采用CAS+unsafe的park和unpark结合实现原子性（CAS底层也是基于unsafe的CAS方法实现原子操作）
		//线程池状态的维护采用一个原子整形变量：private final AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));
		//
		ExecutorService e2 = Executors.newFixedThreadPool(3);
		ExecutorService e3 = Executors.newSingleThreadExecutor();
		//这两种线程池的创建需要制定核心池的大小等系列参数，newFixedThreadPool
		
		
		
		
		
		
		ArrayBlockingQueue ab = new ArrayBlockingQueue(0);
		
		LinkedBlockingQueue lb = new LinkedBlockingQueue(3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		AtomicInteger count = new AtomicInteger(0);
	}

}
