give number is even or odd by using java.
import java.util.Scanner;
public class Program5 {
	public String EvenorOdd(){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Number:");
	int Number=sc.nextInt();
	return (Number%2==0)?"Even":"Odd";
	}
	public static void main(String[] args) {
		Program5 O5=new Program5();
		System.out.println(O5.EvenorOdd());

	}

}
