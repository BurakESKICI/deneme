package day27_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C6_ArrayList06 {

	public static void main(String[] args) {
		// Verilen listeyi Array'e nas�l ceviririz?
		
		List<String> list=new ArrayList<>(); 
		list.add("Ali");
		list.add("Veli");
		
		
		String arr[]=list.toArray(new String[0]);
        
		System.out.println(Arrays.toString(arr));
		
		
		
	}

}
