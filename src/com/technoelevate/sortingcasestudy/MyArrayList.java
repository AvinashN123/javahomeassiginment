package com.technoelevate.sortingcasestudy;



import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class MyArrayList{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Student> arrayList = new ArrayList<Student>();// (String name, int id, int marks, long mobNo, char gender, int
														// age)
		arrayList.add(new Student("avi", 123, 56, 8871109125L, 'M', 24));
		arrayList.add(new Student("megha", 152, 76, 8871109125L, 'F', 25));
		arrayList.add(new Student("manu", 163, 67, 9131395513L, 'M', 26));
		arrayList.add(new Student("manju", 184, 87, 8871656564L, 'M', 27));
		arrayList.add(new Student("parag", 124, 92, 8871146367L, 'F', 22));
		arrayList.add(new Student("sagar", 176, 42, 8871106465L, 'F', 21));
		arrayList.add(new Student("megha", 107, 75, 8845734564L, 'T', 20));
		arrayList.add(new Student("Pranshu", 198, 32, 8834643546L, 'F', 192));
		boolean choice=true;
		while(choice) {
			System.out.println("1.Press 1 to sort by Id\n2.Press 2 to sort by Name\n3.Press 3 to sort by Marks\n4.Press 4 to sort by mobileNumber");
			System.out.println("Enter your choice!!!");
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				Collections.sort(arrayList, new StudentComparableId());
				System.out.println("Id\t\tName\t\tMarks\t\tPhone\t\tGender\t\tAge");
				for (Student student : arrayList) {
					System.out.println(student.getId()+"\t\t"+student.getName()+ "\t\t"+student.getMarks()+"\t\t"+student.getMobNo()+"\t\t"+student.getGender()+"\t\t"+student.getAge());				
				}
				System.out.println("You want to contonue or exceess\n1.Y\n2.Exit");
				System.out.println("enter your choice");
				int ch1 = sc.nextInt();
				 if(ch1==1)
					 choice=true;
				 else
					 System.exit(0);	
				break;
			case 2:
				Collections.sort(arrayList, new StudentComparableName());
				for (Student student : arrayList) {
					System.out.println(student.getId()+"	"+student.getName()+ "	"+student.getMarks()+"	"+student.getMobNo()+"	"+student.getGender()+"	"+student.getAge());	
				}
				System.out.println("You want to contonue or exceess\n1.Y\n2.Exit");
				System.out.println("enter your choice");
				int ch2 = sc.nextInt();
				 if(ch2==1)
					 choice=true;
				 else
					 System.exit(0);
				break;
			case 3:
				Collections.sort(arrayList, new StudentComparableMarks());
				for (Student student : arrayList) {
					System.out.println(student.getId()+"	"+student.getName()+ "	"+student.getMarks()+"	"+student.getMobNo()+"	"+student.getGender()+"	"+student.getAge());	
				}
				System.out.println("You want to contonue or exceess\n1.Y\n2.Exit");
				System.out.println("enter your choice");
				int ch3 = sc.nextInt();
				 if(ch3==1)
					 choice=true;
				 else
					 System.exit(0);
				break;
			case 4:
				Collections.sort(arrayList, new StudentComparableMob());
				for (Student student : arrayList) {
					System.out.println(student.getId()+"	"+student.getName()+ "	"+student.getMarks()+"	"+student.getMobNo()+"	"+student.getGender()+"	"+student.getAge());	
				}
				System.out.println("You want to contonue or exceess\n1.Y\n2.Exit");
				System.out.println("enter your choice");
				int ch4 = sc.nextInt();
				 if(ch4==1)
					 choice=true;
				 else
					 System.exit(0);
				break;
			      
				
			 
			}
		}
		
		
		
		
	}

}

