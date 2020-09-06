package abstr;

public class abstr   extends man implements IA{

	/**
	 * @param args
	 */
	void area(int x,int y){
		System.out.print("i m here");
	}
	public void nn(int x, int y){
		System.out.print("entered nn");
	}// need to declare the overridden class as public as it is drom interface
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		abstr a=new abstr();
		a.area(10, 20);
		IA m=new abstr();
		m.nn(1, 1);
	
		

	}

}
abstract class man{
	abstract void area(int x,int y);
}
interface IA{void nn(int x,int y);}