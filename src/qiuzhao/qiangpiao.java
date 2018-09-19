package qiuzhao;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;

public class qiangpiao {
	
	public static tickets tickets = new tickets(3);
	
	public static CyclicBarrier barrier= new CyclicBarrier(10);
	
	public static void main(String[] args) {
		for(int i=0;i<10;i++)
			new Thread(new task2(tickets,barrier)).start();

	}
	
	
	

}
class tickets{
	private int num;
	tickets(int num){
		this.setNum(num);
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	
	
}

class task2 implements Runnable{

	private tickets tickets;
	private CyclicBarrier barrier;
	task2(tickets tickets,CyclicBarrier barrier){
		this.barrier=barrier;
		this.tickets=tickets;
	}
	@Override
	public void run() {
		try {
			barrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(tickets.getNum()>0)
			synchronized(tickets) {
				System.out.println(" £”‡∆± ˝£∫"+tickets.getNum());
				if(tickets.getNum()>0) {
					tickets.setNum(tickets.getNum()-1);
				System.out.println(Thread.currentThread().getName()+"«¿µΩ¡À£°");}	
				else System.out.println(Thread.currentThread().getName()+"«¿∆± ß∞‹£°");
				}
		else System.out.println(Thread.currentThread().getName()+"«¿∆± ß∞‹£°");
	}
	
	
	
	
	
}



