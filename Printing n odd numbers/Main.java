import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in=new Scanner(System.in);
      int number=in.nextInt();
      for(int i=1;i<=2*number;i++){
       		if(i%2==1)
              System.out.println(i);
        
        
      }
	}
}