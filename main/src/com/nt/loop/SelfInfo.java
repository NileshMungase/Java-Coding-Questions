package com.nt.programs;

public class SelfInfo {
	String name;
	int age;
	float demoval;
	double demoVal;
	char demoChar;
	long phoneNo;

	public static void main(String[] args) {

		SelfInfo info = new SelfInfo();
		info.name = "Nilesh Mungase";
		info.age = 22;
		info.demoval = 45.45F;
		info.demoVal = 45.12345D;
		info.demoChar = 'N';
		info.phoneNo = 7447847064L;
		System.out.println(info);

	}

	@Override
	public String toString() {
		return "SelfInfo [name=" + name + ", age=" + age + ", demoval=" + demoval + ", demoVal=" + demoVal
				+ ", demoChar=" + demoChar + ", phoneNo=" + phoneNo + "]";
	}

}
