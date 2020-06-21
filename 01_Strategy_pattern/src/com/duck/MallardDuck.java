package com.duck;

import com.behavior.FlyWithWings;
import com.quack.Quack;

public class MallardDuck extends Duck{

	public MallardDuck() {
		quackBehavior = new Quack();
		flyBejavior = new FlyWithWings();
	}

	@Override
	public void display() {
		System.out.println("저는 물오리입니다.");
		
	}

}
