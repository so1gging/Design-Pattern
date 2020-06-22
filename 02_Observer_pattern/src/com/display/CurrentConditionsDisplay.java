package com.display;

import com.observer.Observer;
import com.subject.WeatherData;

// 변경사항을 받기 위해 Observer를 구현, API구조 상 모든 디스플레이 항목에 DisplayElement를 구현하기로 했기 때문에 DisplayElement도 구현.
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private WeatherData weatherData;
	
	// 생성자에 weatherDate라는 주제 객체가 전달되며, 그 객체를 써서 디스플레이를 옵저버로 등록한다.
	public CurrentConditionsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}
	
	public void update(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	
	public void display() {
		System.out.println("Current conditions: " + temperature 
			+ "F degrees and " + humidity + "% humidity");
	}
}
