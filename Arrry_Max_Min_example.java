//Maximum and minimum of an array using minimum number of comparisons

import java.util.Scanner;
public class Arrry_Max_Min_example {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("how many numbers:");
	int n=sc.nextInt();
	//instantiate the array 
	int []arr=new int[n];
	//storing input data in the array using the scanner class.
	for(int i=0;i<n;i++) {
		System.out.println("Enter an integers:");
		arr[i]=sc.nextInt();
	}
	//find the and small
	int max=arr[0];
	int min=arr[0];
	for(int i=1;i<n;i++) 
	{
		if(arr[i]>max)
		{ 
			max=arr[i];
			}
		else if(arr[i]<min)
		{
			min=arr[i];
		}
		}
	System.out.println("given arry is");
	for(int e:arr)
		System.out.println(e+"");
	     System.out.println(arr);
	System.out.println("\n min value is:"+min);
	System.out.println("\n max value is:"+max);
	
	}
	
	
	

	}


