package com.soohyun.mod;

public class Member {
	//모든 변수는 private로 선언

	private String name;
	private int age;
	private double muge;
	private double ki;
	//모든 멤버변수는 
	
	//생성자 만들기
	//디폴트 생성자
	//회원정보를 매개변수로 받는 생성자
	

	public Member(){

	}

	public Member(String name, int age, double muge, double ki) {
		if(age>0 && age<120) {
			this.age = age;
		}else {
			this.age = 25; //기본값으로 넣어준다
		}
		this.name = name;
		this.age = age;
		this.muge = muge;
		this.ki = ki;
	}


	public void setAge(int age) {  //setter메서드
		if(age>0 && age<120) {
			this.age = age;
		} else {
			this.age = 25;
		}

	}

	public int getAge() {
		if(age<0 || age>130) {  //getter메서드
			this.age = 25;
		}
		return this.age;
	}


	public void check() {
		//자기키 - 100한 결과물에 *0.95
		//결과물이 자기 몸무게보다 작다면 비만출력
		//결과물이 자기 몸무게보다 크다면 저체중출력
		// 같다면 표준출력

		double bgm = (this.ki-100)*0.95;
		if(bgm<this.muge) {
			System.out.println("비만");
		}else if(bgm>this.muge) {
			System.out.println("저체중");
		}else {
			System.out.println("표준");
		}

	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMuge() {
		return muge;
	}

	public void setMuge(double muge) {
		this.muge = muge;
	}

	public double getKi() {
		return ki;
	}

	public void setKi(double ki) {
		this.ki = ki;
	}
}
