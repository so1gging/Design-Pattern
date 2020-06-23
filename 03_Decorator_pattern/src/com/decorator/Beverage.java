package com.decorator;

// Beverage 는 추상클래스이며 getDescription()과 cost()라는 두 개의 메소드가 있다.
// 음료의 공통적인 성질만 따로 뺀 것으로 카페에서 판매하는 모든 음료는 이 클래스를 상속받아야 한다.
public abstract class Beverage {
	String description = "Unknown Beverage"; // 음료 이름
  
	public String getDescription() {
		return description;
	}
 
	public abstract double cost();
	// cost()는 서브클래스에서 구현해야 한다.
}
