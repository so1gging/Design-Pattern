package com.decorator;

// 모든 첨가물이 상속받아야 하는 클래스
// Berverage 객체가 들어갈 자리에 들어갈 수 있어야 하므로 Beverage 클래스를 확장해야 한다.
public abstract class CondimentDecorator extends Beverage {
	Beverage beverage;
	public abstract String getDescription(); // 모든 첨가물 데코레이터에서 getDescription()메소드를 새로 구현하도록 만들 계획이다.
}
