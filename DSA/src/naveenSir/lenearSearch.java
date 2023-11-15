package naveenSir;

public class lenearSearch {

	public static void main (String args[]) {
		int key=0;
		int arr[]= {1,3,4,5,6,7,8,9};
		System.out.println( LinearSearch(arr,key));
	}
	
	public static boolean LinearSearch(int arr[],int key) {
	for(int ele: arr) {
		if(ele==key) return  true;
	}
		return false;
	}
}
