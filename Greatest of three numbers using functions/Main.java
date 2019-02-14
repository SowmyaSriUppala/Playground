import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int n1=in.nextInt();
      int n2=in.nextInt();
      int n3=in.nextInt();
      greatest(n1,n2,n3);
	}
  	public static void greatest(int m1,int m2,int m3){
     	int med;
      	if(m1>m2)
          med=m1;
        else
          med=m2;
      	if(med>m3)
          System.out.print(med);
      	else
          System.out.print(m3);
      
    }
}