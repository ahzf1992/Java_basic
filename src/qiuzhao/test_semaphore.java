package qiuzhao;


public class test_semaphore implements Runnable{  
    private ResourceManage resourceManage;  
    private int userId;  
    public test_semaphore(ResourceManage resourceManage, int userId) {  
        this.resourceManage = resourceManage;  
        this.userId = userId;  
    }  
    public void run(){  
        System.out.print("userId:"+userId+"׼��ʹ����Դ...\n");  
        try {
			resourceManage.useResource(userId);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
        System.out.print("userId:"+userId+"ʹ����Դ���...\n");  
    }  
  
    public static void main(String[] args){  
        ResourceManage resourceManage = new ResourceManage();  
        Thread[] threads = new Thread[100];  
        for (int i = 0; i < 100; i++) {  
            Thread thread = new Thread(new test_semaphore(resourceManage,i));//���������Դʹ����  
            threads[i] = thread;  
        }  
        for(int i = 0; i < 100; i++){  
        	new Thread(new test_semaphore(resourceManage,i)).start();
            /*Thread thread = threads[i];  
            try {  
                thread.start();//�����߳�  
            }catch (Exception e){  
                e.printStackTrace();  
            }  */
        }  
    }  
}

