import java.util.*;
class Main{
	public static void main(String args[]){
	
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int temp=n,temp1=n,temp2;
		int dum,sum=0;
		int count=0;
		while(temp1!=0){
			temp1=temp1/10;
			count++;
			
		}
		for(int i=1;i<=count;i++){
			temp2=n%10;
			//System.out.println("1st temp"+temp2);
			dum=fact(temp2);
			//System.out.println("dum"+dum);
			sum=sum+dum;
			//System.out.println("sum"+sum);
			n=n/10;
			//System.out.println(n);
			
		}
		//System.out.println(sum);
		if(sum==temp)
			System.out.println("Yes");
		else
			System.out.println("No");
	
	}
	static int fact(int t){
		int f=1;
		for(int i=1;i<=t;i++)
			f=f*i;
		return f;
	}


}