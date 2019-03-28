package com.soohyun.mobile;

public class Phone {

	String brand;
	int price;
	String color;
	int size;
	
	public Phone() {
		//매개변수가 없는 것을 디폴트 생성자, 빈생성자, 기본생성자 라고 불린다. 
		//클래스내에 생성자가 하나라도 없으면 컴파일러가 디폴트생성자를 하나 만들어준다
		
		this(200);  //생성자내에서 다른 생성자를 호출(인자값으로 구분)
		//메서드내에서 메서드를 호출가능하다.
		
	}
	
	public  Phone(int price) {
		this(price, "RED");
	}
	
	public Phone(int price, String color) {
		this(price, color, 15);
	}
	
	public Phone(int price, String color, int size) {
		this.brand = "LG";
		this.price = price;
		this.color = color;
		this.size = size;
	}
	
	public void info() {
		System.out.println("phone ~~~~~~~~~~~");
		//멤버메서드 
	}

}
