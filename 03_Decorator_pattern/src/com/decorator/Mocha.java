package com.decorator;

// 생성자에서 넘겨받은 Beverage의 인스턴스를 가지고, 현재 인스턴스에 구현되어 있는 객체의 필드와 메소드에 접근
public class Mocha extends CondimentDecorator {
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}
 
	public double cost() {
		return .20 + beverage.cost();
	}
}
