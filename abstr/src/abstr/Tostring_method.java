package abstr;

public class Tostring_method {

	/**
	 * @param args
	 */
	 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students s1=new Students(101,"Raj","lucknow");  
		Students s2=new Students(102,"Vijay","ghaziabad"); 
		System.out.println(s1+" "+s2);

	}

}
class Students{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Students(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	 public String toString(){
			return rollno+" "+name+" "+city;
		}
}
//tostring method is called when u call system.out.print
