import java.util.Scanner;

public class Bubble_sort {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i, j, k, l;
		int a[] = new int[10];
		int b[] = new int[10];
		int c[] = new int[10];
		System.out.println("enter the number to short");
		for (i = 0; i < 10; i++) {
			a[i] = sc.nextInt();
		}
		// now the code for shorting the element
		for (k = 0; k < 10; k++) {
			for (i = 0; i < 10; i++) {
				if (a[k] > b[i]) {
					j = a[k];
					a[k] = b[i];
					b[i] = j;
				}
			}
		}
		for (k =0; k < 10; k++) {
			System.out.println(b[k]);
		}
	}
}
