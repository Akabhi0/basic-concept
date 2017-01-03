import java.util.Scanner;


public class Palindrom_string {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String org,reve="";
		
		System.out.println("enter the string to be revesed");
		org = sc.next();
		
		int lenght = org.length();
		
		for(int i=lenght-1;i >= 0;i--){
			reve = reve+org.charAt(i);
			System.out.println(reve);
		}		
	}
}

