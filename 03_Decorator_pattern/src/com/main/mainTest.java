package com.main;

import com.decorator.Beverage;
import com.decorator.Espresso;
import com.decorator.Mocha;
import com.decorator.Whip;

public class mainTest {
	public static void main(String[] args) {
		 Beverage beverage = new Espresso();
		 System.out.println(beverage.getDescription()+", "+beverage.cost());
		 
	     beverage = new Mocha(beverage); 
	     beverage = new Mocha(beverage); 
	     beverage = new Whip(beverage); 
	        
	     System.out.println("메뉴 : " + beverage.getDescription());
	     System.out.println("가격 : " + beverage.cost());
	}
}
