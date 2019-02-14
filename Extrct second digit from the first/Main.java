import java.util.*;
class Main{
	public static void main(String[] args){
	
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
		for(i=1;i<count-1;i++){
			temp=temp/10;
		
		}
		temp=temp%10;
		System.out.println(temp);
		
	
	}



}