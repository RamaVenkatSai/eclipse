package abstr;
class Q{
	int num;
	boolean val=true;
	
	public synchronized void set(int num){
		while(val){ try{wait();}catch(Exception e){}}
		this.num=num;
		System.out.println("setnum"+num);
		try{Thread.sleep(1000);}catch(Exception e){}
		val=true;
		notify();
	}
 public synchronized void get(){
	 while(!val){ try{wait();}catch(Exception e){}}
	 System.out.println("getnum"+num);
	 try{Thread.sleep(2000);}catch(Exception e){}
	 val=false;
	 notify();
	}
}
class Producer implements Runnable{
	Q q;
	public Producer(Q q){ this.q=q;
	Thread t=new Thread(this,"Producer");
	t.start();}
	public void run(){
		int i=0;
		while(true){
			q.set(i++);
			try{Thread.sleep(1000);}catch(Exception e){}
			
			
			
		}
	}
}
class Consumer implements Runnable{
	Q q;
	public Consumer(Q q){
		this.q=q;
		Thread t1=new Thread(this,"Consumer");
		t1.start();}
		public void run(){
			
			while(true){
				q.get();
				try{Thread.sleep(1000);}catch(Exception e){}
		
	}
		}
}
public class Telusko_thread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Q q=new Q();
		
		
		new Producer(q);
		new Consumer(q);
		

	}

}
