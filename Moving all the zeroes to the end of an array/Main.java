import java.util.*;
public class Main{

	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		int size=in.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++)
			arr[i]=in.nextInt();
		int count=0;
		for(int i=0;i<size;i++){
			
			if(arr[i]!=0)
				arr[count++]=arr[i];
			
		}
		while(count<size)
			arr[count++]=0;
		
		for(int i=0;i<size;i++)
			System.out.print(arr[i]+" ");
     // System.out.print(arr[size-1]);
		
	}
}