
package abstr;
import java.util.Scanner;
public class Arrays {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]a=new int[3][];
		a[0]=new int[3];
		a[1]=new int[2];
		a[2]=new int[4];
		
		Scanner s=new Scanner(System.in);
		int i,j;
		for(i=0;i<a.length;i++){for(j=0;j<a[i].length;j++)
		{System.out.println("enter element"+" "+i +" "+j);
		a[i][j]=s.nextInt();}}
		for(i=0;i<a.length;i++){for(j=0;j<a[i].length;j++){System.out.print(a[i][j]);}System.out.print("\n");}

	}

}
