package Arrays;

import java.util.Scanner;

public class MissingNum {

	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the array size");
		int n=s.nextInt();
		int arr[]= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int miss_num=MissingCode(arr,n);
		System.out.println(miss_num);
	}
	public static int MissingCode(int arr[],int n) {
		//cal the summation of first N natural numbers
		int total=(n*(n+1))/2;
		System.out.println(total);
		//total sum of all the elements
		int sum=0;
		for(int i=0;i<n;i++) {
			sum=sum+arr[i];
		}
		System.out.println(sum);
		//missing numbers are
		int miss=total-sum;
		return miss;
	}
}
