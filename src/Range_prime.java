import java.util.Scanner;


public class Range_prime {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int i,j,k,l;
		System.out.println("enter the no1");
		i = sc.nextInt();
		System.out.println("enter the no2");
		j = sc.nextInt();
		
		for(k=i+1;k<=j-1;k++){// this is the loop for the visiting the numbers
			
			for(l=2;l<k;l++)// this is the loop where the logic of prime number 
				if(k%l==0)
					break;
			if(l==k)//condition for checking the (7%7 = 0) than it is prime
				System.out.println("prime"+l);
			else
				System.out.println("not a prime");
		}
	}

}
