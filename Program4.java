//swapping by using the 2 numbers itself.
public class Program4 
{
public String swapping()
{
int A=10,B=20;
System.out.println("bedore swapping A= "+A+" B= "+B);
A=A+B;
B=A-B;
A=A-B;
return "after swapping A= "+A+" B= "+B;
}
public static void main(String[] args) 
{
	Program4 O4=new Program4();
	System.out.println(O4.swapping());

}
}
