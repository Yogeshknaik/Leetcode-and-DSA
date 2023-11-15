package naveenSir;

public class binarySearch {
	
	public static void main(String args[]) {
		int key=11;
		int arr[]= {1,3,4,5,6,7,8,9,10,11};
		System.out.println(BinarySearch( arr,key));
	}
	
	public static boolean BinarySearch(int arr[],int key) {
	int left=0;
	int right=arr.length-1;
	
	while(left<=right) {
		
		int mid=(left+right)/2;
		
		if(arr[mid]==key) {
			return true;
			}
		
		else if(arr[mid]<key) {
			left= mid+1;
			
		}
		
		else {
			right =mid-1;
		}
		
	}
	
	return false;
	
		
	}

}
