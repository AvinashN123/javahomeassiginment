package com.technoelevate.encapsulation.assiginment;

class TechnoElevate {

	private String name;
	private int employeeId;
	private String time;

	public TechnoElevate(String name, int employeeId, String time) {
		super();
		this.name = name;
		this.employeeId = employeeId;
		this.time = time;

	}

	private void topicLearn(String name) {
		System.out.println(name);
	}

	private void empInfo() {

		System.out.println("Name " + name);
		System.out.println("Employee Id " + employeeId);
		System.out.println("Time " + time);
	}

	public static void main(String[] args) {

		TechnoElevate elevate = new TechnoElevate("Avi", 1234, " Time In-9.00 and Time Out-5.00");
		elevate.topicLearn("Abstarction,Inheritance");
		elevate.empInfo();

	}

}
