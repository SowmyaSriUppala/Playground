import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
     Scanner in=new Scanner(System.in);
		int number=in.nextInt();
		int temp=number;
		int count=0;
		int last_number,first_number;
		int i,s=0,new_number=0,req_number;
		while(number!=0){
			number=number/10;
			count+=1;
		}
		for(i=1;i<=count;i++){
			if(i!=1){
				s=9;
	   			new_number=new_number*10+s;
				//System.out.println(new_number);
			}
			
		}
		req_number=new_number+1;
		//System.out.println(req_number);
		first_number=temp/req_number;
		//System.out.println(first_number);
		last_number=temp%10;
		System.out.println(first_number+last_number);

	}
}