package com.practice.test;
import java.util.*;

public class GetCarInfo {
	public static void main(String[] args) {
		Car  c = new Car(111,"Ford");
		Car c1 = new Car(222, "Ferrari");
		Models m1=new Models("Ferrari", "utilization of race technology in their street cars.");
		Models m2 = new Models("Ford", "Ford offers safety features");
		Models m3 = new Models("Mercedes-Benz" , "It has a lot of features, which is really awesome");
		HashMap<Integer, Car> details = new HashMap<>();
		details.put(1, c);
		details.put(2, c1);
		
		HashMap<Integer, Models> details1 = new HashMap<>();
		details1.put(3, m1);
		details1.put(4, m2);
		details1.put(5, m3);

		List<Map> list = new ArrayList<>();
		list.add(details);
		list.add(details1);
		Iterator itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(list.addAll(list));
	}
}
