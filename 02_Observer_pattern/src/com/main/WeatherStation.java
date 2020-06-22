package com.main;

import com.javautilobserver.CurrentConditionsDisplay;
import com.javautilobserver.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData(); // [1] 우선 WeatherData객체를 생성한다.
	
		
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData); 


		// [3] 새로운 기상 측정값이 들어온다
		weatherData.setMeasurements(80, 65, 30.4f);
		
		////////////////////////////////////////

	}
}
