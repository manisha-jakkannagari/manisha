package practice_programs;
import java.util.Scanner;

public class user_input {
/*public static void main(String [] args) {
	Scanner sc=new Scanner(System.in);
	int num=sc.nextInt();
	int rev=0;
	while(num!=0) {
		rev=rev*10+num%10;
		num=num/10;
	}
	System.out.println("Reversed number:"+rev);
}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int orginal=num;
		int rev=0;
		while(num!=0) {
			rev=rev*10+num%10;//to get last number
			num=num/10;//to remove last digit
			
		}
		if(orginal==rev) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not a palindrome");
		}
	}*/
	/*public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		int even=0,odd=0;
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			if (arr[i]%2==0)
				even++;
			else
				odd++;
		}
		System.out.println(even);
		System.out.println(odd);
	}*/
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int [] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			int largest=arr[0],seconds=arr[0];
			for(int i=1;i<n;i++) {
			if(arr[i]>largest) {
				arr[i]=sc.nextInt();
				seconds=largest;
				largest=arr[i];
			}
			else if(arr[i]>seconds&&arr[i]!=largest){
				seconds=arr[i];
			}
				
		}
		}
		System.out.println("second"+seconds);
	}
}
