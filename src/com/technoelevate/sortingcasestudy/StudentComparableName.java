package com.technoelevate.sortingcasestudy;




import java.util.Comparator;

public class StudentComparableName implements Comparator<Student>{

	@Override
	public int compare(Student o1, Student o2) {
		Student student=(Student)o1;
		Student student2=(Student)o2;
		return student.getName().compareTo(student2.getName());
	}
}