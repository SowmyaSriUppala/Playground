import java.util.*;
class Main{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=1;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=i;j++){
				
				if(k%2==0)
					System.out.print("#");
				else
					System.out.print("*");
				k++;
			}
			System.out.print("\n");
			
		}	
	}
}