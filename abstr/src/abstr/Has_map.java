package abstr;
//import java.util.HashMap;
import java.util.Scanner;

public class Has_map {
	String []a=new String[]{"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
	int[] bases = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
	for (int i=bases.length-1; i>=0;i--)
	{
		while (num >= bases[i])
		{
			result += a[i];
			num -= bases[i];
		}
	}
	

}
