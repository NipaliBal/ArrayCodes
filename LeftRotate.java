package Arrays;

import java.util.Scanner;

public class LeftRotate {
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      System.out.println("enter the size of array");
      int n=sc.nextInt();
      System.out.println("enter the elements in array");
      int[] arr=new int[n];
      for(int i=0;i<n;i++) {
    	  arr[i]=sc.nextInt();
      }
      int k=3;
      //Rotate array by n times towards left
      for(int i=0;i<k;i++) {
    	  int j,first;
    	  first=arr[0];
    	  for(j=0;j<arr.length-1;j++) {
    		  arr[j]=arr[j+1];
    	  }
    	  //first element to be added at the end
    	  arr[j]=first;
      }
      System.out.println();
      System.out.println("array after left rotation");
      for(int i=0;i<arr.length;i++) {
    	  System.out.print(arr[i]+" ");
      }
}
}
