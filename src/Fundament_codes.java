import java.util.Scanner;


public class Fundament_codes {

	Scanner sc = new Scanner(System.in);
	int a,b,c,temp,i,j;
	
	public void prime_number(){
		System.out.println("enter the number");
		a = sc.nextInt();
		
		for(i=2;i<=a-1;i++)
			if(a%i==0)
				break;
		
			if(i==a)
				System.out.println("prime"+a+"\n");
			else
				System.out.println("not prime"+a);
	 }
	
	public void two_prime(){
		System.out.println("enter the no1");
		a = sc.nextInt();
		System.out.println("enter the no2");
		b = sc.nextInt();
		
		for(i=a+1;i<b-1;i++){
			for(j=2;j<b-1;j++)
				if(i%j==0)
					break;
			if(j==i)
				System.out.println("prime"+i);
			else
				System.out.println("not a prime"+i);
		}	
	}
	
	public void str_rev(String s){
		String pro = s;
		String op = s;
		String rev="";
		
		int len = op.length();
		
		for(i=len-1;i>=0 ;i--){
			rev = rev+op.charAt(i);
		 }
		System.out.println("revese->> "+rev);
	}
	
	public void num_rev(){
		System.out.println("enter the no");
		i = sc.nextInt();
		j = i;
		
		while(j>0){
			a = j%10;
			b = (b*10)+a;
			j = j/10;
		}
		if(b==i){
			System.out.println("palendrom "+"original no "+i+" reverse no ->>"+b);
		}else{
		System.out.println("not palendrom "+"original no "+i+" reverse no ->>"+b);
		}
	}
	
	public void strong(){
		System.out.println("enter the no");
		i = sc.nextInt();
		
		j = i;
		while(j>0){
			a = j%10;
			b = b+a;
			j = j/10;
		}
		System.out.println("strong no add is"+b);
		while(b>0){
			i = b%10;
			temp = temp+i;
			b = b/10;
		}
		System.out.println("their answer add is"+temp);
	}
	
	public void strong_bold(){
		System.out.println("enter the no");
		i = sc.nextInt();
		
		j = i;
		while(j>0){
			a = j%10;
			b = b+(a*a*a);
			j = j/10;
		}
		System.out.println("strong no cube is "+b);
		
		while(b>0){
			c = b%10;
			temp = temp+c;
			b = b/10;
		}
		System.out.println("strong no cube is "+temp);

	}
    //int a,b,c,temp,i,j;
	
	public void Fibonaccis(){
	 	a=0;b=1;
	 	System.out.println("enter the no of loop");
	 	j=sc.nextInt();
	 	
	 	for(i=0;i<=j;i++){
	 			temp = a+b;
	 		    a = b;
	 		    b = temp;    
	 	}
	 	System.out.println("fibonaccis "+temp);
	}
	
	public static void main(String[] args) {

		Fundament_codes f  = new Fundament_codes();
		//f.prime_number();
		//f.two_prime();
		//f.str_rev("abhi");
		//f.num_rev();
		//f.strong();
		//f.strong_bold();
		f.Fibonaccis();
	}

}
