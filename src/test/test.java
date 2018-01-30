package test;

import java.util.List;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class test {

	public static void main(String[] args) {
		String str = "LG CNS VCC Phase I";
		System.out.println(str.substring(8,11));
		System.out.println(str.indexOf("P"));
		System.out.println(str.charAt(12));
		
		
		System.out.println(Math.ceil(3.14));
		System.out.println(Math.floor(1.445));
		System.out.println(Math.round(5.63));
		
		int[] numbers = {1,2,3,4,5};
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		for(Object str3 : list) {
			System.out.println(str3);
		}
		String str2 = "A,B,C";
		StringTokenizer st = new StringTokenizer(str2,",");
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
		
	}

}
