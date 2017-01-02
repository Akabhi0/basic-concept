import java.util.Scanner;


public class Prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int x,i;
		
		System.out.println("enter the number");
		x = sc.nextInt();
		
		for(i=2;i<=x-1;i++)
			if(x%i==0)
				break;
		
			if(i==x)
				System.out.println("prime"+x+"\n");
			else
				System.out.println("not prime"+x);
		
	}

}
