package com.main;

import com.display.CurrentConditionsDisplay;
import com.display.ForecastDisplay;
import com.display.StatisticsDisplay;
import com.subject.WeatherData;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData(); // [1] 우선 WeatherData객체를 생성한다.
	
		// [2] 세 개의 디스플레이를 생성하면서 WeatherData객체를 인자로 전달.
		CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherData); 
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
		/*		내부에서는..
		 * 		this.weatherData = weatherData;
		 *		weatherData.registerObserver(this);
		 * 		weatherDate클래스 내부의 List에 해당 Observer(여기서는 Display)가 추가된다.
		 * */

		// [3] 새로운 기상 측정값이 들어온다
		weatherData.setMeasurements(80, 65, 30.4f);
		weatherData.setMeasurements(82, 70, 29.2f);
		weatherData.setMeasurements(78, 90, 29.2f);
	
	}
}
