package com.javautilobserver;


import java.util.Observable;
import java.util.Observer;

import com.display.DisplayElement;
	
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	Observable observable;
	private float temperature;
	private float humidity;
	
	// Observable를 인자로 받아 그 레퍼런스를 써서 옵저버를 등록한다.
	public CurrentConditionsDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this); // 옵저버 등록
	}
	
	// Observable과 추가 데이터 인자를 모두 받아들인다.
	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData)obs;
			this.temperature = weatherData.getTemperature();
			this.humidity = weatherData.getHumidity();
			display();
		}
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
