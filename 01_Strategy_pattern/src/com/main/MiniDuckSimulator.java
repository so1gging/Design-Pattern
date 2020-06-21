package com.main;

import com.duck.Duck;
import com.duck.MallardDuck;

public class MiniDuckSimulator {

	public static void main(String[] args) {
	
		Duck mallard = new MallardDuck();
		mallard.display();
		mallard.performFly();
		mallard.performQuack();
	}

}
