package com.JavaPrograms;

import java.util.HashSet;
import java.util.Set;

public class CommonNumbers {
public static void main(String[] args) {
	
	int[] array1= {2,5,4,6,2,5};
	int[] array2= {5,6,5,7,9,1,4};
	
	Set<Integer> commonNum=findcommonNum(array1,array2);
	System.out.println("common numbers are: "+commonNum);
}

public static Set<Integer> findcommonNum(int[] array1, int[] array2) {
	Set<Integer> set=new HashSet<Integer>();
	Set<Integer> commonnum = new HashSet<Integer>();
	for(int num:array1) {
		set.add(num);
	}
	
	for(int num:array2) {
		if(set.contains(num)) {
			commonnum.add(num);
		}
	}
	return set;
}
}
