import java.lang.Math;
import java.util.Scanner;
class Main{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp=n;
		int temp1=n;
		int dum,count=0;
		double sum=0;
		while(temp!=0){
			temp=temp/10;
			count++;
			
		}
		
		while(n!=0){
			
			dum=n%10;
			sum=sum+Math.pow(dum,count);
			n=n/10;
			
		}
		if(temp1==sum)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not a Armstrong Number");
		
	}
}