package abstr;
class Cat extends Thread{
	public void run(){
	for (int i=0;i<25;i++){
		try{Thread.sleep(100);}catch(Exception e){}
		
		System.out.println("cat is running" + i);
	}
	}
}
class Rat extends Thread{
	public void run(){
	for (int i=0;i<25;i++){
		try{Thread.sleep(100);}catch(Exception e){}
		System.out.println("rat is running"+ i);
	}
	}
}
public class Thread_telusko {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Rat r=new Rat();
Cat c=new Cat();

c.start();

r.start();
try{r.join();}catch(Exception e){}// to stop main method from printing until this stops printing

try{c.join();}catch(Exception e){}// to stop main method from printing until this stops printing 
System.out.println("hey man u called main man");
	}

}
