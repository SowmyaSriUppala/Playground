import java.util.*;
import java.lang.Math;
class Main{
 	public static void main(String[] args){
     	Scanner in=new Scanner(System.in);
      	int b=in.nextInt();
      	int e=in.nextInt();
      	power(b,e);
      
      
    }
  	public static void power(int base,int exponent){
      
      	int b=base;
      	int e=exponent;
      	double powerRes=Math.pow(b,e);
      	System.out.print(powerRes);
      
    }
  
  
}