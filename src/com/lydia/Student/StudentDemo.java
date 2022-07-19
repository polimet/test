package com.lydia.Student;

import java.util.ArrayList;

public class StudentDemo {

	static final int MIN_AGE = 18;

	public static void main(String[] args) {

		ArrayList<String> list = new ArrayList<>();
		list.add("Nirmal");
		list.add("Mary Gladys");
		list.add("Mary");
		list.add("Lydia1");
		list.add("Priyanka");
		list.add("Neeraja");
		System.out.println("List size -->" + list.size());
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).equals("Mary Gladys")) {

				System.out.println("List contains Mary Gladys");
				break;
			} else {
				System.out.println("List does not contains Mary Gladys");
			}

		}

		Student obj1 = new Student("John", 3, "Fair", "Male", "India", "12-50");
		Student obj2 = new Student("Finny", 3, "Fair", "Male", "USA", "12-50");
		Student obj3 = new Student("Mary", 3, "Fair", "Female", "AUstralia", "12-50");
		Student obj4 = null;

		// Student.status;
		try {
			System.out.println("obj4--->" + obj4);
			obj4.drinking("dring fast");

		} catch (Exception e) {
			e.printStackTrace();
		
		}
		obj1.running("fasting runner");
		obj1.drinking("slow drinker");
		obj1.eating("normal eater");

		obj3.running("slow runner");
		obj3.drinking("faster drinker");
		obj3.eating("normal eater");

		System.out.println("=============================");
		System.out.println("==1 person Properties ===");
		System.out.println("=============================");

		System.out.println("Obj1 - Name  =" + obj1.getName());
		System.out.println("Obj1 - Age  =" + obj1.getAge());
		System.out.println("Obj1 - Color  =" + obj1.getColor());
		System.out.println("Obj1 - Country  =" + obj1.getCountry());
		System.out.println("Obj1 - Address  =" + obj1.getAddress());
		System.out.println("Obj1 - Sex  =" + obj1.getSex());

		System.out.println("=============================");
		System.out.println("==1 person Behaviour or actions  ===");
		System.out.println("=============================");

		System.out.println(obj1.getName() + "  " + obj3.running(" slow run"));

		System.out.println(obj1.getName() + "  " + obj3.drinking("slow drinker"));

		System.out.println(obj1.getName() + "  " + obj3.eating("slow  eat"));

		System.out.println("=============================");
		System.out.println("==2nd person Properties ===");
		System.out.println("=============================");

		System.out.println("Obj2 - Name  =" + obj2.getName());
		System.out.println("Obj2 - Age  =" + obj2.getAge());
		System.out.println("Obj2 - Color  =" + obj2.getColor());
		System.out.println("Obj2 - Country  =" + obj2.getCountry());
		System.out.println("Obj2 - Address  =" + obj2.getAddress());
		System.out.println("Obj2 - Sex  =" + obj2.getSex());
		System.out.println("=============================");
		System.out.println("==2nd person Behaviour or actions  ===");
		System.out.println("=============================");
		System.out.println(obj2.getName() + "  " + obj2.running(" dont run"));

		System.out.println(obj2.getName() + "  " + obj2.drinking("nomral drinker"));

		System.out.println(obj2.getName() + "  " + obj2.eating("dont  eat"));

		System.out.println("=============================");
		System.out.println("==3nd person Properties ===");
		System.out.println("=============================");

		System.out.println("Obj3 - Name  =" + obj3.getName());
		System.out.println("Obj3 - Age  =" + obj3.getAge());
		System.out.println("Obj3 - Color  =" + obj3.getColor());
		System.out.println("Obj3 - Country  =" + obj3.getCountry());
		System.out.println("Obj3 - Address  =" + obj3.getAddress());
		System.out.println("Obj3 - Sex  =" + obj3.getSex());

		System.out.println("=============================");
		System.out.println("==3rd person Behaviour or actions  ===");
		System.out.println("=============================");
		String run1 = obj3.running(" fast run");
		System.out.println(obj3.getName() + "  " + run1);
		String drink = obj3.drinking("fast drinker");
		System.out.println(obj3.getName() + "  " + drink);

		System.out.println(obj3.getName() + "  " + obj3.eating("fast  eat"));

	}

}
