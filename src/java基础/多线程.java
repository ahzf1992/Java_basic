package java����;
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
public class ���߳� {

	public ���߳�() {
		
	}

	public static void main(String[] args) {
		Thread t1 = new Thread();
		ExecutorService e1 = Executors.newCachedThreadPool();
		//�̳߳�ʹ��Executors�ľ�̬����������newCachedThreadPool����ָ���̳߳ش�С���̳߳�������СΪ0�����Ϊ�������ֵ����
		//���췽��new ThreadPoolExecutor(0, Integer.MAX_VALUE,60L, TimeUnit.SECONDS,new SynchronousQueue<Runnable>());
		//����п����߳̿��ã��̻߳ᱻ�ظ����ã�ÿ��60������̻߳ᱻ���գ��̵߳ײ����SynchronousQueue<Runnable>���нṹ
		//���̳߳������ԱȽϴ�������ִ��ʱ��̵Ĵ�����������
		//�̳߳�ͳһ�ɣ�public class ThreadPoolExecutor extends AbstractExecutorService����
		//ThreadPoolExecutor�ڲ�����һ���������BlockingQueue<Runnable> workQueue
		//ִ���̱߳�����ɣ�private final HashSet<Worker> workers = new HashSet<Worker>();
		//�̹߳��캯����private final class Worker extends AbstractQueuedSynchronizer implements Runnable
		//worker����AQSʵ���̰߳�ȫͬ����AQS�ײ����CAS+unsafe��park��unpark���ʵ��ԭ���ԣ�CAS�ײ�Ҳ�ǻ���unsafe��CAS����ʵ��ԭ�Ӳ�����
		//�̳߳�״̬��ά������һ��ԭ�����α�����private final AtomicInteger ctl = new AtomicInteger(ctlOf(RUNNING, 0));
		//
		ExecutorService e2 = Executors.newFixedThreadPool(3);
		ExecutorService e3 = Executors.newSingleThreadExecutor();
		//�������̳߳صĴ�����Ҫ�ƶ����ĳصĴ�С��ϵ�в�����newFixedThreadPool
		
		
		
		
		
		
		ArrayBlockingQueue ab = new ArrayBlockingQueue(0);
		
		LinkedBlockingQueue lb = new LinkedBlockingQueue(3);
		
		
		
		
		
		
		
		
		
		
		
		
		
		AtomicInteger count = new AtomicInteger(0);
	}

}
