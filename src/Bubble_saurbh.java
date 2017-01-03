import java.util.Scanner;


public class Bubble_saurbh {

	public static void main(String[] args) {
     
		Scanner sc  = new Scanner(System.in);
		int i,j,temp;
		int a[] = new int[10];
		
		System.out.println("enter the no");//thaking the input from user
			for (i=0;  i<=10; i++) {
				a[i]=sc.nextInt();
			}
		
	//sorting alogorithum
			for(j=0;j<=10;j++){
				for(i=0;i<=10-j;i++){
					if(a[i] > a[i+1]){
					 temp = a[i];
					 a[i] = a[i+1];
					 a[i+1] = temp;
					}
				}
			}
			for(i=0;i<=10;i++){
				System.out.println(a[i]);
			}
			
			
			
		}
	}


