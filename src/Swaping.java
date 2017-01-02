import java.util.Scanner;


public class Swaping {
	public static void main(String[] args) {
      
		Scanner sc = new Scanner(System.in);
		
		int i,j,c=0;
		
		System.out.println("enter the no in i");
		i = sc.nextInt();
		System.out.println("enter the no in j");
		j = sc.nextInt();
		System.out.println("i="+i+"j="+j+"\n");
		
		//in this kicten rule is applied//
		/* put the variable on left side in which we want to enter the new value
		 * put the element on right side in which the value is 
		 * suppose 
		 * c is in left (it is now empty)
		 * i is on right having value user enter
		 * than now c take the value of i 
		 * now i is empty
		 * and j has a value
		 * now put i on left side and j on right side
		 * the value is going to exchange
		 * now j became empty now 
		 * put j on left side and c on right side having the value of x inside it 
		 * and thus the swaping takes place  */
		
		c = i;
		i = j;
		j = c;
		
		System.out.println("i= "+i+" "+"j= "+j);
		
	}

}
