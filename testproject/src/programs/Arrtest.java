package programs;

import java.util.Arrays;

public class Arrtest {
	public void test(int a[]) {
		System.out.println("from method");
		for (int i :a) {
			System.out.println(i);
		}
		
	}
	
	public static void main(String[] args) {
		
		int arr[]= new int[5];
		arr[0]=1;
		arr[1]=5;
		arr[2]=2;
		arr[3]=4;
		arr[4]=2;
		
		for(int i:arr) {
			System.out.println(i);
		}
		Arrtest a = new Arrtest();
		a.test(arr);
		Arrays.sort(arr);
		
			
	}

	

}