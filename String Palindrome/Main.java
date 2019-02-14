import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		String str1 = scan.nextLine();
		
		StringBuilder sb1=new StringBuilder("");
		StringBuilder sb=new StringBuilder(str1);
		
		for(int i=sb.length()-1;i>=0;i--){
			sb1.append(sb.charAt(i));
		}
		
		String newStr=new String(sb1);
		if(str1.equals(newStr)==true)
			System.out.println("Yes");
		else
			System.out.println("No");	
	}
}