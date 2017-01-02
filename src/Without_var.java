import java.util.Scanner;


public class Without_var {

	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int i,j;
		
		System.out.println("enter the no in i");
		i = sc.nextInt();
		System.out.println("enter the no in j");
		j = sc.nextInt();
		System.out.println("i="+i+"j="+j+"\n");
		/*  ex=> i= 10 j=20
		 *   i = i+j (i=>30)
		 *   j = i-j(j=>10)
		 *   i = i-j(i=>20)    */
		
		i = i+j;
		j = i-j;
		i = i-j;
		
		System.out.println("i="+i+"j="+j+"\n");
		
	}

}
