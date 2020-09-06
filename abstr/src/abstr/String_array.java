package abstr;
import java.util.Scanner;

public class String_array {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		System.out.println("str "+str);
		String a[]=new String[100];
		a=str.split(" ");
		System.out.println(a[1]);
		int i;
		for(i=0;i<a.length;i++){
			System.out.println(a[i]);
			
		}
		System.out.println(str.length());
		// TODO Auto-generated method stub
		

	}

}
