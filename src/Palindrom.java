import java.util.Scanner;


public class Palindrom {
	
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
		int a,temp,ren,revese=0;
		
		System.out.println("enter the number");
		a = sc.nextInt();
		temp = a;
		while(temp >0){
		   ren = temp%10;
		   revese = (revese * 10)+ren;
		   temp = temp/10;
		}
		
		if(revese == a){
			System.out.println("this is palindrom "+a+"->>"+revese);
		}else{
			System.out.println("not a palindrom "+a+"->>"+revese);
		}
	}

}
