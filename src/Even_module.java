import java.util.Scanner;

public class Even_module {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i=0;
		int a[] = new int[20];
		int b[] = new int[20];
		
		System.out.println("enter the number");
		for (int j = 0; j <10; j++) {
			a[j] = sc.nextInt();
			b[j] = (a[j]/2);//this tells us what are the remender are comming 
			 System.err.println("divided"+b[j]);//this will print the remender
			if(a[j]%2==0){//this logic makes those number will be printed which having remender in 0
				System.out.println("number"+a[j]);// this is going to print the remender
			}
		}
	}

}
