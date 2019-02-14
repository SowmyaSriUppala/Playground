import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      int med=gcd(n1,n2);
      System.out.print(gcd(med,n3));
	}
  	public static int gcd(int m1,int m2){
     	int g=1;
      for(int i=1;i<=m1 && i<=m2;i++){
       	if(m1%i==0 && m2%i==0)
          g=i;
        
      }
      return g;
    }
}