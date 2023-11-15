package io.dsa;

public class Anagram {

public static void main(String args[]) {
	System.out.println( isAnagram("anagram","nagaram"));
	
}

public static  boolean isAnagram(String s, String t) {
	 if (s.length()!=t.length()) return false;
	 
	 int arr[]=new int[50];
	for(int i=0; i<s.length(); i++) {
			arr[s.charAt(i)-'a']++;
			arr[t.charAt(i)-'a']--;
			
		}
	
		for(int i: arr) {
			
		if(arr[i]!=0) return false;
		
		}	
		return true;
	
		
	}
	

}
