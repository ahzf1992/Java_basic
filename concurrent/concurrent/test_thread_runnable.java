package concurrent;

public class test_thread_runnable implements Runnable{
		 
		private  Object tickets = new Object();
	 
		@Override
		public void run() {
	 
			for (int i = 0; i <= 100; i++) {
				
				
				//if(tickets>0) {
					{synchronized(tickets){
								System.out.println(Thread.currentThread().getName()+"  ����Ʊ��" );
				//setTickets(getTickets() + 1);
				}
				}
			
		}
		}
		
		
		public static void main(String[] args) {
			test_thread_runnable myRunnable = new test_thread_runnable();
			/*Thread thread1 = new Thread(myRunnable, "����һ");
			Thread thread2 = new Thread(myRunnable, "���ڶ�");
			Thread thread3 = new Thread(myRunnable, "������");
	 
			thread1.start();
			thread2.start();
			thread3.start();
			*/
			for(int i = 1;i <10 ;i++) 
				{Thread thread= new Thread(myRunnable,"����"+i);
				thread.start();
				}
			
	 

}
}