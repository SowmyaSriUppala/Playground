import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int number=in.nextInt();
      int num=0,sum=0;
      while(number!=0){
        
       	num=number%10;
        sum=sum+num;
        number=number/10;
        
      }
      System.out.println(sum);
	}
}