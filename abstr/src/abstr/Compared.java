package abstr;

public class Compared {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stuba
		Stamina s1=new Stamina(11, "venkat");
		//s1.Set(12, "venkat");
		s1.get();
		Stamina s2=new Stamina(11, "venkat");
		//s2.Set(11, "venkat");
		s2.get();
System.out.println(s1.compare(s2));
	}

}
class Stamina{
	int a;
	String s;
	Stamina(int a,String s){
		this.a=a;
		this.s=s;
	}
	void get(){
		System.out.println("String "+ s +" int "+a);
	}
	boolean compare(Object a1){
        Stamina s1=(Stamina)a1;
		if(a==s1.a&&s==s1.s){return true;
		}
		else{return false;}
	}
}