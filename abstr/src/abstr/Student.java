package abstr;

public class Student{  
	 int rollno;  
	 String name;  
	 String city;  
	  
	 Student(int rollno, String name, String city){  
	 this.rollno=rollno;  
	 this.name=name;  
	 this.city=city;  
	 }  
	 public String toString(){
		 return rollno+" "+name+" "+" "+city;
		 
	 }
// if u override to string method print calls tostring method to print
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(101,"Raj","lucknow");  
		Student s2=new Student(102,"Vijay","ghaziabad"); 
		System.out.println(s1+" "+s2);

	}

}
