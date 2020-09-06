package abstr;
class  Counter{
	int count;
	public synchronized void increment(){
		count++;
	}
}

public class Thread_Teluskoexample {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
            final Counter c=new Counter();

       Thread t1=new Thread(new Runnable(){
    	   public void run(){
    		   for (int i=0;i<1000;i++){ 
    			   c.increment();
    			   }
    	   }
       });
       Thread t2=new Thread(new Runnable(){
    	   public void run(){
    		   for (int i=0;i<1000;i++){c.increment();}
    	   }
       });
      t1.start();
      t2.start();
     try{ t1.join();}catch(Exception e){}// be careful otherwise u may get different output if u don't write this
     try{ t2.join();}catch(Exception e){}// be careful otherwise u may get different output
       System.out.print( "count is" + c.count);
       
	}

}

