import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		
		Scanner src=new Scanner(System.in);
		System.out.print("Enter no to check Prime no: ");
		int num=src.nextInt();
		Boolean prime=true;
		System.out.println(num);
		int divisor = 0;
		
		for(int i=2;i<num;i++){
			if(num%i==0)
			{
				prime =false;
				divisor=i;
			}
			

		}
		if(prime==false)
		{
			System.out.println("Given number is not a prime number and divisble by "+divisor);

			
		}else
			System.out.println("Given number is a prime number");
	}
}
