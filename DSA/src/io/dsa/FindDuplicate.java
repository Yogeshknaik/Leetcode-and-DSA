package io.dsa;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicate {
public static void main(String args[]) {
	int [] num = {1,2,3,2,1};
	System.out.println(CheckDublicate(num));
}
	
public static boolean CheckDublicate(int[] numbers) {
	Set<Integer> set = new HashSet<Integer>();
	for(int num :numbers ) {
	if(set.contains(num)) {
		return true;
	}
	set.add(num);
}
return false;
}
}

