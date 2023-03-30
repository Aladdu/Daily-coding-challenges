import java.util.Scanner;
public class Prime {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int number=sc.nextInt();
        boolean isprime=true;
        if(number<1) {
        	isprime=false;}
        else {
        for(int i=2;i<=Math.sqrt(number);i++){
        if(number%i==0) {
        	isprime=false;
        	break;
        }
        }
        }
        if(isprime)
        	System.out.println("prime");
        else
        System.out.println("not prime");
	}

}
