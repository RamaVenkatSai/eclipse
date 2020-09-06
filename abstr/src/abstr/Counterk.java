package abstr;
import java.util.Scanner;

public class Counterk {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Initialize array  
		int n,k;
		Scanner s=new Scanner(System.in);
		System.out.print("enter number of strings u want");
		n=s.nextInt();
		
		
		String str[]=new String[n+1];
		for(k=0;k<=n;k++){
		  str[k]=s.nextLine();
        String [] arr = new String [1000]; 
        arr=str[k].split(" ");
        //Array fr will store frequencies of element  
        int [] fr = new int [arr.length];  
        
        int visited = -1;  
        for(int i = 0; i < arr.length; i++){  
            int count = 1;  
            for(int j = i+1; j < arr.length; j++){  
                if(arr[i].equalsIgnoreCase(arr[j])){  
                    count++;  
                    //To avoid counting same element again  
                    fr[j] = visited;  
                } //if loop 
            }  //for loop of j=i+1
            if(fr[i] != visited)  
                fr[i] = count;  
        } //for loop of i 
		
	
        str[k]="";
	for(int i = 0; i < fr.length; i++){  
        if(fr[i] != visited){  
           
            str[k]=str[k]+arr[i]+" ";
            
        }//if loop of fr.length
      
       
    
	
	}//for loop of fr.length
	str[k].trim(); 
		}//for loop of k
		for(int l=0;l<=n;l++)
		
		System.out.println(str[l]);
	}//psvm
}//counter
