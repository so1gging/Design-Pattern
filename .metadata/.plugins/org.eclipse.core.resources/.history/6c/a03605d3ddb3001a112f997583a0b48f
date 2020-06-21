package com.duck;

import com.behavior.FlyBehavior;
import com.quack.QuackBehavior;

public abstract class Duck {
	FlyBehavior flyBejavior;
	QuackBehavior quackBehavior;
	// 행동 인터페이스 형식의 레퍼런스 변수 두 개를 선언한다.
	
	public abstract void display();
	
	// 행동 클래스에 위임한다.
	public void performFly() {
		flyBejavior.fly();
	}
	
	public void performQuack() {
		quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("모든 오리는 물에 뜹니다. 가짜 오리도 뜨죠.");
	}
}
