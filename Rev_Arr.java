import java.util.Scanner;
public class Rev_Arr {
	Scanner sc=new Scanner(System.in);
	public void rev(int n) {
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
		System.out.print("Give an integer :");
		arr[i]=sc.nextInt();
		}
		System.out.println("\nbefore reversing array:");
		
		for(int e:arr) {
			System.out.print(e+" ");
		}
		int temp=0;
		for(int i=0,j=n-1;i<n/2;i++,j--){
		temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
		}
		System.out.println("\nAfter reversing array: ");
		
		for(int e:arr) {
			System.out.print(e+" ");
		}
	}
}
