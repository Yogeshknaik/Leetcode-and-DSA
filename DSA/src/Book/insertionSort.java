package Book;

public class insertionSort {
public static void main(String args[]) {
	char [] a = {'h','j','k','e','t','y'};
	insertSort(a);
}
// data{h,j,k,e,t,y}
public static void insertSort(char[] data) {
for(int k=1; k<data.length; k++) {
	
	char cur =data[k];
	int j=k;
	while(j>0 && data[j-1]>cur) {
		
	data[j]=data[j-1];
	j--;
	}
	
	data[j]=cur;
}
System.out.println(data);
}

}
