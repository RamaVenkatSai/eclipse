package abstr;

public class Run implements Runnable{

	/**
	 * @param args
	 */
	public void run(){
		for(int i=0;i<=10;i++){System.out.println("hii"+i);}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("manhole");
		Run r=new Run();
		Thread t =new Thread(r);
		t.start();// if u make it as run it thinks it as instance 
		 
		System.out.print("manhole mania mmmamsn");

	}

}
