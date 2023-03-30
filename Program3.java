swapping of 2 number by using 3rd variable.
import java.util.Scanner;
public class Program3 {
	Scanner sc=new Scanner(System.in);
	public void swaping(){
	int C;
	System.out.println("enter A value:");
	int A=sc.nextInt();
	System.out.println("enter B value:");
	int B=sc.nextInt();
	System.out.println("before swapping"+"A= "+A+" B= "+B);
	C=A;
	A=B;
	B=C;
	System.out.println("after swapping"+"A= "+A+" B= "+B);
	}
	public static void main(String[] args) {
		Program3 O3=new Program3();
		O3.swaping();
	}

}
