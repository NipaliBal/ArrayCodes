package Arrays;

public class LargeSmall {
public static void main (String[] args) {
	int[] arr= {1,23,11,54,34,61,44};
	int max=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(max<arr[i]) {
			max=arr[i];
		}
	}
	System.out.println(max);	
	int min=arr[0];
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			max=arr[i];
		}
	}
	System.out.println(min);
}
}

