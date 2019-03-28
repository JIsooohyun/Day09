package com.soohyun.mod;

public class MemberMain {

	public static void main(String[] args) {
		Member member = new Member("iu", 20, 96.3, 173.5);  
		member.check();
		//관리 후 
		
		member.setAge(1200);
		int age = member.getAge();
		System.out.println(age);
		
		

	}

}
