write a program to get the value of are a rectangle 
rectangle formula is 1/2*base*height we can create these program into two ways 
1.first one is using the print function directly
import java.util.Scanner;
public class Program2
{
public static void main(String[] args){
	Program2 f2= new Program2();
	f2.area();
Scanner sc=new Scanner(System.in);
System.out.println("enter base value1:");
float base=sc.nextFloat();
System.out.println("enter height value2:");
float height=sc.nextFloat();
double are_rect=(base*height)/2;
System.out.println(are_rect);

}
2.by creating a method calling from the method.
public void area(){
	Scanner sc=new Scanner(System.in);
	System.out.println("enter base value:");
	float base=sc.nextFloat();
	System.out.println("enter height value:");
	float height=sc.nextFloat();
	double are_rect=(base*height)/2;
	System.out.println(are_rect);
	}

}
