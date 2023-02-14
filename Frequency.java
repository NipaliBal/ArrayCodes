package Arrays;

import java.util.Scanner;

public class Frequency {

	public static void freq(int[] arr,int n,int[] fr) {
		int visited=-1;
		for(int i=0;i<n;i++) {
			int count=1;
			for(int j=0;j<n;j++) {
				if(arr[i]==arr[j]) {
					count++;
					fr[j]=visited;
				}
			}
			if(fr[i]!=visited)
				fr[i]=count;
		}
		System.out.println("----------------------");
		System.out.println("Elements | Frequency");
		System.out.print("-------------------------");
		for(int i=0;i<fr.length;i++) {
			if(fr[i]!=visited)
				System.out.println(" "+arr[i]+" | "+fr[i]);
		}
		System.out.println("----------------------");
	}
	public static void main(String[] args) {
		System.out.println("enter the size of array");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("enter the elements in array");
		int[] arr=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int[] fr=new int[n];
		freq(arr,n,fr);
	}
}
