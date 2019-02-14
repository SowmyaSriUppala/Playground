import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      sum(n);
	}
    public static void sum(int number){
     	int addition=0;
      for(int i=1;i<=number;i++)
      {
       	 	addition =addition+i;
        
      }
      System.out.print(addition);
      
    }
}