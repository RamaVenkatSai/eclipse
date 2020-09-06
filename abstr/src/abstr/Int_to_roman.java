package abstr;
import java.util.Scanner;
public class Int_to_roman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String []a=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
		int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
		String result="";
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		for(int i=0;i<bases.length;i++){
			while(num>=bases[i]){
				result+=a[i];
				num-=bases[i];
			}
		}
		System.out.println(result);
	}

}
