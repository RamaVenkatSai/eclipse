package abstr;

public class rbi extends Norm_rbi implements IB {

	/**
	 * @param args
	 */
	void withdrawl(int x){
		System.out.print("measure");
	}
	public void method1(int x){System.out.println("manam");}
	public void manhole(){System.out.println("manhole");}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.out.print("reached\n");
       rbi r=new rbi();
       r.method1(1);
       r.manhole();
       
	}

}
abstract class Norm_rbi{
	abstract void withdrawl(int x);
	void man(int x){
		System.out.println("abstact"+x);
	}
	
}
interface IB{
	
	void manhole();
}