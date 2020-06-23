package com.decorator;

public class Espresso extends Beverage {
  
	public Espresso() {
		description = "Espresso"; // 클래스 생성자 부분에서 descrition변수의 값을 설정한다.
		// description 변수는 Beverage로부터 상속받은 것이다.
	}
  
	public double cost() {
		return 1.99; 
	}
}

